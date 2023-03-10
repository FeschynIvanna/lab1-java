package ua.lviv.iot.algo.part1.lab1;
        import lombok.AllArgsConstructor;
        import lombok.Getter;
        import lombok.NoArgsConstructor;
        import lombok.Setter;
        import lombok.ToString;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SchoolPen {
    private int id = 101;
    private String brand;
    private String color;
    private String material;
    private int size;
    private int numPencils;
    private int numPens;
    private int numErasers;
    private static SchoolPen instance;
    public static SchoolPen getInstance() {
        if (instance == null) {
            instance = new SchoolPen();
        }
        return instance;
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
    public void removePen(){
        if (numPens > 0){
            numPens--;
        }
    }
    public static void main(String[] Args) {
        SchoolPen[] schoolPens = new SchoolPen[4];
        schoolPens[0] = new SchoolPen();
        schoolPens[1] = new SchoolPen(101, "September", "red", "cotton", 20, 7, 3, 2);
        schoolPens[2] = SchoolPen.getInstance();
        schoolPens[3] = SchoolPen.getInstance();
        for (int i = 0; i < schoolPens.length; i++) {
            System.out.println(schoolPens[i].toString());
        }
    }
}
