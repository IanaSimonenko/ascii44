package com.company;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        FileInputStream inputStream = new FileInputStream(fileName);
        int counter=0;
        while (inputStream.available()>0) {
            if (inputStream.read()==44) {
                counter++;
            }
        }
        reader.close();
        inputStream.close();
        System.out.println(counter);
    }
}
