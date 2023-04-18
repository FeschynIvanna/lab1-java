package ua.lviv.iot.algo.part.lab3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.*;

public class PenWriter {
    public void writeToFile(List<Pen> pens, String fileName) throws IOException {
        if (pens == null || pens.isEmpty()) {
            return;
        }

        FileWriter writer = new FileWriter(fileName);
        Map<String, Boolean> headerMap = new HashMap<>();

        pens.sort(new Comparator<Pen>() {
            @Override
            public int compare(Pen p1, Pen p2) {
                return p1.getClass().getSimpleName().compareTo(p2.getClass().getSimpleName());
            }
        });

        for(Pen pen : pens){
            if(!headerMap.containsKey(pen.getClass().getSimpleName())){
                writer.write(pen.getHeaders() + "\n");
                headerMap.put(pen.getClass().getSimpleName(), true);
            }
            writer.write(pen.toCSV() + "\n");
        }

        writer.close();
    }
}