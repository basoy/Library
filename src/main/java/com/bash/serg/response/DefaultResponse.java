package com.bash.serg.response;

/**
 * Created by serg on 03.04.17.
 */
public class DefaultResponse <T> {

    private T body;

    public DefaultResponse(T body){
        this.body = body;
    }

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }
}
