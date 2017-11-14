package cc.leevi.anything.util;

import cc.leevi.anything.autoconfigure.QiniuProperties;
import cc.leevi.anything.exception.AppException;
import cc.leevi.anything.rest.response.QiniuResponse;
import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.storage.BucketManager;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.util.Auth;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.net.URL;
import java.util.UUID;

/**
 * 七牛上传工具
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
    private BucketManager bucketManager = null;
    @PostConstruct
    public void init(){
        auth = Auth.create(qiniuProperties.getAccesskey(), qiniuProperties.getSecretkey());
        cfg = new Configuration(Zone.autoZone());
        uploadManager = new UploadManager(cfg);
        bucketManager = new BucketManager(auth, cfg);
    }




    /**
     * 保存远程图片
     * @param url 远程地址
     * @return
     */
    public String uploadRemote(String url) {
        try {
            String key = getUUID();
            upToken = auth.uploadToken(qiniuProperties.getBucket());
            String body = uploadManager.put(IOUtils.toByteArray(new URL(url)), key,upToken).bodyString();
            logger.info("上传七牛完成，地址为："+key);
            return key;
        } catch (IOException e) {
            logger.error(ExceptionUtils.getStackTrace(e));
        }
        return null;
    }

    public String getUUID(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }

    public QiniuResponse upload(byte[] bytes) {
        String key = getUUID();
        return upload(bytes,key);
    }

    public QiniuResponse upload(byte[] bytes,String key) {
        try {
            upToken = auth.uploadToken(qiniuProperties.getBucket());
            String body = uploadManager.put(bytes, key,upToken).bodyString();
            logger.info("上传七牛完成，地址为："+key);
            return new QiniuResponse(key,qiniuProperties.getPrefix()+key);
        } catch (IOException e) {
            logger.error(ExceptionUtils.getStackTrace(e));
        }
        return null;
    }
    public void delete(String key) {
        try {
            String body = bucketManager.delete(qiniuProperties.getBucket(),key).bodyString();
            logger.info(body);
        } catch (QiniuException e) {
            logger.error(ExceptionUtils.getStackTrace(e));
            throw new AppException(e.getMessage());
        }
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
            String url = qiniuProperties.getPrefix()+key;
            logger.info("上传七牛完成，地址为："+url);
            return url;
        }catch (QiniuException e){
            logger.error(ExceptionUtils.getStackTrace(e));
        } catch (IOException e) {
            logger.error(ExceptionUtils.getStackTrace(e));
        }
        return null;
    }

}
