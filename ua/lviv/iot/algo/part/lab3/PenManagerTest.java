package ua.lviv.iot.algo.part.lab3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PenManagerTest {
    private PenManager penManager;

    @BeforeEach
    void setUp() {
        penManager = new PenManager();
        penManager.addPen(new SchoolPen(101, "Red", "September",20,4, 3, 2));
        penManager.addPen(new SchoolPen(102,"Green","School",14,5, 6, 3));
        penManager.addPen(new MarkerPen(103,"Yellow","Tropic",18,6, "Technical"));
        penManager.addPen(new MarkerPen(104,"Pink","Class",17,8, "Water"));
        penManager.addPen(new RulerPen(105,"Orange","Schoolboy",13,5, "Plastic"));
        penManager.addPen(new RulerPen(106,"Grey","Sunny",12,4, "Tree"));
        penManager.addPen(new SharpenerPen(107,"Blue","1September",19,7, "Plastic"));
        penManager.addPen(new SharpenerPen(108,"White","Schoolgirl",20,9, "Metal"));
    }

    @Test
    public void testFindAllTheBiggerThan() {
        PenManager penManager = new PenManager();
        penManager.addPen(new SchoolPen(101, "Red", "September",20,4, 3, 2));
        penManager.addPen(new SchoolPen(101,"Green","School",14,5, 6, 3));
        penManager.addPen(new MarkerPen(101,"Yellow","Tropic",18,6, "Technical"));
        penManager.addPen(new MarkerPen(101,"Pink","Class",17,8, "Water"));
        penManager.addPen(new RulerPen(101,"Orange","Schoolboy",13,5, "Plastic"));
        penManager.addPen(new RulerPen(101,"Grey","Sunny",12,4, "Tree"));
        penManager.addPen(new SharpenerPen(101,"Blue","1September",19,7, "Plastic"));
        penManager.addPen(new SharpenerPen(101,"White","Schoolgirl",20,9, "Metal"));

        penManager.findAllTheBiggerThan(17);
    }

    @Test
    void testFindAllTheBiggerThanHigherThanAllPens() {
        PenManager penManager = new PenManager();
        penManager.addPen(new SchoolPen(101, "Red", "September",20,4, 3, 2));
        penManager.addPen(new SchoolPen(101,"Green","School",14,5, 6, 3));
        penManager.addPen(new MarkerPen(101,"Yellow","Tropic",18,6, "Technical"));
        penManager.addPen(new MarkerPen(101,"Pink","Class",17,8, "Water"));
        penManager.addPen(new RulerPen(101,"Orange","Schoolboy",13,5, "Plastic"));
        penManager.addPen(new RulerPen(101,"Grey","Sunny",12,4, "Tree"));
        penManager.addPen(new SharpenerPen(101,"Blue","1September",19,7, "Plastic"));
        penManager.addPen(new SharpenerPen(101,"White","Schoolgirl",20,9, "Metal"));

        penManager.findAllTheBiggerThan(18);
    }

    @Test
    public void testFindByColor() {
        PenManager penManager = new PenManager();
        penManager.addPen(new SchoolPen(101, "Red", "September",20,4, 3, 2));
        penManager.addPen(new SchoolPen(101,"Green","School",14,5, 6, 3));
        penManager.addPen(new MarkerPen(101,"Yellow","Tropic",18,6, "Technical"));
        penManager.addPen(new MarkerPen(101,"Pink","Class",17,8, "Water"));
        penManager.addPen(new RulerPen(101,"Orange","Schoolboy",13,5, "Plastic"));
        penManager.addPen(new RulerPen(101,"Grey","Sunny",12,4, "Tree"));
        penManager.addPen(new SharpenerPen(101,"Blue","1September",19,7, "Plastic"));
        penManager.addPen(new SharpenerPen(101,"White","Schoolgirl",20,9, "Metal"));

        penManager.findByColor("Green");
    }

        @Test
        public void testAddPen() {
            penManager.addPen(new RulerPen(104, "Black", "Office", 12, 3, "Metal"));
    }

}


