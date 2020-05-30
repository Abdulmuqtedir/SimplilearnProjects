package assistedjava;

import java.io.IOException;

class DemoThrows2 {
	
		void m() throws IOException{
		throw new IOException("device error");//checked exception  
		  }  
		void n() throws IOException{  
		m();  
		  }  
		void p(){  
		try{
		n();  
		   }
		catch(Exception e)
		{
		System.out.println("exception handled");
		}  
		}  
		public static void main(String args[]){  
		   DemoThrows2 obj=new DemoThrows2();  
		obj.p();  
		System.out.println("normal flow...");
		
		}

}
