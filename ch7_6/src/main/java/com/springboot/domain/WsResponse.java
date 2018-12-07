package com.springboot.domain;

/**
 * @Author: withlzc
 * @Description:
 * @Date: Created in 2018/12/7 0007 16:53
 */
public class WsResponse {

    private String responseMessage;

    public WsResponse(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public String getResponseMessage() {
        return responseMessage;
    }
}
