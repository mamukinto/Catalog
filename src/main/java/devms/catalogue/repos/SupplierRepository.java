package devms.catalogue.repos;

import devms.catalogue.domain.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
}
