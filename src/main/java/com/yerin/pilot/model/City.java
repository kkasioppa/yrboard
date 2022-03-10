package com.yerin.pilot.model;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
public class City {
    private int cityId;
    private String city;
    private String lastUpdate;
}
