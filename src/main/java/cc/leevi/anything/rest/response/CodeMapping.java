package cc.leevi.anything.rest.response;

/**
 * 返回信息定义
 * Created by jiang on 2017-04-23.
 */
public class CodeMapping {
    /**
     * 成功
     */
    public static final Code SUCCESS = new Code(0,"成功");
    /**
     * 失败
     */
    public static final Code FAIL = new Code(-1,"失败");
    /**
     * 错误
     */
    public static final Code ERROR = new Code(-2,"错误");
    /**
     * 参数非法
     */
    public static final Integer PARAMETER_ILLEGAL = 1001;
    /**
     * 用户不存在
     */
    public static final Integer USER_NOT_EXISTS = 2001;
    /**
     * 密码错误
     */
    public static final Integer PASSWORD_ERROR = 2002;
    /**
     * 用户被禁用
     */
    public static final Integer USER_DISABLED = 2003;
}
