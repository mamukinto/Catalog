package devms.catalogue.service;

import devms.catalogue.domain.Product;
import devms.catalogue.domain.ProductFromSupplier;
import devms.catalogue.domain.Supplier;
import devms.catalogue.repos.ProductFromSupplierRepository;
import devms.catalogue.repos.ProductRepository;
import devms.catalogue.repos.SupplierRepository;
import devms.catalogue.view.ProductExtendedView;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierService {
    private final SupplierRepository repo;
    private final ProductRepository productRepo;
    private final ProductFromSupplierRepository productFromSupplierRepo;
    public SupplierService(SupplierRepository repo,
                           ProductRepository productRepo,
                           ProductFromSupplierRepository productFromSupplierRepo)
    {
        this.repo = repo;
        this.productRepo = productRepo;
        this.productFromSupplierRepo = productFromSupplierRepo;
    }

    public List<Supplier> getAll() {
        return repo.findAll();
    }

    public Supplier getById(int id) {
        return repo.findById(id).orElse(null);
    }

    public Supplier create(Supplier supplier) {
        return repo.save(supplier);
    }

    public Supplier update(Supplier supplier) {
        Supplier repItem = getById(supplier.getSupplierId());
        if (repItem == null) {
            return null;
        }
        return repo.save(supplier);
    }
    public void delete(Supplier supplier) {
        repo.delete(supplier);
    }

    public Product addProduct(int supplierId, ProductExtendedView productExtendedView) {
        Product result = productExtendedView.getProduct();
        if (productExtendedView.getProduct().getProductId() > 0) {
            result = productRepo.save(productExtendedView.getProduct());
        }
        ProductFromSupplier newRelation = new ProductFromSupplier();
        newRelation.setProduct(productExtendedView.getProduct());
        newRelation.setSupplier(repo.findById(supplierId).get());
        newRelation.setPrice(productExtendedView.getPrice());
        newRelation.setUrl(productExtendedView.getUrl());
        productFromSupplierRepo.save(newRelation);

        return result;
    }
}
