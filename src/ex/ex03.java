package ex;
/*
 * Topic:  寫一程式計算兩個矩陣的乘法，例如 A 是 n1 x m1 的矩陣， B 是 n2 x m2 的矩 陣，C=AB 為 n1 x m2 矩陣
	第一列輸入 n1, m1, n2 及 m2 等 4 個整數，n1, m1 是第一個陣列的列(row)與行 (column)，而 n2, 
	m2 則是第二個陣列的列(row)與行(column)，其中 m2 = n2。接著輸入兩個陣列的內容。
 * Date: 2016/11/21
 * Author: 105021010 邱信喆
 */
import java.util.Scanner;
public class ex03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        System.out.println("輸入兩個要相乘的陣列");
        System.out.print("請問要輸入:");
        int v1 = scn.nextInt();
        System.out.print("*");
        int v2 = scn.nextInt();  
        System.out.print("乘上:");
        int v3 = scn.nextInt();
        System.out.print("*");
        int v4 = scn.nextInt();
        if(v1 == v4 && v2 == v3){
        System.out.print("輸入你的第一個陣列");       
        int[][]v5 = new int[v1][v2];
	    for(int i = 0;i<v1;i++){
	    	for(int j = 0;j<v2;j++){
	    		v5[i][j]=scn.nextInt();
	    }
	    }
	     System.out.print("輸入你的第二個陣列");
	     int[][]v6 = new int[v3][v4];
		 for(int h = 0;h<v3;h++){
		    for(int k = 0;k<v4;k++){
		    	v6[h][k]=scn.nextInt(); 
	    }
		}
		 int[][]v7 = new int[v1][v3];
		 for(int p = 0;p<v1;p++){
			 for(int o = 0;o<v3;o++){
				 for(int y = 0;y<v1*v3;y++){ 
				 v7[p][o] = (v5[0][0]) * (v6[0][0]) + (v5[1][0]) * (v6[0][1])+ (v5[2][0]) * (v6[0][2]);
				 }
				 System.out.println("");
				 }
			 }
        }
		    else{
			System.out.print("兩陣列無法相乘!");
		}
}
}

