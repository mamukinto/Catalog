package devms.catalogue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@SpringBootApplication
public class CatalogueApplication {

    public static void main(final String[] args) {
        SpringApplication.run(CatalogueApplication.class, args);
    }



}
