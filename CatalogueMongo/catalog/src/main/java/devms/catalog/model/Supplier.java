package devms.catalog.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("suppliers")
public class Supplier {
    @Id
    private String id;

    private String shortName;
    @Indexed(unique = true)
    private String fullName;
    private String websiteUrl;
}
