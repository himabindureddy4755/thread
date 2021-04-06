package threads;


	class Multitask extends Thread{  
		 public void run(){  
		   System.out.println("hello");  
		 }  
		 public static void main(String args[]){  
		  Multitask t1=new Multitask();  
		  Multitask t2=new Multitask();  
		  Multitask t3=new Multitask();  
		  
		  t1.start();  
		  t2.start();  
		  t3.start();  
		 }  
		}  


