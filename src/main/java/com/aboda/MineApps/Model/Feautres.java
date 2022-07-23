package com.aboda.MineApps.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Feautres {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer feautreId;

    private String feautre;

    @ManyToOne
    @JoinColumn(name = "appID",insertable = false,updatable = false)
    private APP app;
    private int appID;
}
