package com.effyroth.activity.processor;

/**
 * Created by guzhen on 15/11/5.
 */
public interface Processor<T> {
    public boolean process(T t);
}
