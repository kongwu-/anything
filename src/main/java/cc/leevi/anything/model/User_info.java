package cc.leevi.anything.model;

/**
 * Created by jiang on 2017-05-03.
 */
public class User_info {
    private String verified_content;

    private String avatar_url;

    private long user_id;

    private String name;

    private int follower_count;

    private boolean follow;

    private String user_auth_info;

    private boolean user_verified;

    private String description;

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
    public void setUser_id(long user_id){
        this.user_id = user_id;
    }
    public long getUser_id(){
        return this.user_id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setFollower_count(int follower_count){
        this.follower_count = follower_count;
    }
    public int getFollower_count(){
        return this.follower_count;
    }
    public void setFollow(boolean follow){
        this.follow = follow;
    }
    public boolean getFollow(){
        return this.follow;
    }
    public void setUser_auth_info(String user_auth_info){
        this.user_auth_info = user_auth_info;
    }
    public String getUser_auth_info(){
        return this.user_auth_info;
    }
    public void setUser_verified(boolean user_verified){
        this.user_verified = user_verified;
    }
    public boolean getUser_verified(){
        return this.user_verified;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getDescription(){
        return this.description;
    }
}
