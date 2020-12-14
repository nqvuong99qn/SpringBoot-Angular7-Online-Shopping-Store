package hcmut.kolb.repository;

import hcmut.kolb.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CartRepository extends JpaRepository<Cart, Integer> {
}
