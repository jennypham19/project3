package com.example.managementhotel.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="service")
public class Services {
    @Id
    @Column(name = "SERVICE_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int service_id;

    @Column(name = "SERVICE_NAME")
    private String service_name;

    @Column(name = "PRICE")
    private float price;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "SERVICE_ID",referencedColumnName = "SERVICE_ID")
    private Detail_Bill detail_bill;

    @Override
    public String toString() {
        return this.service_name;
    }
}