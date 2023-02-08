package arrayss;

import java.util.Arrays;

public class Arraydemo {

	public static void main(String[] args) {
		
		//how to declare an array
		//datatype[] arrayname;
		
		int[] age=new int[5];
		
		age[0]=12;
		age[1]=4;
		age[2]=13;
		age[3]=43;
		age[4]=32;
		
//		another way to create array with values
	
		
		int[] age2= {23,34,45,56,67,78};//single dimensional array
		
		//accessing the elements
		System.out.println(age2.length);
		System.out.println(age2[2]);
		
		for (int i = 0; i < age2.length; i++) {
			System.out.println(age2[i]);
		}
		System.out.println("===========================================");
		for (int a:age2) {
			System.out.println(a);//for each loop
		}
		System.out.println("===========================================");
		int[] num= {23,14,5,78,6,14};
		
		Arrays.sort(num);
		
		System.out.println(Arrays.toString(num));
		
		int[][] arr= {
				{1,2,3},
				{4,5,6}
		};
		System.out.println(arr.length);//row count
		System.out.println(arr[0].length);//column count
		System.out.println(arr[1][2]);
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
		}

}}


