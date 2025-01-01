package org.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class Dictionary_of_synonyms {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<String, String> lib = new HashMap<>();
        int amount = Integer.parseInt(reader.readLine());
        for(int i=0;i<amount;i++){
            String[] input = reader.readLine().split(" ");
            lib.put(input[0],input[1]);
        }
        String to_find=reader.readLine();
        for(String i: lib.keySet()){
            if(i.equals(to_find)){
                System.out.println(lib.get(i));
                break;
            }else if(to_find.equals(lib.get(i))){
                System.out.println(i);
                break;
            }
        }
        reader.close();
        writer.close();
    }


}
