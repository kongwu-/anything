package cc.leevi.anything.service;

import cc.leevi.anything.rest.request.VivoDayData;
import cc.leevi.anything.util.POIExcelExport;
import cc.leevi.anything.util.QiniuHelper;
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
            String titleColumn[] = {"plan","ad","date","showCount","clickCount","clickRate","clickPrice","spent"};
            String titleName[] = {"所在计划","广告","日期","曝光量","点击量","点击率","点击单价","总花费"};
            poiExcelExport.wirteExcel(titleColumn,titleName,vivoDayDataList,baos);
            String url = qiniuHelper.uploadExcel(baos.toByteArray());
            return url;
        }finally {
            try {
                baos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
