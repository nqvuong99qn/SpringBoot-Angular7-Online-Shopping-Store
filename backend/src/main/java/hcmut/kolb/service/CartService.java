package hcmut.kolb.service;

import hcmut.kolb.entity.Cart;
import hcmut.kolb.entity.ProductInOrder;
import hcmut.kolb.entity.User;

import java.util.Collection;


public interface CartService {
    Cart getCart(User user);

    void mergeLocalCart(Collection<ProductInOrder> productInOrders, User user);

    void delete(String itemId, User user);

    void checkout(User user);
}
