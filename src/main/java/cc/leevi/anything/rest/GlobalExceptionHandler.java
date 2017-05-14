package cc.leevi.anything.rest;

import cc.leevi.anything.exception.AppException;
import cc.leevi.anything.rest.response.Response;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by jiang on 2017-04-22.
 */

@ControllerAdvice
//如果返回的为json数据或其它对象，添加该注解
@ResponseBody
public class GlobalExceptionHandler {
    @ExceptionHandler(value=Exception.class)
    public Object exceptionHandler(HttpServletRequest request,
                                   Exception exception) throws Exception
    {
        exception.printStackTrace();
        return Response.error();
    }

    @ExceptionHandler(value=AppException.class)
    public Object appExceptionHandler(HttpServletRequest request,
                                   AppException exception) throws Exception
    {
        return Response.error();
    }
}