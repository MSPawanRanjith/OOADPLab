//
//import java.util.*;
//import java.io.*;
//public class Demo 
//{
//	public static void main(String[] args)
//	{
//		int c;
//		String d;
//		Scanner sc=new Scanner(System.in);
//		History h=History.getInstance();
//		String url;
//		System.out.println("1-ADD URL \n2-DISPLAY HISTORY \n3-EXIT");
//		while(true)
//		{
//			System.out.println("Enter choice");
//			c=sc.nextInt();
//			if(c==1)
//			{
//				System.out.println("Enter URL");
//				d=sc.next();
//				h.writeHistory(d);
//			}
//			else if(c==2)
//			{
//				try
//				{
//				BufferedReader br=new BufferedReader(new FileReader("History.txt"));
//				while((url=br.readLine())!=null)
//				{
//					System.out.println(url);
//				}
//				}
//				catch(Exception e)
//				{
//					System.out.println("File not found");
//				}
//			}
//			else
//				break;
//			h=History.getInstance();
//		}
//	}
//}