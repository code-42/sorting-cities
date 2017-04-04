package org.launchcode;

import org.launchcode.comparators.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

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
        printCities(states);

        ArrayList<City> population = CityData.loadData();
        PopulationComparator comparatorP = new PopulationComparator();
        population.sort(comparatorP);
        printCities(population);

        ArrayList<City> area = CityData.loadData();
        AreaComparator comparatorA = new AreaComparator();
        area.sort(comparatorA);
//        printCities(area);

    List<Comparator<City>> comparators = new ArrayList<Comparator<City>>();
    CompoundComparator comparer = new CompoundComparator();
    comparer.add(new StateComparator());
    comparer.add(new PopulationComparator());
    }

    private static void printCities(ArrayList<City> cities) {

        System.out.println(City.getTableHeader());

        for(City c : cities) {
            System.out.println(c);
        }

    }


}
