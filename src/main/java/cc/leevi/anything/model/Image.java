package cc.leevi.anything.model;

import java.util.List;

public class Image {
    private String url;

    private int width;

    private List<Url_list> url_list ;

    private String uri;

    private int height;

    public void setUrl(String url){
        this.url = url;
    }
    public String getUrl(){
        return this.url;
    }
    public void setWidth(int width){
        this.width = width;
    }
    public int getWidth(){
        return this.width;
    }
    public void setUrl_list(List<Url_list> url_list){
        this.url_list = url_list;
    }
    public List<Url_list> getUrl_list(){
        return this.url_list;
    }
    public void setUri(String uri){
        this.uri = uri;
    }
    public String getUri(){
        return this.uri;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public int getHeight(){
        return this.height;
    }

}