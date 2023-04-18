package ua.lviv.iot.algo.part1.laba2;
import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)

public class SchoolPen extends Pen {
    private int numPencils;
    private int numPens;
    private int numErasers;
    private final int pricePencils  = 2;
    private final int pricePen = 5;
    private final int priceErasers = 3;

    public SchoolPen(int id, String color, String brand, int size,int numPencils, int numPens, int numErasers) {
        super(id, color, brand,size);
        this.numPencils = numPencils;
        this.numPens = numPens;
        this.numErasers = numErasers;
    }

    @Override
    public int calculatePrice() {
        return numPencils * pricePencils + numPens * pricePen + numErasers * priceErasers;
    }

    public void addPencil() {
        if (numPencils < size){
            numPencils++;
        }
    }
    public void addPen() {
        if (numPens < size){
            numPens++;
        }
    }
    public void removePencil(){
        if (numPencils > 0){
            numPencils--;
        }
    }
    public void removePen() {
        if (numPens > 0) {
            numPens--;

        }
    }
}