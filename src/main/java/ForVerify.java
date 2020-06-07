

import java.util.Scanner;

public class ForVerify {
    static Dog dog = new Dog(Gender.FEMALE, 44.4);

    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //printValid();
        double race = dog.getRace(44.4);
        System.out.println(race);
    }

    public static void printValid() {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter double number for weight");
        double number = dog.getWeight(sc.nextDouble());

            while (number == 0) {
                System.out.println(number +"  is invalid weight");
                System.out.println("please enter double number for weight");
                number = sc.nextDouble();
            }
        if(number != 0){
            System.out.println("your dog weight is: " + number);
        }

        }

    }





