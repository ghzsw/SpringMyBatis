package com.test.utils;

import com.test.json.JSONStatusCotants;
import com.test.json.MessageJson;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zsw on 15-3-26.
 * 返回json的工具类
 */
public class JSONUtils {

    /***
     * List内容返回json
     */
    public static MessageJson getMessage(List list){

        if(!CommonUtils.isNull(list))
            return new MessageJson(JSONStatusCotants.SUCESS,list);
        else
            return new MessageJson(JSONStatusCotants.FAIL,new ArrayList());

    }

    /**
     * int 返回json
     */

    public static MessageJson getMessage(int result){

        if(!CommonUtils.isNull(result))
            return new MessageJson(JSONStatusCotants.SUCESS, result);
        else
            return new MessageJson(JSONStatusCotants.FAIL,0);

    }


    /**
     * String 返回json
     */

    public static MessageJson getMessage(String result){

        if(!CommonUtils.isNull(result))
            return new MessageJson(JSONStatusCotants.SUCESS, result);
        else
            return new MessageJson(JSONStatusCotants.FAIL,result);

    }
}
