package hcmut.kolb.service;

import hcmut.kolb.entity.ProductInOrder;
import hcmut.kolb.entity.User;


public interface ProductInOrderService {
    void update(String itemId, Integer quantity, User user);
    ProductInOrder findOne(String itemId, User user);
}
