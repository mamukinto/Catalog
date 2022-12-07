package devms.catalog.service;

import devms.catalog.model.Category;
import devms.catalog.model.Supplier;
import devms.catalog.repository.CategoryRepository;
import devms.catalog.repository.SupplierRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierService {
    SupplierRepository repo;

    public SupplierService(SupplierRepository supplierRepository) {
        repo = supplierRepository;
    }

    public List<Supplier> getAll() {
        return repo.findAll();
    }

    public Supplier getByFullName(String fullName) {
        return repo.findByFullName(fullName);
    }
    public Supplier getById(String id) {
        return repo.findById(id).orElse(null);
    }

    public Supplier create(Supplier supplier) {
        return repo.save(supplier);
    }

    public Supplier update(Supplier supplier) {
        return repo.save(supplier);
    }

    public void delete(Supplier supplier) {
        repo.delete(supplier);
    }
}
