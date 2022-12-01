package devms.catalogue.controllers;

import devms.catalogue.domain.Product;
import devms.catalogue.domain.Supplier;
import devms.catalogue.service.ProductService;
import devms.catalogue.service.SupplierService;
import devms.catalogue.view.ProductExtendedView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class SupplierController {
    @Autowired
    SupplierService supplierService;

    @GetMapping("/api/v1/suppliers")
    @ResponseBody
    public List<Supplier> get() {
        return supplierService.getAll();
    }

    @GetMapping("/api/v1/suppliers/{id}")
    @ResponseBody
    public Supplier getById(@PathVariable int id) {
        return supplierService.getById(id);
    }

    @PostMapping(value = "/api/v1/suppliers/{id}/products",consumes = "application/json")
    @ResponseBody
    public ResponseEntity<Product> addProductFromSupplier(@PathVariable int id,@RequestBody ProductExtendedView productExtendedView) {
        return ResponseEntity.ok(supplierService.addProduct(id,productExtendedView));
    }

    @PostMapping(value = "/api/v1/suppliers",consumes = "application/json")
    @ResponseBody
    public ResponseEntity<Supplier> create(@RequestBody Supplier supplier) {
        if (supplier.getSupplierId() > 0) {
            return ResponseEntity.ok(supplierService.update(supplier));
        } else {
            return ResponseEntity.ok(supplierService.create(supplier));
        }
    }


}
