package cc.leevi.anything.service;

import cc.leevi.anything.exception.AppException;
import cc.leevi.anything.rest.request.VivoDayData;
import cc.leevi.anything.util.POIExcelExport;
import cc.leevi.anything.util.QiniuHelper;
import cc.leevi.anything.util.StringUtils;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

/**
 * Created by jiang on 2017-06-13.
 */
@Service
public class ExportService {

    @Autowired
    private QiniuHelper qiniuHelper;

    public String vivoDayData(List<VivoDayData> vivoDayDataList) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try{
            POIExcelExport poiExcelExport = new POIExcelExport();
            if(CollectionUtils.isNotEmpty(vivoDayDataList)){
                if(StringUtils.isNotEmpty(vivoDayDataList.get(0).getTitle())){
                    String titleColumn[] = {"plan","ad","title","images","date","downloadCount","showCount","clickCount","clickRate","clickPrice","spent"};
                    String titleName[] = {"所在计划","广告","标题","图片","日期","下载量","曝光量","点击量","点击率","点击单价","总花费"};
                    poiExcelExport.wirteExcel(titleColumn,titleName,vivoDayDataList,baos);
                }else{
                    String titleColumn[] = {"plan","ad","date","downloadCount","showCount","clickCount","clickRate","clickPrice","spent"};
                    String titleName[] = {"所在计划","广告","日期","下载量","曝光量","点击量","点击率","点击单价","总花费"};
                    poiExcelExport.wirteExcel(titleColumn,titleName,vivoDayDataList,baos);
                }
                String url = qiniuHelper.uploadExcel(baos.toByteArray());
                return url;
            }else{
                throw new AppException("来点数据再导出吧");
            }
        }finally {
            try {
                baos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
