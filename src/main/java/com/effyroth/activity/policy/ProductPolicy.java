package com.effyroth.activity.policy;

import com.effyroth.activity.Product;

/**
 * Created by guzhen on 15/11/5.
 */
public class ProductPolicy implements Policy<Product>{
    public boolean deal(Product product) {
        //this is fake code
        product.setFinalPrice(product.getOriginalPrice());
        return true;
    }
}
