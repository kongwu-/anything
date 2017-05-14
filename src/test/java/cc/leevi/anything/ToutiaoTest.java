package cc.leevi.anything;

import com.github.kevinsawicki.http.HttpRequest;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiang on 2017-05-02.
 */
public class ToutiaoTest {
    public static void main(String[] args) throws InterruptedException {
        List<String> resultList = new ArrayList<String>();
        for (int i = 0;i<2000;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {






                     for(int i = 0;i<2000;i++){
                         String body = HttpRequest.get("https://sp0.baidu.com/5a1Fazu8AA54nxGko9WTAnF6hhy/su?wd=1&json=1&p=3&sid=1427_21122_22746_21670_22073&bs=jmeter&pbs=jmeter&csor=1&pwd=jemeter%20&cb=jQuery110206047033091330747_1493732125133&_=1493732125189").body();
                         resultList.add(body);
                         System.out.println(body);
                     }
                }
            }).start();
        }
        System.out.println("jobs over!");
    }
}
