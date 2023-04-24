import java.util.*;

public class Main {
    public static void main(String[] args) {
        String [] myWords = new String [] {"anna", "noon", "level", "deed"};
        myMethod(myWords);
        }

        public static void myMethod (String [] myWords){
            List<String> myList = new ArrayList<>();

        for (String myWord: myWords){
            char [] myChars = myWord.toCharArray();
            Map<Character, Integer> myMap = new HashMap<>();
            for (Character character: myChars){
                if(myMap.containsKey(character)){
                    Integer value = myMap.get(character) +1;
                    myMap.put(character, value);
                } else {
                    myMap.put(character, 1);
                }
            }
            boolean isRightWord = true;

            for (Character key: myMap.keySet()){
                if(myMap.get(key) %2 != 0){
                    isRightWord = false;
                }
            }
            if (isRightWord){
                myList.add(myWord);
            }

        }
        Set<Character> mySet = new HashSet<>();
        for(String word: myList){
            for (Character character: word.toCharArray()) {
            mySet.add(character);
            }
        }
        System.out.println(mySet);
        }
    }

