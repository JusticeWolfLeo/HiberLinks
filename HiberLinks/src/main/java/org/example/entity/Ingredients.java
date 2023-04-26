package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Ingredients", schema = "testbase")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Ingredients {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String IngrNote;
    private String IngrCount;

    @ManyToMany(mappedBy = "IngredList")
    private List<Dishes> dishes;
}
