package cc.leevi.anything.rest.response;

/**
 * 返回信息
 * Created by jiang on 2017-04-23.
 */
public class Code {
    private Integer code;
    private String msg;

    public Code(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
