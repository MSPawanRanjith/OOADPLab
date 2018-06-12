import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;


public class History {

	private static History history=null;
	
	private History() {
		
	}
	
	public static History getHistory() {
		if(history==null){
			history=new History();
		}
		return history;
	}
	
	public void  writeUrl(String url) throws Exception {
		PrintWriter printWriter=new PrintWriter(new BufferedWriter(new FileWriter("History.txt",true)));
		printWriter.println(url);
		printWriter.close();
	}

}
