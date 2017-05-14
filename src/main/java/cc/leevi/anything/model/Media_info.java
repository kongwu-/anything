package cc.leevi.anything.model;

/**
 * Created by jiang on 2017-05-03.
 */
public class Media_info {
    private long user_id;

    private String verified_content;

    private String avatar_url;

    private long media_id;

    private String name;

    private int recommend_type;

    private boolean follow;

    private String recommend_reason;

    private boolean is_star_user;

    private boolean user_verified;

    public void setUser_id(long user_id){
        this.user_id = user_id;
    }
    public long getUser_id(){
        return this.user_id;
    }
    public void setVerified_content(String verified_content){
        this.verified_content = verified_content;
    }
    public String getVerified_content(){
        return this.verified_content;
    }
    public void setAvatar_url(String avatar_url){
        this.avatar_url = avatar_url;
    }
    public String getAvatar_url(){
        return this.avatar_url;
    }
    public void setMedia_id(long media_id){
        this.media_id = media_id;
    }
    public long getMedia_id(){
        return this.media_id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setRecommend_type(int recommend_type){
        this.recommend_type = recommend_type;
    }
    public int getRecommend_type(){
        return this.recommend_type;
    }
    public void setFollow(boolean follow){
        this.follow = follow;
    }
    public boolean getFollow(){
        return this.follow;
    }
    public void setRecommend_reason(String recommend_reason){
        this.recommend_reason = recommend_reason;
    }
    public String getRecommend_reason(){
        return this.recommend_reason;
    }
    public void setIs_star_user(boolean is_star_user){
        this.is_star_user = is_star_user;
    }
    public boolean getIs_star_user(){
        return this.is_star_user;
    }
    public void setUser_verified(boolean user_verified){
        this.user_verified = user_verified;
    }
    public boolean getUser_verified(){
        return this.user_verified;
    }
}
