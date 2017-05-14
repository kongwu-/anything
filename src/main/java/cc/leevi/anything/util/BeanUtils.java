package cc.leevi.anything.util;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.BeansException;

import java.beans.PropertyDescriptor;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jiang on 2017/5/3.
 */
public class BeanUtils extends org.springframework.beans.BeanUtils {

    /**
     * bean转map
     * @param source
     * @throws BeansException
     */
    public static Map<String, Object> bean2map(Object source) throws BeansException {
        BeanWrapper beanWrapper = new BeanWrapperImpl(source);
        Map<String,Object> m = new HashMap<>();
        PropertyDescriptor[] descriptor = beanWrapper.getPropertyDescriptors();
        for (int i = 0; i < descriptor.length; i++) {
            String propName = descriptor[i].getName();
            m.put(propName,beanWrapper.getPropertyValue(propName));
        }
        return m;
    }
}
