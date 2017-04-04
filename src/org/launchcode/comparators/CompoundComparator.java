package org.launchcode.comparators;

import org.launchcode.City;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Inspired by LaunchCode
 * Edited by Edward Dupre on 4/3/17.
 */
public class CompoundComparator implements Comparator<City>{

    private Comparator<City> cityComparator;
    private List<Comparator<City>> comparators = new ArrayList<>();

    public void add() {
        add();
    }

    public void add(Comparator<City> cityComparator){
        this.cityComparator = cityComparator;
        comparators.add(this.cityComparator);
    }

    @Override
    public int compare(City o1, City o2) {
        for (int i = 0; i < comparators.size(); i++) {
            for (int j = 0; j < comparators.size(); j++) {
                return ((Integer) o1.getPopulation()).compareTo(o2.getPopulation());
            }
        }
        return o1.getState().compareTo(o2.getState());
    }

}
