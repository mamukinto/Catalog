package devms.catalog.repository;

import devms.catalog.model.Supplier;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SupplierRepository extends MongoRepository<Supplier,String> {
    public Supplier findByFullName(String fullName);
}
