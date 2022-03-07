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
@Table(name = "room_receive_voucher")
public class Room_Receive_Voucher {
    @Id
    @Column(name = "RECEIVE_VOUCHER_ID", nullable = false)
    private int receive_voucher_id;

    @Column(name = "NOTE")
    private String note;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CUS_ID")
    private Customer id_cus;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "RECEIVE_VOUCHER_ID",referencedColumnName = "RECEIVE_VOUCHER_ID")
    private Detail_Receive_Room receive_room_voucher ;
}
