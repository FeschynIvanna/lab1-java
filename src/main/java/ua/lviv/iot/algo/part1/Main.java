 package ua.lviv.iot.algo.part1;
          import java.util.regex.Matcher;
          import java.util.regex.Pattern;
 public class Main {
     public static void main(String[] args) {
         String pattern = "([А-Я][^!?]*?)(!+)";
         String text = "Вони коли-не будь стояли віч-на-віч, не говорячи будь-якого слова!\n" +
                 "Коли-не будь сльози ображених повернуться до винуватого!\n" + "Будь-ласка, підніміть телефон!";
         Pattern p = Pattern.compile(pattern);
         Matcher m = p.matcher(text);
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
                 System.out.println(sentence);
             }
         }
     }
 }
