package com.salihpolat.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PROPERTIES")
public class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "PROPERTY_NAME", length = 50)
    private String propertyName;

    @Column(name = "TITLE", length = 50)
    private String title;

    @Column(name = "DESTCRIPTION", length = 50)
    private String description;

    @Column(name = "TYPE", length = 50)
    private String type;

    @Column(name = "PRICE", length = 50)
    private BigDecimal price;

    @Column(name = "BEDROOMS", length = 50)
    private int bedrooms;

    @Column(name = "BATHROOMS", length = 50)
    private int bathrooms;

    @Column(name = "AREA", length = 50)
    private float area;

    @Column(name = "LOCATION", length = 50)
    private String location;

    //    m                1
    // Property <<<----- Agent
    @ManyToOne
    @JoinColumn(name = "agent_id")
    private Agent agent;

    //    m                1
    // Property <<<----- Seller
    @ManyToOne
    @JoinColumn(name = "seller_id")
    private Seller seller;

    // Property <<<----- Buyer
    @ManyToMany
    @JoinTable(name = "property_buyer",
            joinColumns = @JoinColumn(name = "property_id"),
            inverseJoinColumns = @JoinColumn(name = "buyer_id"))
    private Set<Buyer> buyers = new HashSet<>();
}