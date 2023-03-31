package ua.lviv.iot.algo.part1.laba2;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)

public class RulerPen extends Pen {
    private int numRuler;
    private String rulerType;
    private final int priceRuler = 5;

    public RulerPen(int id, String color, String brand,int size, int numRuler, String rulerType) {
        super(id, color, brand,size);
        this.numRuler = numRuler;
        this.rulerType = rulerType;
    }


    public int calculatePrice() {return numRuler * priceRuler;};
}