package com.prowings;
import java.util.HashMap;
import java.util.Map;

public class CharacterCount {

public static void main(String[] args){

    printCharacterCount("Hello World");
}
public static void printCharacterCount(String s){

    if(s == null || s.isEmpty()){
        System.out.println("Input String is null or empty");
        return;
    }
    Map <Character,Integer> charCountMap = new HashMap<>();

    for(char ch : s.toCharArray()){
        charCountMap.put(ch, charCountMap.getOrDefault(ch,0)+1);
    }
    for(Map.Entry<Character,Integer> entry : charCountMap.entrySet()){
              System.out.println(entry.getKey() + ": "+ entry.getValue());
    }
  }
}
