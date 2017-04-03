package org.launchcode.comparators;

import org.launchcode.City;

import java.util.Comparator;

/**
 * Created by LaunchCode
 */
public class PopulationComparator implements Comparator<City> {

        @Override
        public int compare(City o1, City o2) {

            return ((Integer) o1.getPopulation()).compareTo(o2.getPopulation());
        }

    }

