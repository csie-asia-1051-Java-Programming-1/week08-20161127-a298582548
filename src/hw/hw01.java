package hw;
import java.util.Scanner;
/*
 * Topic: 請寫一個 遞迴函式)進行十進制數字轉換成二進制數字，例如十進制的 13 會輸出二進制的 1101
 * Date: 2016/11/21
 * Author: 105021010 邱信喆
 */
public class hw01 {
	public static void main(String[] args) {
		 Scanner scn = new Scanner(System.in);
	        int v1  = scn.nextInt();
	        int v2 = 0;
	        String str = new StringBuilder(fun1(v1,v2)).reverse().toString();
	        System.out.print(str);
		}
	    public static String fun1(int v1,int v2){
	        if(v1 == 0){
	        	return "";
	        }else{
	        	v2 = v1%2;
	        	return v2 + "" + fun1(v1/2,v2);
	        }
	}
	

}
