package com.effyroth.activity.processor;

import com.effyroth.activity.Order;
import com.effyroth.activity.policy.Policy;

/**
 * Created by guzhen on 15/11/5.
 */
public class OrderProcessor implements Processor<Order>{
    public boolean process(Order order) {
        order.calculate();
        Policy<Order> policy = order.getOrderPolicy();
        policy.deal(order);
        return true;
    }
}
