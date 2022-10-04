package be.pxl.ja.robbery;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Product implements Comparable<Product>{
    private String name;
    private double weight;
    private double price;

    public int compareTo(Product product){
        return Double.compare(product.getPrice(), price);
    }
}
