package com.salone.hackathon;

import java.util.HashMap;
import java.util.Map;

public class QuestionFive {

    public static void main(String[] args) {

        Map<String, Integer> multipleKeysMap = new HashMap<>(){{
                put("hi bye there",3);
                put("go there hi",4);
        }};


        sumUpKeyValue(multipleKeysMap,"hi bye there",4);


    }


    public static void sumUpKeyValue(Map<String,Integer> inputMap, String key, int increment){

        if(inputMap.isEmpty()){
            System.out.println("Please put some keys and values into the Map");
        }
        if(key.equals("")){
            System.out.println("Provide a key");
        }
        if(increment < 0){
            System.out.println("Input positive increment values.");
        }
        if(!inputMap.isEmpty() && (!key.isEmpty()) && (increment > 0)){
            if(inputMap.containsKey(key)){
                int keysValue = inputMap.get(key);

                keysValue += increment;

                inputMap.put(key,keysValue);

                System.out.println(key + " new value is " + inputMap.get(key));
            }
        }


    }

}
