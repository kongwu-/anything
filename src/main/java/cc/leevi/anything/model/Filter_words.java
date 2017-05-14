package cc.leevi.anything.model;

/**
 * Created by jiang on 2017-05-03.
 */
public class Filter_words {
    private String id;

    private String name;

    private boolean is_selected;

    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setIs_selected(boolean is_selected){
        this.is_selected = is_selected;
    }
    public boolean getIs_selected(){
        return this.is_selected;
    }
}
