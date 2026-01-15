package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ConcatenationofAllWords {

    public static List<Integer> findSubstring(String s, String[] words) {

        List<Integer> result = new ArrayList<>();
        int i = 0;
        int j = 0;
        int lengthWord = words[0].length();
        int k = words.length * lengthWord;
        String combinedWord = String.join("", words);
        while (j <= s.length()) {

            if (s.length() == k && s.equals(combinedWord)) {
                result.add(0);
                break;
            } else {
                if (j - i + 1 == k + 1) {
                    String finalNewWord = s.substring(i, j);
                    boolean flag = false;

                    List<String> parts =
                            IntStream.range(0, words.length)
                                    .mapToObj(m -> finalNewWord.substring(m * lengthWord, (m + 1) * lengthWord))
                                    .collect(Collectors.toList());

//                System.out.println(parts);
//                System.out.println("Inital : " + newWord);


                    for (String word : words) {
                        if (parts.contains(word)) {
                            parts.remove(word);
                            flag = true;
                        } else {
//                        System.out.println(newWord);
//                        System.out.println(word);
                            flag = false;
                            break;
                        }

                    }

                    if (flag) {
                        result.add(i);
                    }

                    i++;

                }

                j++;
            }

        }
        return result;
    }


    public static void main(String[] args) {
        String s = "aaa";
        String[] words = new String[3];
        words[0] = "a";
        words[1] = "a";
        words[2] = "a";

        System.out.println(findSubstring(s, words));

    }
}
