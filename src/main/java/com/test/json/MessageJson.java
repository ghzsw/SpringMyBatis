package com.test.json;

/**
 * Created by zsw on 15-3-26.
 * 返回json结构类
 */
public class MessageJson extends AbstractMessage {

    public MessageJson() {
        super();
    }

    public MessageJson(String status,Object content){

        super(status,content);
    }
}
