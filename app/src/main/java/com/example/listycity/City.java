package com.example.listycity;

/**
 * This is a class that defines a City.
 */
public class City implements Comparable<City>{
    private String city;
    private String province;
    /**
     * makes a city with given city name and province.
     *
     * @param city
     * city name
     * @param province
     * province name
     */
    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * returns city name
     *
     * @return
     * returns city name
     */
    String getCityName(){
        return this.city;
    }
    String getProvinceName(){
        return this.province;
    }
    /**
     * alphabetically compares this city name to another city name
     *
     * @param o
     * the other City object to compare to
     * @return
     * returns either a negative (less) /positive num (greater) or zero (equal) when comparing
     *
     */
    @Override
    public int compareTo(City o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName());
    }
}
