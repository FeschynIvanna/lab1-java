package ua.lviv.iot.algo.part.lab3;
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

    public String getHeaders() {return HEADER + "numSharpener" + ",sharpenerType";}

    public String toCSV(){return super.toCSV() + "," + numSharpener + "," + sharpenerType;}
}