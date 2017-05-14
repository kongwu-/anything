package cc.leevi.anything.model;

/**
 * Created by jiang on 2017-05-03.
 */
public class Video_detail_info {
    private int group_flags;

    private int video_type;

    private int video_preloading_flag;

//    private List<Video_url> video_url ;

    private int direct_play;

    private Detail_video_large_image detail_video_large_image;

    private int show_pgc_subscribe;

    private String video_third_monitor_url;

    private String video_id;

    private int video_watching_count;

    private int video_watch_count;

    public void setGroup_flags(int group_flags){
        this.group_flags = group_flags;
    }
    public int getGroup_flags(){
        return this.group_flags;
    }
    public void setVideo_type(int video_type){
        this.video_type = video_type;
    }
    public int getVideo_type(){
        return this.video_type;
    }
    public void setVideo_preloading_flag(int video_preloading_flag){
        this.video_preloading_flag = video_preloading_flag;
    }
    public int getVideo_preloading_flag(){
        return this.video_preloading_flag;
    }
//    public void setVideo_url(List<Video_url> video_url){
//        this.video_url = video_url;
//    }
//    public List<Video_url> getVideo_url(){
//        return this.video_url;
//    }
    public void setDirect_play(int direct_play){
        this.direct_play = direct_play;
    }
    public int getDirect_play(){
        return this.direct_play;
    }
    public void setDetail_video_large_image(Detail_video_large_image detail_video_large_image){
        this.detail_video_large_image = detail_video_large_image;
    }
    public Detail_video_large_image getDetail_video_large_image(){
        return this.detail_video_large_image;
    }
    public void setShow_pgc_subscribe(int show_pgc_subscribe){
        this.show_pgc_subscribe = show_pgc_subscribe;
    }
    public int getShow_pgc_subscribe(){
        return this.show_pgc_subscribe;
    }
    public void setVideo_third_monitor_url(String video_third_monitor_url){
        this.video_third_monitor_url = video_third_monitor_url;
    }
    public String getVideo_third_monitor_url(){
        return this.video_third_monitor_url;
    }
    public void setVideo_id(String video_id){
        this.video_id = video_id;
    }
    public String getVideo_id(){
        return this.video_id;
    }
    public void setVideo_watching_count(int video_watching_count){
        this.video_watching_count = video_watching_count;
    }
    public int getVideo_watching_count(){
        return this.video_watching_count;
    }
    public void setVideo_watch_count(int video_watch_count){
        this.video_watch_count = video_watch_count;
    }
    public int getVideo_watch_count(){
        return this.video_watch_count;
    }
}
