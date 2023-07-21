package com.salihpolat.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "BUYERS")
public class Buyer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "FIRST_NAME", length = 50)
    private String firstName;

    @Column(name = "LAST_NAME", length = 50)
    private String lastName;

    @Column(name = "EMAIL", length = 60)
    private String email;

    @Column(name = "PHONE", length = 20)
    private String phone;

    // Birden Fazla Alıcı Birden Fazla Ev Alabilir
    //  ----->>> Properties
    @ManyToMany(mappedBy = "buyers", cascade = CascadeType.ALL)
    private Set<Property> properties = new HashSet<>();
}