package ua.lviv.iot.algo.part.lab3;
        import java.util.ArrayList;
        import java.util.List;
        import lombok.*;
@Getter

public class PenManager {
    private List<Pen> pens = new ArrayList<>();
    public void findAllTheBiggerThan(int size) {
        System.out.println("Pens the biggest: ");
        pens.stream()
                .filter(pen -> pen.getSize() > size)
                .forEach(System.out::println);
    }

    public void findByColor(String color){
        System.out.println("Pens with this color:");
        pens.stream()
                .filter(pen -> pen.getColor().equals(color))
                .forEach(System.out::println);
    }


    public List<Pen> findTheBiggerThan(int size) {
        System.out.println("Pens the biggest: ");
        return pens.stream()
                .filter(pen -> pen.getSize() > size)
                .toList();
    }


    public List<Pen> findColor(String color){
        System.out.println("Pens with this color: ");
        return pens.stream()
                .filter(pen -> pen.getColor().equals(color)).toList();

    }
    public void addPen(Pen penList) {
        this.pens.add(penList);
    }


    public static void main(String[] args) {
        PenManager penManager = new PenManager();
        penManager.addPen(new SchoolPen(101, "Red", "September",20,4, 3, 2));
        penManager.addPen(new SchoolPen(101,"Green","School",14,5, 6, 3));
        penManager.addPen(new MarkerPen(101,"Yellow","Tropic",18,6, "Technical"));
        penManager.addPen(new MarkerPen(101,"Pink","Class",17,8, "Water"));
        penManager.addPen(new RulerPen(101,"Orange","Schoolboy",13,5, "Plastic"));
        penManager.addPen(new RulerPen(101,"Grey","Sunny",12,4, "Tree"));
        penManager.addPen(new SharpenerPen(101,"Blue","1September",19,7, "Plastic"));
        penManager.addPen(new SharpenerPen(101,"White","Schoolgirl",20,9, "Metal"));


        for (Pen pen : penManager.pens) {
            System.out.println(pen);
        }

        System.out.println();
        penManager.findAllTheBiggerThan(17);

        System.out.println();
        penManager.findByColor("Red");


    }
}