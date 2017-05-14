package cc.leevi.anything.exception;

import cc.leevi.anything.rest.response.Code;

/**
 * 自定义异常
 * Created by jiang on 2017-04-22.
 */
public class AppException extends RuntimeException {

    /**
     * 返回码
     */
    private Code code;

    public AppException() {

    }

    public AppException(String message) {
        super(message);
    }

    public AppException(Code code) {
        super(code.getMsg());
        this.code = code;
    }

    public Code getCode() {
        return code;
    }

    public void setCode(Code code) {
        this.code = code;
    }
}
