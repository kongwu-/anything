package cc.leevi.anything.model;

import java.io.Serializable;

/**
 * @author 
 */
public class PlanData implements Serializable {
    private Integer id;

    private String source;

    private String title;

    /**
     * 计划id
     */
    private Integer planId;

    /**
     * 抓取结果
     */
    private String content;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPlanId() {
        return planId;
    }

    public void setPlanId(Integer planId) {
        this.planId = planId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}