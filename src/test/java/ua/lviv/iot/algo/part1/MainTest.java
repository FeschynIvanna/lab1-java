package ua.lviv.iot.algo.part1;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testMain() {
        String text = "Вони коли-не будь стояли віч-на-віч, не говорячи будь-якого слова!\n" +
                "Коли-не будь сльози ображених повернуться до винуватого!\n" + "Будь-ласка, підніміть телефон!";
        String expected = "Вони коли-не будь стояли віч-на-віч, не говорячи будь-якого слова!";
        String result = "Вони коли-не будь стояли віч-на-віч, не говорячи будь-якого слова!";
        Pattern pattern = Pattern.compile("\\b[A-Za-z]+-[A-Za-z]+\\b\\s+[A-Za-z]+-[A-Za-z]+\\b.*!");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            String[] words = matcher.group().split("\\s+");
            if (words.length > 2) {
                result = matcher.group();
            }
        }
        assertEquals(expected, result);
    }

    @Test
    public void testWhenTheTextIsEmpty() {
        String pattern = "([А-Я][^!?]*?)(!+)";
        String text = " ";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        boolean outputExists = false;
        while (m.find()) {
            String sentence = text.substring(m.start(), m.end() - 1);
            String[] words = sentence.split("\\s+");
            int countHyphenWords = 0;
            for (String word : words) {
                if (word.contains("-")) {
                    countHyphenWords++;
                }
            }
            if (countHyphenWords > 2) {
                outputExists = true;
            }
        }
        assertFalse(outputExists);
    }
}
