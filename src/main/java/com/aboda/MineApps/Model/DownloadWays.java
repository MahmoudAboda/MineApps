package com.aboda.MineApps.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DownloadWays {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "downloadwayid")
    private Integer downloadwayid;

    @Column(name = "downloadway")
    private String downloadway;

    @ManyToOne
    @JoinColumn(name = "appID",insertable = false,updatable = false)
    private APP app;
    private int appID;

}
