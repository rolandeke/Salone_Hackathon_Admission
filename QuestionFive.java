package com.salone.hackathon;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class QuestionFive {

    public static void main(String[] args) {

     File file = new File("helloworld.csv");

        populateMapWithCSV(file);

    }



    public static void populateMapWithCSV(File file){

            Map<String, Integer> outputMap = new HashMap<>();
            try {
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String aLine;
                String [] lines;
                String trimmedString;

                while((aLine = bufferedReader.readLine()) != null){
                    lines = aLine.split(",");

                    if(lines.length > 0){
                        String newString = "";
                        for(String s : lines){
                            newString += s + " ";
                        }

                        trimmedString = newString.trim();

                        String key = trimmedString.substring(0, trimmedString.length() - 1);
                        int value = Integer.parseInt(trimmedString.substring(trimmedString.length() - 1));

                        if(!outputMap.containsKey(key)){

                            outputMap.put(key,value);
                        }else{
                            int keyValue = outputMap.get(key);
                            keyValue += value;

                            outputMap.put(key , keyValue);
                        }



                    }
                }

                System.out.println(outputMap);


            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }


    }

}
