package ex;
/*
 * Topic: 請用類別撰寫一個計算機，透過計算機物件可以計算 加、減、乘、除、平方、立方、開根號的功能
 * Date: 2016/11/21
 * Author: 105021010 邱信喆
 */
import java.util.Scanner;
public class ex04 {

	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        OW YYY = new OW();
        int v1 = scn.nextInt();
        int v2 = scn.nextInt();
        String v3 = scn.next();
        System.out.print(YYY.compute(v1,v2,v3));
	}
	class OW{
		
	}
    public float compute(float v1,float v2,char v3){
		return v3;
    	
    }
}
