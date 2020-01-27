import java.io.*;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int m=sc.nextInt();
		int arr[]=new int[100];
			if(n <=9){
	         System.out.println("please enter atleast 9 digits");}
	       else{
		   for (int i = 0; i < n; i++)
		    arr[i]=sc.nextInt();
         //System.out.println("Elemeat index " + " : "+ arr[i]);
        // arr[i]=sc.nextInt();
         
  
	       }
	       for(int i=0;i<n;i++){
	       if(arr[i] > arr[i+1])
	           m++;
	       
	       System.out.println("biggest num is"+ arr[i]);}
	       
		
		
	}
