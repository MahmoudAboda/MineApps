package com.aboda.MineApps.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class APP {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "appId")
    private Integer appId;

    @Column(name = "publisherName")
    private String publisherName;
    @Column(name = "appType")
    private String appType;
    @Column(name = "appName")
    private String appName;
    @Column(name = "publishDate")
    private Date publishDate;
    @Column(name = "appImage")
    private String appImage;
    @Column(name = "appOverview")
    private String appOverview;










}
