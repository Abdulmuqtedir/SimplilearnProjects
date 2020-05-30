package assistedjava;

import java.io.FileOutputStream;

public class DemoTryWith {
	
	public static void main(String[] args) {
		
		try(FileOutputStream fileOutputStream =new FileOutputStream("abc.txt")){      
			String msg = "Welcome to Java!";      
			byte byteArray[] = msg.getBytes(); //converting string into byte array      
			fileOutputStream.write(byteArray);  
System.out.println("Message has been written to file successfuly!");      
			}catch(Exception exception){  
			       System.out.println(exception);  
			} 
	}
}

