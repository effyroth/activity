package com.effyroth.activity;

import com.effyroth.activity.policy.PoiPolicy;
import com.effyroth.activity.processor.ProductProcessor;

import java.util.Set;

/**
 * Created by guzhen on 15/11/5.
 */
public class Poi implements Calculable{

    private PoiPolicy poiPolicy;
    private Set<Product> products;

    private Price originalPrice;
    private Price productsPolicyPrice;
    private Price finalPrice;

    private ProductProcessor productProcessor;

    public boolean calculate() {

        Double originalPriceSum = new Double(0);
        Double finalPriceSum = new Double(0);

        for (Product product : products) {
            this.productProcessor.process(product);

            originalPriceSum += product.getOriginalPrice().getValue();
            finalPriceSum += product.getFinalPrice().getValue();
        }

        this.originalPrice.setValue(originalPriceSum);
        this.productsPolicyPrice.setValue(finalPriceSum);
        return true;
    }

    public boolean calculateWithoutPolicy() {
        this.finalPrice = this.productsPolicyPrice;
        return true;
    }

    public PoiPolicy getPoiPolicy() {
        return poiPolicy;
    }

    public void setPoiPolicy(PoiPolicy poiPolicy) {
        this.poiPolicy = poiPolicy;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public Price getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Price originalPrice) {
        this.originalPrice = originalPrice;
    }

    public Price getProductsPolicyPrice() {
        return productsPolicyPrice;
    }

    public void setProductsPolicyPrice(Price productsPolicyPrice) {
        this.productsPolicyPrice = productsPolicyPrice;
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
