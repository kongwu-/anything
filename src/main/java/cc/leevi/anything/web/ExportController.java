package cc.leevi.anything.web;

import cc.leevi.anything.rest.request.VivoDayData;
import cc.leevi.anything.rest.request.VivoRequest;
import cc.leevi.anything.rest.response.Response;
import cc.leevi.anything.service.ExportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by jiang on 2017-06-13.
 */
@RestController
@RequestMapping("export")
public class ExportController {

    @Autowired
    private ExportService exportService;

    @PostMapping("vivoDayData")
    public Response vivoDayData(@RequestBody List<VivoDayData> vivoDayDataList){
        String url = exportService.vivoDayData(vivoDayDataList);
        Response response = new Response();
        response.setData(url);
        return response;
    }


}
