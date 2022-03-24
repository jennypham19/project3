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
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID", nullable = false)
    private int user_id;

    @Column(name = "FULLNAME")
    private String fullname;

    @Column(name = "JOB_TITLE")
    private String job_title;

    @Column(name = "USER_NAME")
    private String user_name;

    @Column(name = "PASSWORD")
    private String password;

    @ManyToMany(cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
    @JoinTable(
            name = "user_permission",
            joinColumns = @JoinColumn(name ="USER_ID"),
            inverseJoinColumns = @JoinColumn(name = "PERMISSION_ID")
    )
    private List<Permission> right;
}
