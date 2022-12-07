package devms.catalog.service;

import devms.catalog.model.Product;
import devms.catalog.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    ProductRepository repo;

    public ProductService(ProductRepository productRepository) {
        repo = productRepository;
    }

    public List<Product> getAll() {
        return repo.findAll();
    }

    public Product getById(String id) {
        return repo.findById(id).orElse(null);
    }

    public Product getByFullName(String fullName) {
        return repo.findByFullName(fullName);
    }

    public Product create(Product product) {
        return repo.save(product);
    }
    // TODO: difference between save() for update and save() for create ???
    public Product update(Product product) {
        return repo.save(product);
    }

    public void delete(Product product) {
        repo.delete(product);
    }


}
