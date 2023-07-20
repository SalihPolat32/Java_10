package com.salihpolat.model;

import javax.persistence.*;

@Entity
@Table (name = "CUSTOMER")
public class Customer {

    @OneToOne(mappedBy = "customer", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private CustomerDetail customerDetail;

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "CUSTOMER_ID", nullable = false)
    private int customerId;
    @Column(name = "TITLE", length = 30)
    private String title;
    @Column(name = "FIRST_NAME", length = 60, nullable = false)
    private String firstName;
    @Column(name = "LAST_NAME", length = 60)
    private String lastName;

    public Customer() {
    }

    public Customer(String title, String firstname, String lastname) {
        this.title = title;
        this.firstName = firstname;
        this.lastName = lastname;
    }

    public CustomerDetail getCustomerDetail() {
        return customerDetail;
    }

    public void setCustomerDetail(CustomerDetail customerDetail) {
        this.customerDetail = customerDetail;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}