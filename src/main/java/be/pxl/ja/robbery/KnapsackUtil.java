package be.pxl.ja.robbery;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class KnapsackUtil {
    public static void fill(Knapsack knapsack, Shop shop) {
        shop.getItems()
                .sort(Product::compareTo);

        shop.getItems()
                .forEach(product -> {
                    try {
                        knapsack.add(product);
                    } catch (KnapsackFullException e) {
                        System.out.println(e.getMessage());
                    }
                });
    }
}
