package ex;
import java.util.*;
/*
 * Topic: 請用類別撰寫一個計算機，透過計算機物件可以計算 加、減、乘、除、平方、立方、開根號的功能
 * Date: 2016/11/21
 * Author: 105021010 邱信喆
 */

public class ex04 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		computer cop = new computer();
		float v1 = scn.nextFloat();
		char v2 = scn.next().charAt(0);
		float v3 = 0;
		if(v2 =='+'||v2=='-'||v2 =='*'||v2=='/'){
			v3 = scn.nextFloat();
		}
		System.out.println(computer.fun1(v1,v2,v3));
	}
	static class computer{

		public static float fun1(float v1,char v2,float v3){
				float v4 = 0;
				switch(v2){
				case '+':
					v4 = v1+v3;
					break;
				case '-':
					v4 = v1-v3;
					break;
				case '*':
					v4 = v1*v3;
					break;
				case '/':
					v4 = v1/v3;
					break;
				case '^':
					v4 = (float)Math.pow(v1, 2);
					break;
				case '3':
				    v4 = (float)Math.pow(v1,3);
				    break;
				case '√':
					v4 = (float)Math.pow(v1, 1/2f);
					break;
				}
			 return v4;
		    	
		}
		
	}
}
   
    

