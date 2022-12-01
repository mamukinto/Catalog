package devms.catalogue.view;

import devms.catalogue.domain.Product;

import java.math.BigDecimal;

public class ProductExtendedView {
    private Product product;
    private BigDecimal price;
    private String url;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
