package com.bash.serg.request;

/**
 * Created by serg on 03.04.17.
 */
public class DefaultRequest<T> {

    private T body;

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }
}
