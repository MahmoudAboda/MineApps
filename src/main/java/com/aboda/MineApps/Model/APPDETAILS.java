package com.aboda.MineApps.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class APPDETAILS {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer detailsId;

    private float size;


    private String type;

    private String developerName;

    private Date versioningDate;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "appID",insertable = false,updatable = false)
    private APP app;
    private Integer appID;




}
