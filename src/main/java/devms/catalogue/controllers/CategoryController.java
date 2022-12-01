package devms.catalogue.controllers;

import devms.catalogue.domain.Category;
import devms.catalogue.domain.Product;
import devms.catalogue.service.CategoryService;
import nonapi.io.github.classgraph.json.JSONSerializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @GetMapping("/api/v1/categories")
    @ResponseBody
    public List<Category> get() {
        return categoryService.getAll();
    }

    @GetMapping("/api/v1/categories/{id}")
    @ResponseBody
    public Category getById(@PathVariable int id) {
        return categoryService.getById(id);
    }

    @PostMapping(value = "/api/v1/categories",consumes = "application/json")
    public Category create(@RequestBody Category category) {
        if (category.getCategoryId() > 0) {
            return categoryService.update(category);
        } else {
            return categoryService.create(category);
        }
    }

}
