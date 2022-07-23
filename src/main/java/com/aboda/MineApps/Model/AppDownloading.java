package com.aboda.MineApps.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppDownloading {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer downloadID;

    private String howDownload;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "appID",insertable = false,updatable = false)
    private APP app;
    private Integer appID;




}
