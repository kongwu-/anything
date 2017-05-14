package cc.leevi.anything.model;

/**
 * Created by jiang on 2017-05-03.
 */
public class Action_list {
    private int action;

    private Extra extra;

    private String desc;

    public void setAction(int action){
        this.action = action;
    }
    public int getAction(){
        return this.action;
    }
    public void setExtra(Extra extra){
        this.extra = extra;
    }
    public Extra getExtra(){
        return this.extra;
    }
    public void setDesc(String desc){
        this.desc = desc;
    }
    public String getDesc(){
        return this.desc;
    }

}
