package array;
import java.util.Scanner;
public class matrixmultiplication {
	
	
			public static void main(String args[]) {
				int n;
				Scanner input = new Scanner (System.in);
				System.out.println("enter the base of squared matrices");
				n= input.nextInt();
				int[][]a=new int [n][n];
				int[][]b= new int [n][n];
				int[][]c= new int [n][n];
				
				System.out.println("Enter the elements of first matrix rowwise");
				for(int i=0;i<n;i++)
				{
					for(int j=0; j<n;j++)
			        {
					a[i][j]= input.nextInt();
		        }
			}
				System.out.println("Enter the elements of second matrix rowwise");
				for(int i=0;i<n;i++)
				{
					for(int j=0; j<n;j++)
			        {
					b[i][j]= input.nextInt();
			        }
				}
				
			
			System.out.println("Multiplying the matrices");
			for(int i=0;i<n;i++)
			{
				for(int j=0; j<n;j++)
		        {
					for (int k=0;k<n;k++)
		              {
			   c[i][j]+=a[i][k]*b[k][j];
			}
		   }
		}
			System.out.println("the product is");
			for(int i=0;i<n;i++)
			{
				for(int j=0; j<n;j++)
		        {
				System.out.println(c[i][j]+"");
		        }
				System.out.println();
			}
			input.close();
			}
		}
			



