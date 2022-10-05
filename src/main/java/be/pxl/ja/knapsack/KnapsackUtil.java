package be.pxl.ja.knapsack;

import be.pxl.ja.robbery.Product;
import be.pxl.ja.robbery.Shop;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;

@NoArgsConstructor
public class KnapsackUtil {
    public static void fill(@NotNull Knapsack knapsack, @NotNull Shop shop) {
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
