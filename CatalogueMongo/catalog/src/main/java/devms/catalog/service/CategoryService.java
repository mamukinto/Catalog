package devms.catalog.service;

import devms.catalog.model.Category;
import devms.catalog.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    CategoryRepository repo;

    public CategoryService(CategoryRepository categoryRepository) {
        repo = categoryRepository;
    }

    public List<Category> getAll() {
        return repo.findAll();
    }

    public Category getByPath(String path) {
        return repo.findByPath(path);
    }

    public Category getById(String id) {
        return repo.findById(id).orElse(null);
    }

    public Category create(Category category) {
        return repo.save(category);
    }

    public Category update(Category category) {
        return repo.save(category);
    }

    public void delete(Category category) {
        repo.delete(category);
    }
}
