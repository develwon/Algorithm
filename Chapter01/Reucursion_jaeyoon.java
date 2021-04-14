// Created on iPad (2).
import java.util.Scanner;

class Main {
    static int cnt = 0;
    public static void main(String[] args) {
        // 내가 입력한 곳으로 이동하기 / 미로의 크기는 5*5  입력한 곳은 뚫려있는 곳이어야함.
        // 시작은 0,0 / 도착위치는 입력받아 진행
        int maze[][] = {{0,0,0,0,0},
                        {0,1,0,1,0},
                        {0,0,1,1,1},
                        {1,0,0,0,0},
                        {0,0,1,1,0}};
        Scanner scn = new Scanner(System.in);
        System.out.println(" x position insert ");
        int num1 = scn.nextInt();
        System.out.println(" y position insert ");
        int num2 = scn.nextInt();
        System.out.println(" Move to x, y = " + num1 +", "+ num2);
        int rslt = Recursion(num1, num2);
        System.out.println(rslt);
    }
    public static void Recrusion(int num1, int num2){
        // 
    }
}