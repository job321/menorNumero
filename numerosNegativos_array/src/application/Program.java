package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números quer digitar?");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n;i++) {
			System.out.println("Digite o numero");
			arr[i]= sc.nextInt();
			}
		System.out.println("Os numeros negativos são");
		for(int i = 0 ;i<n;i++) {
			if(arr[i] < 0) {
				System.out.println(arr[i]);
			}
		}
			sc.close();
		}

	

}
