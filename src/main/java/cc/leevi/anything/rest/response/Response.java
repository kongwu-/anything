package cc.leevi.anything.rest.response;

import java.io.Serializable;

/**
 * response 返回
 *
 * Created by jiang on 2017-04-22.
 */
public class Response<T> implements Serializable{
    private T data;
    private String msg;
    private Integer code;

    public Response() {
        this.msg = CodeMapping.SUCCESS.getMsg();
        this.code = CodeMapping.SUCCESS.getCode();
    }
    public Response(T data) {
        this.msg = CodeMapping.SUCCESS.getMsg();
        this.code = CodeMapping.SUCCESS.getCode();
        this.data = data;
    }
    public static Response error(){
        Response response = new Response();
        response.setMsg(CodeMapping.ERROR.getMsg());
        response.setCode(CodeMapping.ERROR.getCode());
        return response;
    }

    public static Response fail(){
        Response response = new Response();
        response.setMsg(CodeMapping.FAIL.getMsg());
        response.setCode(CodeMapping.FAIL.getCode());
        return response;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
