package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository<CartItem> extends JpaRepository<CartItem, Long> {
    // Additional custom queries can be added here
}