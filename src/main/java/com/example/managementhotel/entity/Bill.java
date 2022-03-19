package com.example.managementhotel.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "bill")
public class Bill {
    @Id
    @Column(name = "BILL_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bill_id;

    @Column(name = "EMPLOYEE_CREATE")
    private String employee_create;

    @Column(name = "PRICE")
    private float price;

    @Column(name = "DATE_CREATE")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "mm/dd/yy")
    private Date date_create;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CUS_ID")
    private Customer id_cus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ROOM_ID")
    private Room id_room;
}
