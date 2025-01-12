package com.exemple.string.model;

import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
public class Basket {
    List<Integer> order = new ArrayList<>();

    public List<Integer> getOrder() {
        return order;
    }

    public void setOrder(List<Integer> order) {
        this.order = order;
    }

    public void String addOrder(List<Integer> Id){
        order.addAll(Id);
    }
}
