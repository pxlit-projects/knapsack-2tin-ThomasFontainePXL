package be.pxl.ja.knapsack;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Attraction implements Item, Comparable<Attraction>{
    private String name;
    private double days;
    private int ratings;

    @Override
    public int compareTo(Attraction attraction) {
        return Double.compare(attraction.getDays(), days);

    }

    @Override
    public double getWeight() {
        return days;
    }
}
