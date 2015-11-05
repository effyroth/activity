package com.effyroth.activity.processor;

import com.effyroth.activity.Product;
import com.effyroth.activity.policy.Policy;

/**
 * Created by guzhen on 15/11/5.
 */
public class ProductProcessor implements Processor<Product>{
    public boolean process(Product product) {
        Policy<Product> policy = product.getProductPolicy();
        policy.deal(product);
        return true;
    }
}
