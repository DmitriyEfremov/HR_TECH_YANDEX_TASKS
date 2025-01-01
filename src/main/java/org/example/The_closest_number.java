package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class The_closest_number {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        byte amount = Byte.parseByte(reader.readLine());
        byte[] numbers = new byte[amount];
        String[] input = reader.readLine().split(" ");
        for(byte i=0;i<amount;i++){
            byte cur=Byte.parseByte(reader.readLine());
            byte j=i;
            while (j>0 && numbers[j-1]>cur){
                numbers[j]=numbers[j-1];
                j--;
            }
            numbers[j]=cur;
        }
        System.out.println(Arrays.toString(numbers));
        reader.close();
    }
}
