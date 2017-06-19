package cc.leevi.anything;

import cc.leevi.anything.rest.request.VivoDayData;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiang on 2017-06-18.
 */
public class InvokeTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        VivoDayData data = new VivoDayData();
        List<String> images = new ArrayList<>();
        images.add("12341234");
        data.setImages(images);
        List<String> test = (List<String>) data.getClass().getDeclaredMethod("getImages").invoke(data);
        System.out.println(test);
    }
}
