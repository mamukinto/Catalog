package devms.catalogue.service;

import devms.catalogue.domain.Category;
import devms.catalogue.repos.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    private final CategoryRepository repo;

    public CategoryService(CategoryRepository repo) {
        this.repo = repo;
    }

    public List<Category> getAll() {
        return repo.findAll();
    }

    public Category getById(int id) {
        return repo.findById(id).orElse(null);
    }

    public Category create(Category category) {
        return repo.save(category);
    }

    public Category update(Category category) {
        Category repItem = getById(category.getCategoryId());
        if (repItem == null) {
            return null;
        }
        return repo.save(category);
    }

}
