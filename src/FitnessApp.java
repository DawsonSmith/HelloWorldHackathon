
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
		Scanner input = new Scanner(System.in);
		GenerateUser user = new GenerateUser(input);
		String[] parameter = {"Bicep","Forearm"};
		Exercise hammerCurl = new Exercise("Hammer Curl", "Lift the weight up to yor chest", parameter) ;
		System.out.println(hammerCurl.targetsToString());
	}
}
