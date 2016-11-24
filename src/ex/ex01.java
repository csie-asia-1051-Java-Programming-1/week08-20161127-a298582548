package ex;
/*
 * Topic: 請寫一個函式 (不是遞迴) 進行十進制數字轉換成二進制數字，例如十進制的 13 會輸出二進制的 1101
 * Date: 2016/11/21
 * Author: 105021010 邱信喆
 */
import java.util.Scanner;
public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int v1  = scn.nextInt();
        int v2 = 0;
        System.out.print(new StringBuilder(fun1(v1,v2)).reverse().toString());
	}
    public static String fun1(int v1,int v2){
    	String v3 = "";
    	while(v1>0){
    	v2 = v1%2;
    	v3 = v3+""+v2;
    	v1 = v1/2;
  	
    }
    	return v3;
}
}