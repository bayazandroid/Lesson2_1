package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(1);
        nameTemp(23,generateRandom());
        System.out.println(2);
        nameTemp(10,generateRandom());
        System.out.println(3);
        nameTemp(18,generateRandom());
        System.out.println(4);
        nameTemp(20,generateRandom());
        System.out.println(5);
        nameTemp(38,generateRandom());
    }
    public static String nameTemp(int age, int temperature) {
        if (temperature > 20 && temperature < 40 && age > 20 && age < 45) {
            System.out.println("можно идти гулять ");
        }
        else if (age < 20 || temperature > 0 && temperature < 28) {
            System.out.println("можно идти гулять ");
        }
        else if (age>45|| temperature>-10 && temperature<25) {
            System.out.println("можно идти гулять ");
        } else  {
            System.out.println("оставаайтесь дома ");
        }
    return String.valueOf(age+temperature);
    }
    public static  int generateRandom(){
        Random random = new Random();
        int randomNumber = random.nextInt(50)+1;
        System.out.println(randomNumber);
        return randomNumber;
    }
}
