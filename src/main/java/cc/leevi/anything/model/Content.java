package cc.leevi.anything.model;

import java.util.List;

/**
 * Created by jiang on 2017-05-03.
 */
public class Content {
    private int read_count;

    private String media_name;

    private int ban_comment;


    private String download_url;

    private String app_name;

    private String label;

    private List<Image_list> image_list ;

    private boolean has_video;

    private int article_type;

    private String tag;

    private int has_m3u8_video;

    private String keywords;

    private String rid;

    private boolean show_portrait_article;

    private int user_verified;

    private int aggr_type;

    private int cell_type;

    private int article_sub_type;

    private int bury_count;

    private String title;

    private int ignore_web_transform;

    private int source_icon_style;

    private int tip;

    private int hot;

    private String share_url;

    private int has_mp4_video;

    private String source;

    private int comment_count;

    private String article_url;

    private List<Filter_words> filter_words ;

    private int share_count;

    private int publish_time;

    private List<Action_list> action_list ;

    private int gallary_image_count;

    private int cell_layout_style;

    private long tag_id;

    private int video_style;

    private String verified_content;

    private String display_url;

    private List<Large_image_list> large_image_list ;

    private long item_id;

    private boolean is_subject;

    private boolean show_portrait;

    private int repin_count;

    private int cell_flag;

    private User_info user_info;

    private String source_open_url;

    private int level;

    private int digg_count;

    private int behot_time;

    private long cursor;

    private String url;

    private int preload_web;

    private int user_repin;

    private boolean has_image;

    private int item_version;

    private Media_info media_info;

    private long group_id;

    private Middle_image middle_image;
    private Image image;

    public void setRead_count(int read_count){
        this.read_count = read_count;
    }
    public int getRead_count(){
        return this.read_count;
    }
    public void setMedia_name(String media_name){
        this.media_name = media_name;
    }
    public String getMedia_name(){
        return this.media_name;
    }
    public void setBan_comment(int ban_comment){
        this.ban_comment = ban_comment;
    }
    public int getBan_comment(){
        return this.ban_comment;
    }
    public void setImage_list(List<Image_list> image_list){
        this.image_list = image_list;
    }
    public List<Image_list> getImage_list(){
        return this.image_list;
    }
    public void setHas_video(boolean has_video){
        this.has_video = has_video;
    }
    public boolean getHas_video(){
        return this.has_video;
    }
    public void setArticle_type(int article_type){
        this.article_type = article_type;
    }
    public int getArticle_type(){
        return this.article_type;
    }
    public void setTag(String tag){
        this.tag = tag;
    }
    public String getTag(){
        return this.tag;
    }
    public void setHas_m3u8_video(int has_m3u8_video){
        this.has_m3u8_video = has_m3u8_video;
    }
    public int getHas_m3u8_video(){
        return this.has_m3u8_video;
    }
    public void setKeywords(String keywords){
        this.keywords = keywords;
    }
    public String getKeywords(){
        return this.keywords;
    }
    public void setRid(String rid){
        this.rid = rid;
    }
    public String getRid(){
        return this.rid;
    }
    public void setShow_portrait_article(boolean show_portrait_article){
        this.show_portrait_article = show_portrait_article;
    }
    public boolean getShow_portrait_article(){
        return this.show_portrait_article;
    }
    public void setUser_verified(int user_verified){
        this.user_verified = user_verified;
    }
    public int getUser_verified(){
        return this.user_verified;
    }
    public void setAggr_type(int aggr_type){
        this.aggr_type = aggr_type;
    }
    public int getAggr_type(){
        return this.aggr_type;
    }
    public void setCell_type(int cell_type){
        this.cell_type = cell_type;
    }
    public int getCell_type(){
        return this.cell_type;
    }
    public void setArticle_sub_type(int article_sub_type){
        this.article_sub_type = article_sub_type;
    }
    public int getArticle_sub_type(){
        return this.article_sub_type;
    }
    public void setBury_count(int bury_count){
        this.bury_count = bury_count;
    }
    public int getBury_count(){
        return this.bury_count;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return this.title;
    }
    public void setIgnore_web_transform(int ignore_web_transform){
        this.ignore_web_transform = ignore_web_transform;
    }
    public int getIgnore_web_transform(){
        return this.ignore_web_transform;
    }
    public void setSource_icon_style(int source_icon_style){
        this.source_icon_style = source_icon_style;
    }
    public int getSource_icon_style(){
        return this.source_icon_style;
    }
    public void setTip(int tip){
        this.tip = tip;
    }
    public int getTip(){
        return this.tip;
    }
    public void setHot(int hot){
        this.hot = hot;
    }
    public int getHot(){
        return this.hot;
    }
    public void setShare_url(String share_url){
        this.share_url = share_url;
    }
    public String getShare_url(){
        return this.share_url;
    }
    public void setHas_mp4_video(int has_mp4_video){
        this.has_mp4_video = has_mp4_video;
    }
    public int getHas_mp4_video(){
        return this.has_mp4_video;
    }
    public void setSource(String source){
        this.source = source;
    }
    public String getSource(){
        return this.source;
    }
    public void setComment_count(int comment_count){
        this.comment_count = comment_count;
    }
    public int getComment_count(){
        return this.comment_count;
    }
    public void setArticle_url(String article_url){
        this.article_url = article_url;
    }
    public String getArticle_url(){
        return this.article_url;
    }
    public void setFilter_words(List<Filter_words> filter_words){
        this.filter_words = filter_words;
    }
    public List<Filter_words> getFilter_words(){
        return this.filter_words;
    }
    public void setShare_count(int share_count){
        this.share_count = share_count;
    }
    public int getShare_count(){
        return this.share_count;
    }
    public void setPublish_time(int publish_time){
        this.publish_time = publish_time;
    }
    public int getPublish_time(){
        return this.publish_time;
    }
    public void setAction_list(List<Action_list> action_list){
        this.action_list = action_list;
    }
    public List<Action_list> getAction_list(){
        return this.action_list;
    }
    public void setGallary_image_count(int gallary_image_count){
        this.gallary_image_count = gallary_image_count;
    }
    public int getGallary_image_count(){
        return this.gallary_image_count;
    }
    public void setCell_layout_style(int cell_layout_style){
        this.cell_layout_style = cell_layout_style;
    }
    public int getCell_layout_style(){
        return this.cell_layout_style;
    }
    public void setTag_id(long tag_id){
        this.tag_id = tag_id;
    }
    public long getTag_id(){
        return this.tag_id;
    }
    public void setVideo_style(int video_style){
        this.video_style = video_style;
    }
    public int getVideo_style(){
        return this.video_style;
    }
    public void setVerified_content(String verified_content){
        this.verified_content = verified_content;
    }
    public String getVerified_content(){
        return this.verified_content;
    }
    public void setDisplay_url(String display_url){
        this.display_url = display_url;
    }
    public String getDisplay_url(){
        return this.display_url;
    }
    public void setLarge_image_list(List<Large_image_list> large_image_list){
        this.large_image_list = large_image_list;
    }
    public List<Large_image_list> getLarge_image_list(){
        return this.large_image_list;
    }
    public void setItem_id(long item_id){
        this.item_id = item_id;
    }
    public long getItem_id(){
        return this.item_id;
    }
    public void setIs_subject(boolean is_subject){
        this.is_subject = is_subject;
    }
    public boolean getIs_subject(){
        return this.is_subject;
    }
    public void setShow_portrait(boolean show_portrait){
        this.show_portrait = show_portrait;
    }
    public boolean getShow_portrait(){
        return this.show_portrait;
    }
    public void setRepin_count(int repin_count){
        this.repin_count = repin_count;
    }
    public int getRepin_count(){
        return this.repin_count;
    }
    public void setCell_flag(int cell_flag){
        this.cell_flag = cell_flag;
    }
    public int getCell_flag(){
        return this.cell_flag;
    }
    public void setUser_info(User_info user_info){
        this.user_info = user_info;
    }
    public User_info getUser_info(){
        return this.user_info;
    }
    public void setSource_open_url(String source_open_url){
        this.source_open_url = source_open_url;
    }
    public String getSource_open_url(){
        return this.source_open_url;
    }
    public void setLevel(int level){
        this.level = level;
    }
    public int getLevel(){
        return this.level;
    }
    public void setDigg_count(int digg_count){
        this.digg_count = digg_count;
    }
    public int getDigg_count(){
        return this.digg_count;
    }
    public void setBehot_time(int behot_time){
        this.behot_time = behot_time;
    }
    public int getBehot_time(){
        return this.behot_time;
    }
    public void setCursor(long cursor){
        this.cursor = cursor;
    }
    public long getCursor(){
        return this.cursor;
    }
    public void setUrl(String url){
        this.url = url;
    }
    public String getUrl(){
        return this.url;
    }
    public void setPreload_web(int preload_web){
        this.preload_web = preload_web;
    }
    public int getPreload_web(){
        return this.preload_web;
    }
    public void setUser_repin(int user_repin){
        this.user_repin = user_repin;
    }
    public int getUser_repin(){
        return this.user_repin;
    }
    public void setHas_image(boolean has_image){
        this.has_image = has_image;
    }
    public boolean getHas_image(){
        return this.has_image;
    }
    public void setItem_version(int item_version){
        this.item_version = item_version;
    }
    public int getItem_version(){
        return this.item_version;
    }
    public void setMedia_info(Media_info media_info){
        this.media_info = media_info;
    }
    public Media_info getMedia_info(){
        return this.media_info;
    }
    public void setGroup_id(long group_id){
        this.group_id = group_id;
    }
    public long getGroup_id(){
        return this.group_id;
    }
    public void setMiddle_image(Middle_image middle_image){
        this.middle_image = middle_image;
    }
    public Middle_image getMiddle_image(){
        return this.middle_image;
    }

    public String getDownload_url() {
        return download_url;
    }

    public void setDownload_url(String download_url) {
        this.download_url = download_url;
    }

    public String getApp_name() {
        return app_name;
    }

    public void setApp_name(String app_name) {
        this.app_name = app_name;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public boolean isHas_video() {
        return has_video;
    }

    public boolean isShow_portrait_article() {
        return show_portrait_article;
    }

    public boolean isIs_subject() {
        return is_subject;
    }

    public boolean isShow_portrait() {
        return show_portrait;
    }

    public boolean isHas_image() {
        return has_image;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
}
