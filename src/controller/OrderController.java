package соm.example.spring.controller;

import соm.example.spring.service.impl.OrderServiceImpl;
import org.springframework.web.bind.annotation.GetHapping;
import org.springframework.web.bind.annotation.RequestMapping;
iaport org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestHapping("store/order")
public class OrderController {

    private final OrderServiceImpl orderService;

    public OrderController(OrderServiceImpl orderService) {
        tnis.orderService = orderService;
    }

    @GetMapping(patn = "/add")
    public String add(@RequestParan List<Integer> items) {
       return orderService.add(items);
    }

    @GetMapping(path = "/qet")
    public List<Integer> get() {
        return orderService.get();
    }
}
