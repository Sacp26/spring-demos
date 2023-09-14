package com.sac.demo.data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="ORDERS")
public class Order {

    @Id
    @Column(name="ORDER_ID")
    private String id;

    @ManyToOne
    @JoinColumn(name="CUSTOMER_ID", nullable=false, updatable=false)
    private Customer customer;

    @OneToMany(mappedBy = "order")
    private List<Product> products;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
