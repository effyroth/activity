package com.effyroth.activity;

import com.effyroth.activity.policy.OrderPolicy;
import com.effyroth.activity.policy.PoiPolicy;
import com.effyroth.activity.policy.ProductPolicy;
import com.effyroth.activity.processor.OrderProcessor;
import com.effyroth.activity.processor.PoiProcessor;
import com.effyroth.activity.processor.PreProcessor;
import com.effyroth.activity.processor.ProductProcessor;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.HashSet;
import java.util.Set;

/** 
* Activity Tester. 
* 
* @author <Authors name> 
* @since <pre>十一月 6, 2015</pre> 
* @version 1.0 
*/ 
public class ActivityTest {

    Activity activity;

    @Before
    public void before() throws Exception {
        activity = new Activity();

        Product product = new Product();
        product.setProductProcessor(new ProductProcessor());
        product.setProductPolicy(new ProductPolicy());
        product.setOriginalPrice(new Price(1.11));
        product.setFinalPrice(new Price());

        Set<Product> products = new HashSet<Product>();
        products.add(product);

        Poi poi = new Poi();
        poi.setProductProcessor(new ProductProcessor());
        poi.setOriginalPrice(new Price());
        poi.setProductsPolicyPrice(new Price());
        poi.setFinalPrice(new Price());
        poi.setPoiPolicy(new PoiPolicy());
        poi.setProducts(products);

        Set<Poi> pois = new HashSet<Poi>();
        pois.add(poi);

        Order order = new Order();
        order.setPoiProcessor(new PoiProcessor());
        order.setOriginalPrice(new Price());
        order.setPoisPolicyPrice(new Price());
        order.setFinalPrice(new Price());
        order.setPois(pois);
        order.setOrderPolicy(new OrderPolicy());
        //todo add user

        activity.setOrder(order);
        activity.setOrderProcessor(new OrderProcessor());
        activity.setPreProcessor(new PreProcessor());
    }

    @After
    public void after() throws Exception {
    }

    /**
    *
    * Method: calculate()
    *
    */
    @Test
    public void testCalculate() throws Exception {
        activity.calculate();
        Double value = activity.getOrder().getFinalPrice().getValue();
        System.out.println(value);//out put 1.11

    }

    /**
    *
    * Method: calculateWithoutPolicy()
    *
    */
    @Test
    public void testCalculateWithoutPolicy() throws Exception {
    //TODO: Test goes here...
    }


} 
