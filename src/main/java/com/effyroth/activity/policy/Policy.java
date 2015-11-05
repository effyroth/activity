package com.effyroth.activity.policy;

/**
 * Created by guzhen on 15/11/5.
 */
public interface Policy<T> {
    public boolean deal(T t);
}
