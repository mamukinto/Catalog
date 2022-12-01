package devms.catalogue.service;

import devms.catalogue.domain.Category;
import devms.catalogue.domain.Product;
import devms.catalogue.repos.CategoryRepository;
import devms.catalogue.repos.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository repo;

    public ProductService(ProductRepository repo) {
        this.repo = repo;
    }

    public List<Product> getAll() {
        return repo.findAll();
    }

    public Product getById(int id) {
        return repo.findById(id).orElse(null);
    }

    public Product create(Product product) {
        return repo.save(product);
    }

    public Product update(Product product) {
        Product repItem = getById(product.getProductId());
        if (repItem == null) {
            return null;
        }
        return repo.save(product);
    }

}
