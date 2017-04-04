package org.launchcode.comparators;

import org.launchcode.City;

import java.util.Comparator;

/**
 * Created by LaunchCode
 */
public class AreaComparator implements Comparator<City> {

    @Override
    public int compare(City o1, City o2) {
        return ((Double)o1.getArea()).compareTo(o2.getArea());
    }

}
