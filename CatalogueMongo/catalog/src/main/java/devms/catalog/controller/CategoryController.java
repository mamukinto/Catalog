package devms.catalog.controller;

import devms.catalog.model.Category;
import devms.catalog.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {
    CategoryService service;

    public CategoryController(CategoryService categoryService) {
        service = categoryService;
    }

    @GetMapping("/categories")
    List<Category> all() {
        return service.getAll();
    }

    @GetMapping("/categories/{id}")
    Category one(@PathVariable String id) {
        return service.getById(id);
    }

    @GetMapping("/categories/path/{path}")
    Category oneByPath(@PathVariable String path) {
        return service.getByPath(path);
    }

    @PostMapping("/categories")
    Category newCategory(@RequestBody Category newCategory) {
        return service.create(newCategory);
    }

    @PutMapping("/categories/{id}")
    Category update(@RequestBody Category updatedCategory,@PathVariable String id) {
        return service.update(updatedCategory);
    }

    @DeleteMapping("/categories/{id}")
    void delete(@RequestBody Category category,@PathVariable String id) {
        service.delete(category);
    }
}
