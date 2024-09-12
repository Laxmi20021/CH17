package com.xworkz.RNDtask.thing;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Student {
	
	public static void main(String[] args) {
	        String fileName = "C:\\Users\\patil\\eclipse-workspace\\RND task\\src\\com\\xworkz\\RNDtask\\thing\\patil.txt";

	        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
	            String line;
	            while ((line = br.readLine()) != null) {
	                System.out.println(line); // Print each line of the file to the console
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}

