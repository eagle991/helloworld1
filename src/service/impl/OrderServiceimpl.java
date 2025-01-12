package соm.example.spring.service.impl;

import com.example.spring.service.OrderService;
Import org.springframemork.stereotype.Service;
import org.springframemork.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Service

public class OrderServiceImpl implements OrderService {

    private final Basket basket;
}

public OrderServiceImpl(Basket basket) {
    this.basket = basket;
}


@Override
public String add(List<Integer> list) {
        basket.addOrder(list);
        return "Succesfully added ids";
}

@Override
public List<Integer> get() {
        return basket.getOrder();
    }
    }

