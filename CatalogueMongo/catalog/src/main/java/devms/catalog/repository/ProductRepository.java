package devms.catalog.repository;

import devms.catalog.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,String> {
    public Product findByFullName(String fullName);
}
