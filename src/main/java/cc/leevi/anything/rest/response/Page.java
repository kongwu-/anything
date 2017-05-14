package cc.leevi.anything.rest.response;

import java.util.List;

/**
 * 分页bean
 * Created by jiang on 2017-04-22.
 */
public class Page<T> {
    /**
     * 总数
     */
    private long total;
    /**
     * 数据集合
     */
    private List<T> row;

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getRow() {
        return row;
    }

    public void setRow(List<T> row) {
        this.row = row;
    }

    public Page(long total, List<T> row) {
        this.total = total;
        this.row = row;
    }
}
