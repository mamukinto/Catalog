package devms.catalog.repository;

import devms.catalog.model.Category;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoryRepository extends MongoRepository<Category,String> {
    public Category findByPath(String path);
}
