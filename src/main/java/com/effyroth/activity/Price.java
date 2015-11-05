package com.effyroth.activity;

/**
 * Created by guzhen on 15/11/5.
 */
public class Price {

    private Double value;

    public Price(){
        this.value = new Double(0);
    }

    public Price(Double value){
        this.value = value;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
