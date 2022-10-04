package be.pxl.ja.citytrip;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Attraction implements Comparable<Attraction>{
    private String name;
    private double days;
    private int ratings;

    @Override
    public int compareTo(Attraction o) {
        return 0;
    }
}
