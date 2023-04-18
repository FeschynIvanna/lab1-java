package ua.lviv.iot.algo.part.lab3;
        import lombok.*;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public abstract class Pen {
    protected int id = 101;
    protected String color;
    protected String brand;
    protected int size;

    public static final String HEADER = "id, color, brand, size";
    public abstract int calculatePrice();

    public  String getHeaders(){ return HEADER;}

    public String toCSV() {return id + "," + color + "," + brand + "," + size;}



}
