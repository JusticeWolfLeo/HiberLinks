package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Stolik", schema = "testbase")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Stolik {
    @Id
    private Long id;
    private int number;

    @OneToOne
    private Order order;
}
