package devms.catalog.controller;

import devms.catalog.model.Supplier;
import devms.catalog.service.SupplierService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SupplierController {
    SupplierService service;

    public SupplierController(SupplierService supplierService) {
        service = supplierService;
    }

    @GetMapping("/suppliers")
    List<Supplier> all() {
        return service.getAll();
    }

    @GetMapping("/suppliers/{id}")
    Supplier one(@PathVariable String id) {
        return service.getById(id);
    }

    @GetMapping("/suppliers/fullName/{fullName}")
    Supplier oneByFullName(@PathVariable String fullName) {
        return service.getByFullName(fullName);
    }

    @PostMapping("/suppliers")
    Supplier newSupplier(@RequestBody Supplier supplier){
        return service.create(supplier);
    }
    @PutMapping("/suppliers/{id}")
    Supplier update(@RequestBody Supplier supplier,@PathVariable String id){
        return service.update(supplier);
    }
    @DeleteMapping("/suppliers/{id}")
    void delete(@RequestBody Supplier supplier,@PathVariable String id) {
        service.delete(supplier);
    }
}
