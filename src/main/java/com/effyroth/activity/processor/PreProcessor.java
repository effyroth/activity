package com.effyroth.activity.processor;

import com.effyroth.activity.Order;

/**
 * Created by guzhen on 15/11/5.
 */
public class PreProcessor implements Processor<Order> {
    public boolean process(Order order) {
        //TODO risk check & policy exclude check
        return false;
    }
}
