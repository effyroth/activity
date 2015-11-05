package com.effyroth.activity;

import com.effyroth.activity.policy.OrderPolicy;
import com.effyroth.activity.processor.PoiProcessor;

import java.util.Set;

/**
 * Created by guzhen on 15/11/5.
 */
public class Order implements Calculable{

    private User user;

    private OrderPolicy orderPolicy;
    private Set<Poi> pois;

    private Price originalPrice;
    private Price poisPolicyPrice;
    private Price finalPrice;

    private PoiProcessor poiProcessor;

    public boolean calculate() {

        //maybe big decimal
        Double originalPriceSum = new Double(0);
        Double finalPriceSum = new Double(0);

        for (Poi poi : pois){
            this.poiProcessor.process(poi);

            originalPriceSum += poi.getOriginalPrice().getValue();
            finalPriceSum += poi.getFinalPrice().getValue();
        }

        this.originalPrice.setValue(originalPriceSum);
        this.poisPolicyPrice.setValue(finalPriceSum);
        return true;
    }

    public boolean calculateWithoutPolicy() {
        this.finalPrice = this.poisPolicyPrice;
        return true;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public OrderPolicy getOrderPolicy() {
        return orderPolicy;
    }

    public void setOrderPolicy(OrderPolicy orderPolicy) {
        this.orderPolicy = orderPolicy;
    }

    public Set<Poi> getPois() {
        return pois;
    }

    public void setPois(Set<Poi> pois) {
        this.pois = pois;
    }

    public Price getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Price originalPrice) {
        this.originalPrice = originalPrice;
    }

    public Price getPoisPolicyPrice() {
        return poisPolicyPrice;
    }

    public void setPoisPolicyPrice(Price poisPolicyPrice) {
        this.poisPolicyPrice = poisPolicyPrice;
    }

    public Price getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(Price finalPrice) {
        this.finalPrice = finalPrice;
    }

    public PoiProcessor getPoiProcessor() {
        return poiProcessor;
    }

    public void setPoiProcessor(PoiProcessor poiProcessor) {
        this.poiProcessor = poiProcessor;
    }
}
