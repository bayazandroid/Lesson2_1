package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        System.out.println(1);
        System.out.println( nameTemp(23, generateRandom()));
        System.out.println(2);
        System.out.println( nameTemp(10, generateRandom()));
        System.out.println(3);
        System.out.println(nameTemp(18, generateRandom()));
        System.out.println(4);
        System.out.println(nameTemp(20, generateRandom()));
        System.out.println(5);
        System.out.println(nameTemp(38, generateRandom()));
    }
    public static String nameTemp(int age, int temperature) {
        if (temperature > 20 && temperature < 40 && age > 20 && age < 45) {
            return " можно идти гулять ";
        } else if (age < 20 || temperature > 0 && temperature < 28) {
            return " можно идти гулять ";
        } else if (age > 45 || temperature > -10 && temperature < 25) {
            return " можно идти гулять ";
        } else {
            return " оставайся дома ";
        }
    }

    public static int generateRandom() {
        Random random = new Random();
        int randomNumber = random.nextInt(50) + 1;
        return randomNumber;
    }

}
