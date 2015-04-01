package com.test.json;

/**
 * Created by zsw on 15-3-26.
 * 共用返回json格式
 */
public class AbstractMessage {

    private  String status;//返回状态

    private Object messageContent;//返回结果

    public AbstractMessage() {
    }

    public AbstractMessage(String status, Object messageContent) {
        this.status = status;
        this.messageContent = messageContent;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {

        this.status = status;
    }

    public Object getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(Object messageContent) {
        this.messageContent = messageContent;
    }
}
