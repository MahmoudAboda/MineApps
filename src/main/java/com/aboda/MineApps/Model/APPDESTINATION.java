package com.aboda.MineApps.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class APPDESTINATION {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer destinationId;

    private String destination;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "appID",insertable = false,updatable = false)
    private APP app;
    private Integer appID;


}
