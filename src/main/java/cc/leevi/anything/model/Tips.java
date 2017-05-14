package cc.leevi.anything.model;

/**
 * Created by jiang on 2017-05-03.
 */
public class Tips {
    private String display_info;

    private String open_url;

    private String web_url;

    private String app_name;

    private String package_name;

    private String display_template;

    private String type;

    private int display_duration;

    private String download_url;

    public void setDisplay_info(String display_info){
        this.display_info = display_info;
    }
    public String getDisplay_info(){
        return this.display_info;
    }
    public void setOpen_url(String open_url){
        this.open_url = open_url;
    }
    public String getOpen_url(){
        return this.open_url;
    }
    public void setWeb_url(String web_url){
        this.web_url = web_url;
    }
    public String getWeb_url(){
        return this.web_url;
    }
    public void setApp_name(String app_name){
        this.app_name = app_name;
    }
    public String getApp_name(){
        return this.app_name;
    }
    public void setPackage_name(String package_name){
        this.package_name = package_name;
    }
    public String getPackage_name(){
        return this.package_name;
    }
    public void setDisplay_template(String display_template){
        this.display_template = display_template;
    }
    public String getDisplay_template(){
        return this.display_template;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return this.type;
    }
    public void setDisplay_duration(int display_duration){
        this.display_duration = display_duration;
    }
    public int getDisplay_duration(){
        return this.display_duration;
    }
    public void setDownload_url(String download_url){
        this.download_url = download_url;
    }
    public String getDownload_url(){
        return this.download_url;
    }
}
