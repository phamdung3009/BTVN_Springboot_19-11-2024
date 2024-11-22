package demo.spring.boot.demospringbotday3.service;

import demo.spring.boot.demospringbotday3.model.Category;
import demo.spring.boot.demospringbotday3.repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepo categoryRepo;

    public Category save(Category category) {
        return categoryRepo.save(category);
    }

    public List<Category> findAll() {
        return categoryRepo.findAll();
    }

    public Category findById(Long id) {
        return categoryRepo.findById(id).orElse(null);
    }

    public Category update(Category category) {
        return categoryRepo.save(category);
    }

    public void delete(Long id) {
        categoryRepo.deleteById(id);
    }
}
