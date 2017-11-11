package cc.leevi.anything.web;

import cc.leevi.christ.autoconfigure.QiniuProperties;
import cc.leevi.christ.rest.response.Response;
import cc.leevi.christ.util.QiniuHelper;
import com.alibaba.fastjson.JSON;
import com.github.kevinsawicki.http.HttpRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
public class DataController {

    @Autowired
    private QiniuHelper qiniuHelper;

    @Value("${app.data-key}")
    private String dataKey;

    @Autowired
    private QiniuProperties qiniuProperties;

    @GetMapping(value = "data")
    public Response data(){
        System.out.println(String.format(qiniuProperties.getPrefix()+qiniuProperties.getPath()+dataKey+"?_=%s",String.valueOf(new Date().getTime())));
        String body = HttpRequest.get(String.format(qiniuProperties.getPrefix()+qiniuProperties.getPath()+dataKey+"?_=%s",String.valueOf(new Date().getTime()))).body();
        Object data = JSON.parseArray(body);
        return new Response(data);
    }

    @PostMapping(value = "save")
    public Response save(@RequestBody List<Map> data){
        String key = dataKey;
        qiniuHelper.delete(key);
        qiniuHelper.upload(JSON.toJSONBytes(data),key);
        return new Response(data);
    }
}
