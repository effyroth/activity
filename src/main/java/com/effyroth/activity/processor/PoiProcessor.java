package com.effyroth.activity.processor;

import com.effyroth.activity.Poi;
import com.effyroth.activity.policy.Policy;

/**
 * Created by guzhen on 15/11/5.
 */
public class PoiProcessor implements Processor<Poi>{
    public boolean process(Poi poi) {
        poi.calculate();
        Policy<Poi> policy = poi.getPoiPolicy();
        policy.deal(poi);
        return true;
    }
}
