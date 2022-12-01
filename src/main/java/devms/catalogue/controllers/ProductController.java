package devms.catalogue.controllers;

import devms.catalogue.domain.Category;
import devms.catalogue.domain.Product;
import devms.catalogue.repos.ProductRepository;
import devms.catalogue.service.CategoryService;
import devms.catalogue.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/api/v1/products")
    @ResponseBody
    public List<Product> get() {
        return productService.getAll();
    }

    @GetMapping("/api/v1/products/{id}")
    @ResponseBody
    public Product getById(@PathVariable int id) {
        return productService.getById(id);
    }

    @PostMapping(value = "/api/v1/products",consumes = "application/json")
    public Product create(@RequestBody Product category) {
        if (category.getProductId() > 0) {
            return productService.update(category);
        } else {
            return productService.create(category);
        }
    }
}
