package devms.catalogue.controllers;

import devms.catalogue.domain.Category;
import devms.catalogue.repos.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.stream.Collectors;


@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody
    public String greeting() {
        return "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "    <head>\n" +
                "        <meta charset=\"UTF-8\">\n" +
                "        <title>Content</title>\n" +
                "    </head>\n" +
                "    <body>\n" +
                "        <h2>Catalogue REST Api</h2>\n" +
                "        <p>some requests:</p>\n" +
                "        <a href=\"http://localhost:8080/api/v1/categories\">Categories</a>\n" +
                "        <a href=\"http://localhost:8080/api/v1/products\">Products</a>\n" +
                "        <a href=\"http://localhost:8080/api/v1/suppliers\">Suppliers</a>\n" +
                "    </body>\n" +
                "</html>";
    }
}
