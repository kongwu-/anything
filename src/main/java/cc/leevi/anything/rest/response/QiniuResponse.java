package cc.leevi.anything.rest.response;

/**
 * Created by jiangxin on 2017/6/1.
 */
public class QiniuResponse {
    private String key;
    private String url;

    public QiniuResponse(String key, String url) {
        this.key = key;
        this.url = url;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
