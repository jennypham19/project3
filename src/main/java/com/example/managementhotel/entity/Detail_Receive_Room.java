package com.example.managementhotel.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.sql.Time;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "detail_room_receive_voucher")
public class Detail_Receive_Room {
    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "DATE_RECEIVE")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "mm/dd/yy")
    private Date date_receive;

    @Column(name = "DATE_RENDER_EXPECT")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "mm/dd/yy")
    private Date date_render_expect;

    @Column(name = "DATE_RENDER_FACT")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "mm/dd/yy")
    private Date date_render_fact;

    @Column(name = "HOUR_RECEIVE")
    @DateTimeFormat(pattern = "hh/mm/ss")
    private Time hour_receive;

    @Column(name = "HOUR_RETURN")
    @DateTimeFormat(pattern = "hh/mm/ss")
    private Time hour_render;
}
