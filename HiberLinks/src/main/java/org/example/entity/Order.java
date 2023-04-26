package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Order", schema = "testbase")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String note;
    private String price;

    @OneToOne
    private Waiter Waiter;
    @OneToOne
    private Stolik Stolik;
    @OneToMany
    @JoinColumn(name = "orders_id")
    private List<Dishes> dishes;
}
