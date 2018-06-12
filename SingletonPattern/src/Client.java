import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;


public class Client {

	

	public static void main(String[] args) {
		History history=History.getHistory();
		int ch=1;
		Scanner scanner=new Scanner(System.in);
		boolean turn=true;
		while(turn){
			System.out.println("Enter 1. for URL add  2. View History 3. end");
			ch=scanner.nextInt();
			switch (ch) {
			 case 1:
				 String url=scanner.next();
				 try {
					 history.writeUrl(url);
				 } catch (Exception e) {
				 System.out.println("File Not found !!");
				 	e.printStackTrace();
				 }
			
				 break;
			 case 2:
				 try {
					 String hist= new String(Files.readAllBytes(Paths.get("History.txt")));
					 System.out.println("HISTORY \n"+hist);
				 } catch (Exception e) {
					 System.out.println("Couldnt write!");
				 }
			
				 break;
			 default:
				 	
				 	turn=false;
				 break;
			}
			//history=History.getHistory();
		}
	}

}
