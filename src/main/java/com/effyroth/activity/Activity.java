package com.effyroth.activity;

import com.effyroth.activity.processor.OrderProcessor;
import com.effyroth.activity.processor.PreProcessor;
import com.effyroth.activity.processor.Processor;

/**
 * Created by guzhen on 15/11/5.
 */
public class Activity implements Calculable{

    private Order order;

    private OrderProcessor orderProcessor;
    private PreProcessor preProcessor;

    public boolean calculate(){
        this.preProcessor.process(order);
        this.orderProcessor.process(order);
        return true;
    }

    public boolean calculateWithoutPolicy() {
        return false;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public OrderProcessor getOrderProcessor() {
        return orderProcessor;
    }

    public void setOrderProcessor(OrderProcessor orderProcessor) {
        this.orderProcessor = orderProcessor;
    }

    public PreProcessor getPreProcessor() {
        return preProcessor;
    }

    public void setPreProcessor(PreProcessor preProcessor) {
        this.preProcessor = preProcessor;
    }
}
