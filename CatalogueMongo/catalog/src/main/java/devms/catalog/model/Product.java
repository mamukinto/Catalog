package devms.catalog.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;
import java.util.List;

@Data
@Document("products")
public class Product {
    @Id
    private String id;

    private String categoryPath; // "phones.androids" (example)
    private String shortName; // "Iphone 14"
    @Indexed(unique = true)
    private String fullName; // "Iphone 14 pro max, 256gb, Sierra Blue"
    private String description; // "new iphone bla-bla-bla"
    private HashMap<String,String> stringProperties;
    // [{"Released":"2022, September 16"},
    // {"Storage":"256gb"},
    // {"Color":"Sierra Blue"} ..... {}]
    private HashMap<String,Boolean> booleanProperties;
    // [{"has sim":true},
    // {"has memory card":"false"},
    // {"is for rich people":"true"} ..... {}]

    private List<ProductFromSupplier> suppliers;
    // [{
    //  supplierName="ALTA"
    //  linkToProduct="https://alta.ge/exampleLinkToProduct
    //  price=999.99
    // },
    // {
    //  supplierName="Zoomer"
    //  linkToProduct="https://zoomer.ge/zxckajsd12112
    //  price=1050.00
    // },
    // ]
}



