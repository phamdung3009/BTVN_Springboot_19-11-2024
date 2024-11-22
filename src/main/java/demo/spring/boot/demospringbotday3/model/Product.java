package demo.spring.boot.demospringbotday3.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "product")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Double price;
    /*private Long cat_id;*/

    @ManyToOne
    @JoinColumn(name = "cat_id")
    private Category category;
}
