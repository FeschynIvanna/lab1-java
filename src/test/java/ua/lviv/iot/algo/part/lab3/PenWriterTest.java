package ua.lviv.iot.algo.part.lab3;

import org.junit.Assert;
import org.junit.jupiter.api.*;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PenWriterTest {

    public static final String RESULT_FILENAME = "src/main/resources/result.csv";
    public static final String EXPECTED_FILENAME = "src/main/resources/File.csv";

    private List<Pen> penList;
    private PenWriter penWriter;
    private final File expectedFile = new File(EXPECTED_FILENAME);
    private File actualFile;

    @BeforeEach
    public void setUp(){
        penList = new ArrayList<>();
        penWriter = new PenWriter();
        penList.add(new SchoolPen(101, "Red", "September",20,4, 3, 2));
        penList.add(new MarkerPen(101,"Yellow","Tropic",18,6, "Technical"));
        penList.add(new RulerPen(101,"Orange","Schoolboy",13,5, "Plastic"));
        penList.add(new SharpenerPen(101,"Blue","1September",19,7, "Plastic"));
        actualFile = new File(RESULT_FILENAME);
    }

    @Test
    public void writeToFile() throws IOException {

        penWriter.writeToFile(penList, RESULT_FILENAME);

        assertTrue(Files.exists(actualFile.toPath()));
        assertEquals(Files.readAllLines(expectedFile.toPath()),
                Files.readAllLines(actualFile.toPath()));
    }

    @Test
    public void writeToFileEmptyList() throws IOException {
        penList = new ArrayList<>();

        penWriter.writeToFile(penList, RESULT_FILENAME);

        assertFalse(actualFile.exists());
    }

    @Test
    public void writeToFileExistingFil() throws IOException {
        Files.createFile(Path.of(RESULT_FILENAME));
        writeToFile();
    }

    @AfterEach
    public void tearDown() throws IOException {
        Files.deleteIfExists(Path.of(RESULT_FILENAME));
    }
}