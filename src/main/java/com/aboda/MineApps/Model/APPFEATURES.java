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
public class APPFEATURES {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "featureid")
    private Integer featureid;

    private String featureOverview;

    private String Features;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "appID",insertable = false,updatable = false)
    private APP app;
    private Integer appID;

}
