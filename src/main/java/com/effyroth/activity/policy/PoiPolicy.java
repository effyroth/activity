package com.effyroth.activity.policy;

import com.effyroth.activity.Poi;

/**
 * Created by guzhen on 15/11/5.
 */
public class PoiPolicy implements Policy<Poi>{
    public boolean deal(Poi poi) {
        //this is fake code
        poi.setFinalPrice(poi.getOriginalPrice());
        return true;
    }
}
