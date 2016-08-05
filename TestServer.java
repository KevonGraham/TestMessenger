


package TestController;

import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;

public class TestServer {

	
	public static void main (String[] args )throws Exception
	{
		TestServer serv= new TestServer();
		
		serv.Run();
		
		
	}
	
	
	public void Run() throws Exception
	{
	 ServerSocket servTest= new ServerSocket(400);
	 Socket socTest = servTest.accept();
	 
	 InputStreamReader IR = new InputStreamReader(socTest.getInputStream());
	 BufferedReader BR= new BufferedReader(IR);
	 
	 
	 String Message = BR.readLine();
	 System.out.println(Message);
	 
	 if(Message!= null)
	 {
		PrintStream PS= new PrintStream(socTest.getOutputStream()) ;
		PS.println("Message Received ");
		
	 }
	 
	 servTest.close();
	 
	}
	 
	}
	
	
	




