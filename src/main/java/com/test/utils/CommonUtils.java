package com.test.utils;

import org.springframework.util.StringUtils;

import java.util.Collection;

/**
 * Created by zsw on 15-3-28.
 */
public class CommonUtils {


    public static boolean isNull(Object instance){

        if(instance instanceof Collection)
            return (instance == null || ((Collection) instance).size()<=0);
        else if(instance instanceof String)
            return StringUtils.isEmpty(instance);
        //TODO 目前之支持int类型数字
        else if(instance instanceof Integer)
            return (Integer)instance <0;
        else
            return instance==null;
    }
}
