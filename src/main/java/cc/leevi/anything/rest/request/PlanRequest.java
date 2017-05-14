package cc.leevi.anything.rest.request;

import java.util.List;

/**
 * Created by jiang on 2017-05-06.
 */
public class PlanRequest {
    private String name;
    private String source;
    private String description;
    private List<String> keywords;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }
}
