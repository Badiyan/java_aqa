import java.util.*;

public class Main
{
    public static void main(String[] args) {

        String[] words = new String[]{"test", "papa", "mamas", "mama", "apoj", "їж їжак желе","їж їжак желе"};
        System.out.println(evenLettersFinder(words));
    }

    public static Set<Character> evenLettersFinder(String[] words) {

        List<String> targetList = new ArrayList<>();
        Set<Character> outputSet = new HashSet<>();


        for (String word : words){

            char[] wordArray = word.toCharArray();
            boolean isSuitable = true;

            for (char letter : wordArray){

                if (isEvenMatchCount(String.valueOf(letter), word) == false)
                        {
                            isSuitable = false;
                }
        }
            if ((isSuitable == true) && (targetList.size() < 2)){
                targetList.add(word);
                for (char letter : wordArray){
                    outputSet.add(letter);
                }
            }


    }
        return outputSet;

}


    private static boolean isEvenMatchCount(String letter, String word) {
        // IN: letter and word OUT: True/False Even match count

        int index = 0;
        int count = 0;

        while (true){
            index = word.indexOf(letter, index);
            if (index != -1)
            {
                count ++;
                index += letter.length();
            }
            else {
                break;
            }
        }
        return (count % 2 == 0);
    }
    }
