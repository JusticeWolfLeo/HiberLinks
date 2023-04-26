package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "Dishes", schema = "testbase")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Dishes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String dishesList;
    private Integer price;
    @ManyToMany
    private List<Ingredients> ingredList;
}
