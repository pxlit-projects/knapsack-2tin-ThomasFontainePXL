package be.pxl.ja.knapsack;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Product implements Item, Comparable<Product>{
    private String name;
    private double weight;
    private double price;

    public int compareTo(Product product){
        return Double.compare(product.getPrice(), price);
    }
}
