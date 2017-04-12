package com.SeanDunn;
import java.util.Scanner;

public class Main {

    public static String getMessage(int userData) {
        if (userData % 2 == 1) {
            if (userData > 60)
                return (userData + " Odd and over 60");
            else return (userData + " Odd");
        }
        if (userData <= 26)
            return "Even and less than 25";
        if (userData <= 60)
            return "Even";
        if (userData > 60)
            return (userData + " Even");

        return "no matches";


    }


    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int ourInt =-1;
        boolean keepgoing=true;
        String message = "Something went wrong";


	while (keepgoing){
	    System.out.println("Enter an integer between 1 and 100");
	    if (scnr.hasNextInt()){
            ourInt=scnr.nextInt();
            if(ourInt>0 && ourInt<101){
                keepgoing = false;
            }
        }
	    scnr.nextLine();

    }

    message = getMessage(ourInt);

	System.out.println(message);




    }
}
