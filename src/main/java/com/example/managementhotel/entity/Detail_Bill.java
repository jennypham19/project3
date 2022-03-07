package com.example.managementhotel.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "detail_bill")
public class Detail_Bill {
    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "ROOM_PRICE")
    private float room_price;

    @Column(name = "TOTAL_SERVICE_PRICE")
    private float total_service_price;

    @Column(name = "DISCOUNT")
    private float discount;

    @Column(name = "PAYMENT")
    private String payment;

    @Column(name = "TOTAL_DATE")
    private int total_date;

    @Column(name = "TOTAL_PRICE")
    private float total_price;
}
