//package cc.leevi.anything.mapper;
//
//import cc.leevi.anything.model.PlanData;
//import cc.leevi.anything.model.PlanDataExample;
//import java.util.List;
//
//import cc.leevi.anything.rest.response.PlanDataResponse;
//import org.apache.ibatis.annotations.Mapper;
//import org.apache.ibatis.annotations.Param;
////@Mapper
//public interface PlanDataMapper {
//    long countByExample(PlanDataExample example);
//
//    int deleteByExample(PlanDataExample example);
//
//    int deleteByPrimaryKey(Integer id);
//
//    int insert(PlanData record);
//
//    int insertSelective(PlanData record);
//
//    List<PlanData> selectByExample(PlanDataExample example);
//
//    PlanData selectByPrimaryKey(Integer id);
//
//    int updateByExampleSelective(@Param("record") PlanData record, @Param("example") PlanDataExample example);
//
//    int updateByExample(@Param("record") PlanData record, @Param("example") PlanDataExample example);
//
//    int updateByPrimaryKeySelective(PlanData record);
//
//    int updateByPrimaryKey(PlanData record);
//
//    List<PlanDataResponse> selectDataListByPlanId(Integer planId);
//}