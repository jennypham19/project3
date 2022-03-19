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
@Table(name = "room")
public class Room {
    @Id
    @Column(name = "ROOM_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int room_id;

    @Column(name = "ROOM_NAME")
    private String room_name;

    @Column(name = "FLOOR")
    private String floor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ROOM_TYPE_ID")
    private Room_Type id_room;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "STATE_ID")
    private State id_state;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "POLICY_ID")
    private Policy_Render_Room id_policy;

    @Column(name = "NOTE")
    private String note;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ROOM_ID", referencedColumnName = "ROOM_ID")
    private Detail_Receive_Room receive_room_voucher;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ROOM_ID",referencedColumnName = "ROOM_ID")
    private Bill bill;

    @ManyToMany()
    @JoinTable(
            name = "room_equipment",
            joinColumns = @JoinColumn(name = "ROOM_ID"),
            inverseJoinColumns = @JoinColumn(name = "EQUIP_ID")
    )
    private List<Equipment> equipment;

    @ManyToMany()
    @JoinTable(
            name = "room_service",
            joinColumns = @JoinColumn(name = "ROOM_ID"),
            inverseJoinColumns = @JoinColumn(name = "SERVICE_ID")
    )
    private List<Services> services;

    @OneToMany(mappedBy = "id_room")
    private List<Bill> listBill;
}
