package com.example.managementhotel.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "permission")
public class Permission {
    @Id
    @Column(name = "PERMISSION_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int permission_id;

    @Column(name = "PERMISSION_NAME")
    private String permission_name;

    @Override
    public String toString() {
        return this.permission_name;
    }
}
