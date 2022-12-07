package devms.catalog.controller;

import devms.catalog.model.Product;
import devms.catalog.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    ProductService service;

    public ProductController(ProductService productService) {
        service = productService;
    }

    @GetMapping("/products")
    List<Product> all() {
        return service.getAll();
    }

    @GetMapping("/products/{id}")
    Product one(@PathVariable String id) {
        return service.getById(id);
    }

    @GetMapping("/products/fullName/{fullName}")
    Product oneByFullName(@PathVariable String fullName) {
        return service.getByFullName(fullName);
    }

    @PostMapping("/products")
    Product newProduct(@RequestBody Product product) {
        return service.create(product);
    }

    @PutMapping("/products/{id}")
    Product update(@RequestBody Product product,@PathVariable String id) {
        return service.update(product);
    }

    @DeleteMapping("/products/{id}")
    void delete(@RequestBody Product product,@PathVariable String id) {
        service.delete(product);
    }
}
