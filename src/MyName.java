import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MyName {

	public static void main(String[] args) throws IOException {
	FileWriter fw = new FileWriter ("MyName.txt");
	BufferedWriter bw= new BufferedWriter (fw);
	PrintWriter myOutput = new PrintWriter(bw);
	myOutput.println
		   ("RRRR    (◕‿◕✿)          ôヮô  MM        MM    \r\n" + 
			"RRRRRR  (◕‿◕✿)          ôヮô  MMMM     MMMM     \r\n" + 
			"RR  RR  (◕‿◕✿)          ôヮô  MM MM   MM MM      \r\n" + 
			"RRRRR   (◕‿◕✿)    	ôヮô  MM  MM MM   MM  \r\n" + 
			"RRR     (◕‿◕✿)(ꈍ ˬ ꈍ✿) ôヮô  MM   MMM    MM       \r\n" + 
			"RR RR   (◕‿◕✿)          ôヮô MM    MM     MM \r\n" + 
			"RR  RR  (◕‿◕✿)          ôヮô MM           MM    \r\n" + 
			"RR   RR (◕‿◕✿)          ôヮô MM           MM       \r\n" + 
			"RR    RR(◕‿◕✿)          ôヮô MM           MM"          );

	myOutput.close();
	}
}

