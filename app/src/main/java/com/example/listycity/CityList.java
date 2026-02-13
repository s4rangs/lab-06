package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city
     * This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }
    /**
     * Returns whether city is in list or not
     *
     * @param city
     * this is city to check
     * @return
     * returns true if city is in list
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * Deletes city from list
     * Throws exception if city not in list
     *
     * @param city
     * the city to delete
     * @throws IllegalArgumentException
     * if city not in  list
     */
    public void delete(City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.remove(city);
    }

    /**
     * Returns number of cities in list
     *
     * @return
     * returns cities amount
     */
    public int countCities() {
        return cities.size();
    }

    /**
     * This returns a sorted list of cities
     * @return
     * Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }
}

