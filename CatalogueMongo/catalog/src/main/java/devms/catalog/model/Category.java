package devms.catalog.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@Data
@Document("categories")
public class Category {
    @Id
    private String id;
    
    private String name; // "androids"
    private String description; // " some description..."
    private String parentPath; // "phones"
    @Indexed(unique = true)
    private String path; // "phones.androids"
}
