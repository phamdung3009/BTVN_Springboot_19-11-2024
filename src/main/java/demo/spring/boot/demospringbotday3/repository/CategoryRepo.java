package demo.spring.boot.demospringbotday3.repository;

import demo.spring.boot.demospringbotday3.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Long> {
}
