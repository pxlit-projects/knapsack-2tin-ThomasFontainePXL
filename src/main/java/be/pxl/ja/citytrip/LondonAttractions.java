package be.pxl.ja.citytrip;

import be.pxl.ja.knapsack.Attraction;
import be.pxl.ja.knapsack.Inventory;

import java.util.ArrayList;
import java.util.List;

public class LondonAttractions extends Inventory<Attraction> {

    List<Attraction> items = new ArrayList<>();

    public void add(Attraction item) {
        items.add(item);
    }

    public List<Attraction> getItems() {
        return items;
    }
}
