import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Madlibs {

	public static void main(String[] args) throws IOException {
	
		FileWriter fw = new FileWriter("MadLibs.txt");
		BufferedWriter bw= new BufferedWriter (fw);
		PrintWriter myOutput = new PrintWriter(bw);
		myOutput.println 
				("﻿But ______1______ ! What light through yonder ______2______ breaks?"+
				"It is the East, and Juliet is the ______3______ !" +
				"Arise, fair sun, and ______4______ the envious moon," +
				"Who is already sick and ______5______ with grief" +
				"That thou her ______6______ art far more fair than she." +
				"Be not her ______6______ , since she is envious." +
				"Her vestal livery is but sick and green," +
				"And none but fools do ______7______ it. Cast it off." +
				"It is my lady; O, it is my ______8______ !" +
				"O that she knew she were!" +
				"She ______9______ , yet she says nothing. What of that?" +
				"Her ______10______ discourses; I will answer it." +
				"I am too ______11______ ; `tis not to me she ______9______ ." +
				"Two of the fairest stars in all the ______12______ ," +
				"Having some business, do entreat her ______10______          " +
				"To ______13______ in their ______14______ till they return." +
				"What if her ______10______ were there, they in her head?" +
				"The ______15______ of her cheek would shame those stars" +
				"As daylight doth a lamp; her ______10______ in ______12______          " +
				"Would through the airy ______16______ stream so bright" +
				"That ______17______ would sing and think it were not night." +
				"See how she leans her cheek upon her ______18______ !" +
				"O that I were a glove upon that ______18______ ," +
				"That I might touch that cheek! ");
		myOutput.close();
	}

}
