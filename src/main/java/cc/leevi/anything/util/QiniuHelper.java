package cc.leevi.anything.util;

import cc.leevi.anything.autoconfigure.QiniuProperties;
import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.util.Auth;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.Executors;

/**
 * Created by jiang on 2017-03-25.
 */
@Component
public class QiniuHelper {

    private Logger logger =  LoggerFactory.getLogger(this.getClass());

    @Autowired
    private QiniuProperties qiniuProperties;

    private Auth auth = null;
    private String upToken = null;
    private Configuration cfg = null;
    private UploadManager uploadManager = null;

    @PostConstruct
    public void init(){
        auth = Auth.create(qiniuProperties.getAccesskey(), qiniuProperties.getSecretkey());
        cfg = new Configuration(Zone.zone0());
        uploadManager = new UploadManager(cfg);
    }




    /**
     * 保存流
     * @param
     * @return
     */
    public String uploadExcel(byte[] bytes) {
        try {
            upToken = auth.uploadToken(qiniuProperties.getBucket());
            String key = getUUID()+".xls";
            String body = uploadManager.put(bytes, key,upToken).bodyString();
            String url = qiniuProperties.getPrefix()+"/"+key;
            logger.info("上传七牛完成，地址为："+url);
            return url;
        }catch (QiniuException e){
            logger.error(ExceptionUtils.getStackTrace(e));
        } catch (IOException e) {
            logger.error(ExceptionUtils.getStackTrace(e));
        }
        return null;
    }

    public String getUUID(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }
}
