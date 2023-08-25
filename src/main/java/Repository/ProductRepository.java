package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository<Product> extends JpaRepository<Product, Long> {
    // Additional custom queries can be added here
}
