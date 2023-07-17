package com.salihpolat.model;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "CUSTOMER")
public class Customer {

    @Id // Id Değeri Verir. Primary Key (PK)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private int id;
    @Basic // Bu Kolon/Sütun Mutlaka Olacak
    @Column(name = "FIRST_NAME", length = 40, nullable = false)
    private String firstName;
    @Transient // Bu Kolonu/Sütunu Görmezden Gel
    @Column(name = "LAST_NAME", length = 50)
    private String lastName;
    /*
        @Lob // Large Obje - Uzun Yazılarda Kullanılır
        @Column (name = "ADDRESS") // Default Uzunluk 0 - 255 Karakter Arası
        private String address;
    */
    @Embedded
    private Address address; // Şehir - İlçe - Mahalle
    @ElementCollection
    private Set<Address> adresListesi = new HashSet<>();
    @Temporal(TemporalType.DATE) // Sadece Tarih Verisini Formatladı
    @Column(name = "CREATION_DATE")
    private Date creationDate;

    public Customer() {
    }

    public Customer(String firstName, String lastName, Address address, Date creationDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.creationDate = creationDate;
    }

    public Customer(String firstName, String lastName, Address address, Set<Address> adresListesi, Date creationDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.adresListesi = adresListesi;
        this.creationDate = creationDate;
    }

    public Customer(int id, String firstName, String lastName, Address address, Date creationDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.creationDate = creationDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Set<Address> getAdresListesi() {
        return adresListesi;
    }

    public void setAdresListesi(Set<Address> adresListesi) {
        this.adresListesi = adresListesi;
    }
}