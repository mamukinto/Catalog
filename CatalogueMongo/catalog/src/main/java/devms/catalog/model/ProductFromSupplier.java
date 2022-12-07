package devms.catalog.model;

import lombok.Data;

@Data
public class ProductFromSupplier {
    private String supplierName;
    private String linkToProduct;
    private Double price;
}
