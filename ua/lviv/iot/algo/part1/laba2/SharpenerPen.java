package ua.lviv.iot.algo.part1.laba2;
        import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)

public class SharpenerPen extends Pen {
    private int numSharpener;
    private String sharpenerType;
    private final int priceSharpener = 3;

    public SharpenerPen(int id, String color, String brand, int size,int numSharpener, String sharpenerType) {
        super(id,color,brand,size);
        this.numSharpener = numSharpener;
        this.sharpenerType = sharpenerType;
    }

    @Override
    public int calculatePrice() {return numSharpener * priceSharpener;}
}