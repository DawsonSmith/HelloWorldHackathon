
/*
 * 			PURDUE HELLO WORLD FRESHAMN HACKATHON
 * 		- PHIT -
 * 			an Android application to help people get into physical fitness
 * 
 * 		- CONTRIBUTERS -
 * 			Ranjan Behl
 * 			Mykyta Finchenko
 * 			Jarrett Ford
 * 			Andrew Gladden
 * 			Dawson Smith
 * 
 */

import java.util.Scanner;

public class FitnessApp {

	public static void main(String[] args) {
		//Scanner input = new Scanner(System.in);
		GenerateUser user = new GenerateUser();
		System.out.println(user.getWeight());
	}
	/*
	public static double[] generateUser() {
		// Output:
		// Body Fat Percentage of Person
		// Body Mass Index
		// Range of Body Fat Percentage (Athletic, Fit, Acceptable, or Obese range)
		// Exercise with intensity
		//
		//
		Scanner input = new Scanner(System.in);
		String sex;
		double weight;
		double wristCircumference;
		double waistCircumference;
		double forearmCircumference;
		double hipCircumference;
		double bodyFatPercentage;
		double bodyMassIndex;
		double factor1;
		double factor2;
		double factor3;
		double factor4;
		double factor5;
		double leanBodyMass;
		double bodyFatWeight;
		double height;

		System.out.println("Welcome to Your Personal Fitness Application");
		System.out.println("Please Enter Your Gender (Male or Female): ");
		sex = input.next();
		System.out.println("Please Enter your Height in Inches: ");
		height = input.nextDouble();
		System.out.println("Please Enter Your Weight in Pounds: ");
		weight = input.nextDouble();
		System.out.println("Please Enter Your Wrist Circumference in Inches (At Fullest Point) : ");
		wristCircumference = input.nextDouble();
		System.out.println("Please Enter Your Waist Circumference in Inches (At Naval) : ");
		waistCircumference = input.nextDouble();
		System.out.println("Please Enter Your Forearm Circumference in Inches (At Fullest Point) : ");
		forearmCircumference = input.nextDouble();
		System.out.println("Please Enter Your Hip Circumference in Inches (At Fullest Point) : ");
		hipCircumference = input.nextDouble();
		if (sex.equals("Female"))
			;
		{
			factor1 = (weight * .732) + 8.987;
			factor2 = wristCircumference / 3.140;
			factor3 = waistCircumference * .157;
			factor4 = hipCircumference * .249;
			factor5 = forearmCircumference * .434;
			leanBodyMass = factor1 + factor2 - factor3 - factor4 + factor5;
			bodyFatWeight = weight - leanBodyMass;
			bodyFatPercentage = (bodyFatWeight * 100) / weight;
			bodyMassIndex = (weight * 703) / (height * height);
		}
		if (sex.equals("Male")) {

		}
		factor1 = (weight * 1.082) + 94.42;
		factor2 = waistCircumference * 4.15;
		leanBodyMass = factor1 - factor2;
		bodyFatWeight = weight - leanBodyMass;
		bodyFatPercentage = (bodyFatWeight * 100) / weight;
		bodyMassIndex = (weight * 703) / (height * height);
		return {weight, height};
	}
	*/
}
