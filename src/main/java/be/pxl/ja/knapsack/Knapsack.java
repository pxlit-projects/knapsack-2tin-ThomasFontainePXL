package be.pxl.ja.knapsack;

import java.util.ArrayList;
import java.util.List;

public class Knapsack<I extends Item> {
    private List<I> items;
    private double maximumCapacity;
    public Knapsack (double weight){
        this.maximumCapacity = weight;
        this.items = new ArrayList<>();
    }

    public double getWeight() {
         return items.stream()
                 .mapToDouble(Item::getWeight)
                 .sum();
    }

    public List<I> getItems() {
        return items;
    }

    public void add(I item) throws KnapsackFullException {
        if(getWeight() + item.getWeight() <= maximumCapacity){
            items.add(item);
        }else{
            throw new KnapsackFullException("exceeds max capacity");
        }

    }
}
