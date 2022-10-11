package be.pxl.ja.knapsack;

import lombok.NoArgsConstructor;

import java.util.Collections;
import java.util.List;

@NoArgsConstructor
public class KnapsackUtil<I extends Item> {
    public static <T extends Comparable<T> & Item> void fill(Knapsack<T> knapsack, Inventory<T> inventory) {
        List<T> items = inventory.getItems();
        Collections.sort(items);

        for (T item : items) {
            try {
                knapsack.add(item);
            } catch (KnapsackFullException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
