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
@Table(name = "room_type")
public class Room_Type {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ROOM_TYPE_ID", nullable = false)
    private int room_type_id;

    @Column(name = "ROOM_TYPE_NAME")
    private String room_type_name;

    @Column(name = "PEOPLE_MIN")
    private int people_min;

    @Column(name = "PEOPLE_MAX")
    private int people_max;

    @Column(name="PRICE")
    private float price;

    @OneToMany(mappedBy = "id_room")
    private List<Room> listRoom;
}
