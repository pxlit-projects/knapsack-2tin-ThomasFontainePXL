package be.pxl.ja.knapsack;

import be.pxl.ja.robbery.Product;

import java.util.List;

public class Knapsack {
    private List<Product> items;
    private double maximumCapacity;
    public Knapsack (double weight){
        this.maximumCapacity = weight;
    }

    public double getWeight() {
        double weight = 0;
        for(Product p : items){
            weight += p.getWeight();
        }
        return weight;
    }

    public List<Product> getItems() {
        return items;
    }

    public void add(Product product) throws KnapsackFullException {
        if(getWeight() + product.getWeight() <= maximumCapacity){
            items.add(product);
        }else{
            throw new KnapsackFullException("exceeds max capacity");
        }

    }
}
