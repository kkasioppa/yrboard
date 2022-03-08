package com.yerin.pilot.model;

import lombok.Getter;

import java.sql.Date;

@Getter
public class Country {
    private int countryId;
    private String country;
    private String lastUpdate;
    private String aaa;
}

/*
Country c1 = new Country();
c1.countryId = 1;
c1.country = "south korea";
c1.lastUpdate = "2006-02-15 04:44:00";

c2.. c3..

List<Country> countryList = new ArrayList<Country>();
countryList.add(c1);
countryList.add(c2);
countryList.add(c3);

countryList[0]...
 */

/*
<Country>
  <countryId>1</countryId>
  <country>south korea</country>
  <lastUpdate>2006-02-15 04:44:00</lastUpdate>
</Country>
<Country>
  <countryId>2</countryId>
  <country>south korea</country>
  <lastUpdate>2006-02-15 04:44:00</lastUpdate>
</Country>

 */