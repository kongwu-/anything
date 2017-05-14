package cc.leevi.anything.service;

import cc.leevi.anything.mapper.PlanDataMapper;
import cc.leevi.anything.mapper.PlanMapper;
import cc.leevi.anything.model.Content;
import cc.leevi.anything.model.Plan;
import cc.leevi.anything.model.PlanDataExample;
import cc.leevi.anything.model.PlanExample;
import cc.leevi.anything.rest.Constant;
import cc.leevi.anything.rest.request.PlanRequest;
import cc.leevi.anything.rest.response.Page;
import cc.leevi.anything.rest.response.PlanDataResponse;
import cc.leevi.anything.util.StringUtils;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * Created by jiang on 2017-04-22.
 */
@Transactional
@Service
public class PlanService {

    @Autowired
    private PlanMapper planMapper;

    @Autowired
    private PlanDataMapper planDataMapper;

    @Transactional(readOnly = true)
    public Page<Plan> planList() {
        PlanExample planExample = new PlanExample();
        PlanExample.Criteria criteria = planExample.createCriteria();
        criteria.andDelFlagEqualTo(false);
        List<Plan> planList = planMapper.selectByExample(planExample);
        planExample.setOrderByClause("create_time desc");
        long total = planMapper.countByExample(planExample);
        return new Page<Plan>(total, planList);
    }

    public int save(PlanRequest planRequest) {
        Plan plan = new Plan();
        plan.setName(planRequest.getName());
        plan.setKeywords(StringUtils.join(planRequest.getKeywords(),","));
        plan.setSource(planRequest.getSource());
        plan.setDescription(planRequest.getDescription());
        plan.setStatus(Constant.PLAN_STATUS_TORUN);
        plan.setDelFlag(false);
        plan.setCreateTime(new Date());
        return planMapper.insertSelective(plan);
    }

    public Plan getPlan(Integer id) {
        return planMapper.selectByPrimaryKey(id);
    }


    public int stop(Integer id) {
        Plan record = new Plan();
        record.setId(id);
        record.setStatus(Constant.PLAN_STATUS_TOSTOP);
        return planMapper.updateByPrimaryKeySelective(record);
    }

    public int start(Integer id) {
        Plan record = new Plan();
        record.setId(id);
        record.setStatus(Constant.PLAN_STATUS_TORUN);
        return planMapper.updateByPrimaryKeySelective(record);
    }

    public int delete(Integer id){
        Plan record = new Plan();
        record.setId(id);
        record.setStatus(Constant.PLAN_STATUS_TOSTOP);
        record.setDelFlag(true);
        return planMapper.updateByPrimaryKeySelective(record);
    }

    public Page<PlanDataResponse> planDataList(Integer planId) {
        PlanDataExample planDataExample = new PlanDataExample();
        PlanDataExample.Criteria criteria = planDataExample.createCriteria();
        if(planId!=-1){
            criteria.andPlanIdEqualTo(planId);
        }
        long total = planDataMapper.countByExample(planDataExample);
        List<PlanDataResponse> planDataList = planDataMapper.selectDataListByPlanId(planId);
        for(PlanDataResponse planData : planDataList){
            planData.setContent(JSON.parseObject(planData.getContentJson(),Content.class));
        }
        return new Page<PlanDataResponse>(total, planDataList);
    }
}
