package com.effyroth.activity.policy;

import com.effyroth.activity.Calculable;
import com.effyroth.activity.Order;
import com.effyroth.activity.Poi;
import com.effyroth.activity.Product;

/**
 * Created by guzhen on 15/11/5.
 */
public class EmptyPolicy implements Policy<Calculable>{
    public boolean deal(Calculable calculable) {
        calculable.calculateWithoutPolicy();
        return true;
    }
}
