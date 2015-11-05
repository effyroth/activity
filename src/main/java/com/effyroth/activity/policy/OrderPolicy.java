package com.effyroth.activity.policy;

import com.effyroth.activity.Order;

/**
 * Created by guzhen on 15/11/5.
 */
public class OrderPolicy implements Policy<Order>{
    public boolean deal(Order order) {
        //this is fake code
        order.setFinalPrice(order.getPoisPolicyPrice());
        return true;
    }
}
