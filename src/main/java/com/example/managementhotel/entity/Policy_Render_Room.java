package com.example.managementhotel.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "policy_render_room")
public class Policy_Render_Room {
    @Id
    @Column(name = "POLICY_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int policy_id;

    //    thời gian quy định trả
    @Column(name = "REQUEST_TIME")
    @DateTimeFormat(pattern = "hh/mm/ss")
    private Time request_time;

    //    phụ thu
    @Column(name = "LEVY")
    private Long levy;

    @OneToMany(mappedBy = "id_policy")
    private List<Room> listRoom;

}
