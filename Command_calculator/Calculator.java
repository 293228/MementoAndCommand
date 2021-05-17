package Command_calculator;

import java.util.Scanner;

public class Calculator {

    Scanner sc = new Scanner(System.in);
    public void add(){
        System.out.println("请输入两个整数：");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("两个整数的和为："+(a+b));
    }

    public void subtract(){
        System.out.println("请输入两个整数：");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("两个整数的差为："+(a-b));
    }

    public void multiply(){
        System.out.println("请输入两个整数：");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("两个整数的积为"+(a*b));
    }

    public void divide(){
        System.out.println("请输入两个整数：");
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
            System.out.println("两个整数的商为"+(a/b));
        }catch (Exception e){
            System.out.println("程序出错，被除数不能为0");
        }
    }

}
