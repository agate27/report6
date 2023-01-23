package jp.ac.uryukyu.ie.e225722;

import java.util.Random;
import java.util.Scanner;

public class Player {

    public String Solution(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input;
    }
    
    public int dice(){
        System.out.println("謎のダイスを振る");
        Random ran = new Random();
        int number = ran.nextInt(40);
        return number;
    }

}
