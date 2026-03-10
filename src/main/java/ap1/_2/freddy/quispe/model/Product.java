package ap1._2.freddy.quispe.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document(collection = "product")
public class Product {

    @Id
    private String id;
    private String name;
    private String description;
    private Double price;
    private Integer stock;
    private String category;
    private String brand;
    private Boolean isActive;
    private LocalDateTime createdAt;
}