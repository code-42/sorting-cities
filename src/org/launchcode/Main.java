package org.launchcode;

import org.launchcode.comparators.NameComparator;
import org.launchcode.comparators.StateComparator;
import org.launchcode.comparators.PopulationComparator;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<City> cities = CityData.loadData();

        // TODO - Use different comparators here
        NameComparator comparator = new NameComparator();
        cities.sort(comparator);
//        printCities(cities);

        ArrayList<City> states = CityData.loadData();
        StateComparator comparatorS = new StateComparator();
        states.sort(comparatorS);
//        printCities(states);

        ArrayList<City> population = CityData.loadData();
        PopulationComparator comparatorP = new PopulationComparator();
        population.sort(comparatorP);
        printCities(population);

    }

    private static void printCities(ArrayList<City> cities) {

        System.out.println(City.getTableHeader());

        for(City c : cities) {
            System.out.println(c);
        }

    }

    private static void printStates(ArrayList<City> cities) {

        System.out.println(City.getTableHeader());

        for(City c : cities) {
            System.out.println(c);
        }

    }
}
