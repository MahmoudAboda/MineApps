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
public class REQUIREMENTS {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer requirementsId;

    public String requirement;




    @ManyToOne
    @JoinColumn(name = "appID",insertable = false,updatable = false)
    private APP app;
    private int appID;


}
