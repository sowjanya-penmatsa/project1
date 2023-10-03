package com.tnsif.multilevelinheritance;

public class City extends State {
	public City(String countryname) {
		super(countryname);
        // TODO Auto-generated method stub
	}
	
     private String cityname;

	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
}