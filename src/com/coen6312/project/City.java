package com.coen6312.project;

/*
-----------Subitted By----------
Vishnu PhaniTeja Devarapu  Id: 40118286
Prathyusha Lngaladinne     Id: 40116307

*/


import java.util.List;

public class City {
	
	private static int cId = 0;
	private int cityId ;
	private String cityName;
	private String cityZipcode;
	private List<Airport> airportList;
	
	

	public City(String cityName, String cityZipcode) {
		super();
		this.cityName = cityName;
		this.cityZipcode = cityZipcode;
	}


	public City() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "City [cityName=" + cityName + ", cityZipcode=" + cityZipcode + "  ]";
	}
	
	public void displayAllCities(List<City> cityList)
	{
		for(City c : cityList)
		{
			System.out.println( "City Id:" + c.getCityId() + " " + "City Name:" + c.getCityName() + " " + "City Zip code:" + c.getCityZipcode());
		}
	}
	

	public int getCityId() {
		return cityId;
	}


	public void setCityId() {
		this.cityId = ++cId;
	}


	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCityZipcode() {
		return cityZipcode;
	}

	public void setCityZipcode(String cityZipcode) {
		this.cityZipcode = cityZipcode;
	}

	public List<Airport> getAirportList() {
		return airportList;
	}

	public void setAirportList(List<Airport> airportList) {
		this.airportList = airportList;
	}
	
	
	

}
