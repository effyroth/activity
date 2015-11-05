package com.effyroth.activity;

import com.effyroth.activity.policy.ProductPolicy;
import com.effyroth.activity.processor.ProductProcessor;

/**
 * Created by guzhen on 15/11/5.
 */
public class Product implements Calculable{

    private ProductPolicy productPolicy;

    private Price originalPrice;
    private Price finalPrice;

    //not be used
    private ProductProcessor productProcessor;

    public boolean calculate() {
        return this.productProcessor.process(this);
    }

    public boolean calculateWithoutPolicy() {
        this.finalPrice = this.originalPrice;
        return true;
    }

    public ProductPolicy getProductPolicy() {
        return productPolicy;
    }

    public void setProductPolicy(ProductPolicy productPolicy) {
        this.productPolicy = productPolicy;
    }

    public Price getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Price originalPrice) {
        this.originalPrice = originalPrice;
    }

    public Price getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(Price finalPrice) {
        this.finalPrice = finalPrice;
    }

    public ProductProcessor getProductProcessor() {
        return productProcessor;
    }

    public void setProductProcessor(ProductProcessor productProcessor) {
        this.productProcessor = productProcessor;
    }
}
