package ua.lviv.iot.algo.part1.laba2;
import lombok.*;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public abstract class Pen {
    protected int id = 101;
    protected String color;
    protected String brand;
    protected int size;

    public abstract int calculatePrice();

    }
