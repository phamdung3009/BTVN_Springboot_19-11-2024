package demo.spring.boot.demospringbotday3.repository;

import demo.spring.boot.demospringbotday3.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {
}
