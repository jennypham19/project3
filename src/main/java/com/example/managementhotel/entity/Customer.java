package com.example.managementhotel.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="customer")
public class Customer {
    @Id
    @Column(name = "CUS_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cus_id;

    @Column(name = "CUS_NAME")
    private String cus_name;

    @Column(name = "GENDER")
    private String gender;

    @Column(name = "CMND")
    private int cmnd;

    @Column(name = "PHONE")
    private int phone;

    @Column(name = "NATIONALITY")
    private String nationality;

    @Column(name = "ADDRESS")
    private String address;

    @OneToMany(mappedBy = "id_cus")
    private List<Room_Receive_Voucher> listVoucher;

    @OneToMany(mappedBy = "id_cus")
    private List<Bill> listBill;
}
