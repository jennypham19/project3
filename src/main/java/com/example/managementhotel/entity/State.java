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
@Table(name="state")
public class State {
    @Id
    @Column(name = "STATE_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int state_id;

    @Column(name = "STATE_NAME")
    private String state_name;

    @OneToMany(mappedBy = "id_state")
    private List<Room> listRoom;

}
