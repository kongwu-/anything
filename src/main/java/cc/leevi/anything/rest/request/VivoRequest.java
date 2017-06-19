package cc.leevi.anything.rest.request;

import java.io.Serializable;
import java.util.List;

/**
 * Created by jiang on 2017-06-18.
 */
public class VivoRequest implements Serializable{
    private boolean switchDetail;
    private List<VivoDayData> dataList;

    public boolean isSwitchDetail() {
        return switchDetail;
    }

    public void setSwitchDetail(boolean switchDetail) {
        this.switchDetail = switchDetail;
    }

    public List<VivoDayData> getDataList() {
        return dataList;
    }

    public void setDataList(List<VivoDayData> dataList) {
        this.dataList = dataList;
    }
}
