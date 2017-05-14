package cc.leevi.anything.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jiang on 2017-05-06.
 */
@Controller
public class IndexController {
    @RequestMapping(value = "")
    public String index(){
        return "index";
    }
}
