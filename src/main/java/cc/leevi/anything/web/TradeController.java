package cc.leevi.anything.web;

import cc.leevi.anything.autoconfigure.QiniuProperties;
import cc.leevi.anything.rest.response.Response;
import cc.leevi.anything.util.QiniuHelper;
import com.alibaba.fastjson.JSON;
import com.github.kevinsawicki.http.HttpRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("trade")
@CrossOrigin
public class TradeController {

    @Autowired
    private QiniuHelper qiniuHelper;

    @Value("${app.data-key.trade}")
    private String dataKey;

    @Autowired
    private QiniuProperties qiniuProperties;

    private Logger logger =  LoggerFactory.getLogger(this.getClass());

    @GetMapping(value = "data")
    public Response data(){
        String body = HttpRequest.get(String.format(qiniuProperties.getPrefix()+dataKey+"?_=%s",String.valueOf(new Date().getTime()))).body();
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
