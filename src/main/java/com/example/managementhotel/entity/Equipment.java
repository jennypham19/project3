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
@Table(name = "equipment")
public class Equipment {
    @Id
    @Column(name = "EQUIP_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int equip_id;

    @Column(name = "EQUIP_NAME")
    private String equip_name;

    @Column(name = "AMOUNT")
    private int amount;

    @Override
    public String toString() {
        return this.equip_name ;
    }
}
