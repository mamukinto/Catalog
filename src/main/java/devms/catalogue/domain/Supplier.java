package devms.catalogue.domain;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Supplier {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer supplierId;

    @Column(nullable = false, length = 45)
    private String supplierName;

    @Column(nullable = false, length = 400)
    private String supplierLink;

    @Column(nullable = false, length = 45)
    private String supplierEmail;

    @OneToMany(mappedBy = "supplier")
    private Set<ProductFromSupplier> products;

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(final Integer supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(final String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierLink() {
        return supplierLink;
    }

    public void setSupplierLink(final String supplierLink) {
        this.supplierLink = supplierLink;
    }

    public String getSupplierEmail() {
        return supplierEmail;
    }

    public void setSupplierEmail(final String supplierEmail) {
        this.supplierEmail = supplierEmail;
    }

    public Set<ProductFromSupplier> getProducts() {
        return products;
    }

    public void setProducts(
            final Set<ProductFromSupplier> supplierProductFromSuppliers) {
        this.products = supplierProductFromSuppliers;
    }

}
