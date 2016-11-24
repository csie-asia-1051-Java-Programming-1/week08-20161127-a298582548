package ex;
/*
 * Topic: 將前一題加強成可以做10以下的各種數字系統轉換
 * Date: 2016/11/21
 * Author: 105021010 邱信喆
 */

import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        System.out.print("請問要從幾進制:");
        int v1 = scn.nextInt();
        System.out.print("轉換成幾進制:");
        int v2 = scn.nextInt(); 
        System.out.print("被轉換數字:");
        int v3 = scn.nextInt();
        int v4 = 0;
        int v5 = 0;   
        for(int i = 1;v3>0;i*=v1){
        v4 = v3 % 10;
        v3 = v3 / 10;
        v5 = v5 + (v4 * i);
        }
        System.out.print(new StringBuilder(fun1(v2,v5)).reverse().toString());
	}
	public static String fun1(int v2,int v5){
        String v6 = "";
        int v7 = 0;
        while(v5>0){
        v7 = v5 % v2;
        v6 = v6 + "" + v7;
        v5 = v5 / v2;
        }  
        return v6;  
	}
}
