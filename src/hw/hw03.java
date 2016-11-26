package hw;
/*
 * Topic: 請寫一個遞迴程式，輸入一個 int 型態的資料，並回傳該資料在二進制下有多少個位元是 1，例如: 輸入 13 得到結果為 3
 * Date: 2016/11/21
 * Author: 105021010 邱信喆
 */
import java.util.Scanner;
public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int v1 = scn.nextInt();
        String v2 = fun1(v1);
        int v3 = 0;
        for(int i = 0;i < v2.length();i++){
        	if(v2.charAt(i) == 'i'){
        		v3 = v3+1;
        	}
        }
        	System.out.print(v3);
        }
        public static String fun1(int v1){
        	int v4 = 0;
        	if(v1 == 0){
        		return "";
        	}else{
        		v4 = v1%2;
        		return v4 + "" + fun1(v1/2);
        	}
        }
	}


