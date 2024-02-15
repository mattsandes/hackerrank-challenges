package otherchallenges.code;

import otherchallenges.code.classes.Student;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /*circulo
        Circle c1 = new Circle();

        c1.ratio = 5.67;

        System.out.println("Calculando raio:");
        System.out.println(c1.calculateRatio());

        System.out.println("Calculando perimetro:");
        System.out.println(c1.calculatePerimeter()); */

        //Conta bancaria;
//        BankAccount ab1 = new BankAccount();
//
//        ab1.accountNumber = 123456;
//        ab1.accountName = "Mateus Sandes";
//        ab1.balance = 500;
//
//        //fazendo depoistos;
//        ab1.makeDeposit(500);
//        ab1.makeDeposit(500);
//        ab1.makeDeposit(500);
//        ab1.makeDeposit(500);
//
//        System.out.println(ab1.balance);
//
//        //fazendo saques;;
//        ab1.makeWithdraw(500);
//
//        System.out.println(ab1.balance);
//
//        ab1.makeWithdraw(5000);

        //Calculando a area do triangulo;

//        Retangle r1 = new Retangle();
//
//        r1.height = 12.9;
//        r1.width = 3.4;
//
//        //calculando a area do retangulo;
//
//        System.out.println(r1.calculateArea());
//
//        //calculando o perimetro do retangulo;
//
//        System.out.println(r1.calculatePerimeter());

        //lidando com estudates

        Student s1 = new Student(
                "Mateus",
                3452,
                5.6, 3.3, 4.4, 5.5);

        s1.gradeValidation();

        System.out.println(Arrays.toString(s1.grades));
    }
}
