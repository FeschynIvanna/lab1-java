package ua.lviv.iot.algo.part1.laba2;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)

public class MarkerPen extends Pen {
    private int numMarker;
    private String markerType;
    private final int priceMarker = 7;

    public MarkerPen(int id, String color, String brand, int size,int numMarker, String markerType) {
        super(id, color, brand, size);
        this.numMarker = numMarker;
        this.markerType = markerType;
    }

    @Override
    public int calculatePrice() {
        return numMarker * priceMarker;
    }
}