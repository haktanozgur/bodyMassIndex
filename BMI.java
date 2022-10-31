package com.haktanozgur.bodyMassIndex;

import java.util.Scanner;

public class BMI {

	
	public static float calculate(float height , float weight) {
		
		float result = weight / (height * height);
		
		return result;
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Lütfen boyunuzu (metre cinsinden) giriniz...");
		
		float height = scanner.nextFloat();
		
		System.out.println("Lütfen kilonuzu giriniz...");
		
		float weight = scanner.nextFloat();
		
		System.out.println("Vücut Kitle Endeksiniz : " + calculate(height, weight));
		
	}
}
