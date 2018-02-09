import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Madlibs {

	public static void main(String[] args) throws IOException {
	
		FileWriter fw = new FileWriter("MadLibs.txt");
		BufferedWriter bw= new BufferedWriter (fw);
		PrintWriter myOutput = new PrintWriter(bw);
		
		Scanner scan = new Scanner (System.in); 
		System.out.print("Enter an Adjective:");
		String one = scan.nextLine();
		System.out.println(one);
		
		System.out.print("Enter a Noun:");
		String two = scan.nextLine();
	
		System.out.println(two);
		
		System.out.print("Enter a Noun:");
		String three = scan.nextLine();
		
		System.out.println(three);
		
		System.out.print("Enter a verb:");
		String four = scan.nextLine();
	
		System.out.println(four);
		
		System.out.print("Enter a adjective:");
		String five = scan.nextLine();
		
		System.out.println(five);
		
		System.out.print("Enter a noun:");
		String six = scan.nextLine();
	
		System.out.println(six);
		
		System.out.print("Enter a verb:");
		String seven = scan.nextLine();
		scan.nextLine();
		System.out.println(seven);
		
		System.out.print("Enter a noun:");
		String eight = scan.nextLine();
		
		System.out.println(eight);
		
		System.out.print("Enter a verb that ends in s:");
		String nine = scan.nextLine();

		System.out.println(nine);
		
		System.out.print("enter body parts:");
		String ten = scan.nextLine();
		
		System.out.println(ten);
		
		System.out.print("Enter an adjective:");
		String eleven = scan.nextLine();
		
		System.out.println(eleven);
		
	
		System.out.print("Enter a place:");
		String twelve = scan.nextLine();
	
		System.out.println(twelve);
		
		System.out.print("Enter a verb:");
		String thirteen = scan.nextLine();

		System.out.println(thirteen);
		
		System.out.print("Enter a shape:");
		String fourteen = scan.nextLine();

		System.out.println(fourteen);
		
		System.out.print("Enter a Noun:");
		String fifteen = scan.nextLine();
		scan.nextLine();
		System.out.println(fifteen);
		
		System.out.print("Enter a Noun:");
		String sixteen = scan.nextLine();
	
		System.out.println(sixteen);
		
		System.out.print("Enter animals:");
		String seventeen = scan.nextLine();
	
		System.out.println(seventeen);
		
		System.out.print("Enter a Noun:");
		String eighteen = scan.nextLine();
		
		System.out.println(eighteen);
		
		
		myOutput.println
		
				("﻿But" +one+ "! What light through yonder" +two+ " breaks?"+
				"It is the East, and Juliet is the +three+ !" +
				"Arise, fair sun, and +four+ the envious moon," +
				"Who is already sick and +five+ with grief" +
				"That thou her +six+ art far more fair than she." +
				"Be not her +six+ , since she is envious." +
				"Her vestal livery is but sick and green," +
				"And none but fools do "+seven+" it. Cast it off." +
				"It is my lady; O, it is my "+eight+"!" +
				"O that she knew she were!" +
				"She +nine+ , yet she says nothing. What of that?" +
				"Her +ten+ discourses; I will answer it." +
				"I am too +eleven+ ; `tis not to me she +nine+." +
				"Two of the fairest stars in all the +twelve+ ," +
				"Having some business, do entreat her" +ten+"" +
				"To +thirteen+ in their +fouteen+ till they return." +
				"What if her "+ten+" were there, they in her head?" +
				"The +fifteen+ of her cheek would shame those stars" +
				"As daylight doth a lamp; her "+ten+" in "+twelve+"          " +
				"Would through the airy "+sixteen+" stream so bright" +
				"That "+seventeen+" would sing and think it were not night." +
				"See how she leans her cheek upon her "+eighteen+" !" +
				"O that I were a glove upon that "+eighteen+" ," +
				"That I might touch that cheek! ");
		myOutput.close();
	}

}