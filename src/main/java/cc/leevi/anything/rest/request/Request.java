package cc.leevi.anything.rest.request;

/**
 * Created by jiang on 2017-04-22.
 */
public class Request {
    private Integer page;
    private Integer size = 10;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getOffset(){
        return (page-1)*size;
    }
}
