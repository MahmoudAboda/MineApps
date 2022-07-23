package com.aboda.MineApps.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ABOUTUS {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="about_iD")
    private Integer about_iD;
    @Column(name="about")
    private String about;
    @Column(name="mission")
    private String mission;
    @Column(name="contact_us")
    private String contact_us;
}
