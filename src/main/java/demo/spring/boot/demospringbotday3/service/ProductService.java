package demo.spring.boot.demospringbotday3.service;

import demo.spring.boot.demospringbotday3.model.Product;
import demo.spring.boot.demospringbotday3.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public Product save(Product product) {
        return productRepo.save(product);
    }

    public List<Product> findAll() {
        return productRepo.findAll();
    }

    public Product findById(Long id) {
        return productRepo.findById(id).orElse(null);
    }

    public Product update(Product product) {
        return productRepo.save(product);
    }

    public void delete(Long id) {
        productRepo.deleteById(id);
    }
}
