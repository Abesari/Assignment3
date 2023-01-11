package secondSet;

public class Assignment2 {

	public static void main(String[] args) {
		String s1 = "lock1";
		String s2 = "lock2";
		
		Thread t1 = new Thread() {  
		      public void run() {  
		          synchronized (s1) {  
		           System.out.println("Thread 1: locked resource 1");  
		  
		           try { Thread.sleep(100);} catch (Exception e) {}  
		  
		           synchronized (s2) {  
		            System.out.println("Thread 1: locked resource 2");  
		           }  
		         }  
		      }  
		    };  
		  
		     
		    Thread t2 = new Thread() {  
		      public void run() {  
		        synchronized (s2) {  
		          System.out.println("Thread 2: locked resource 2");  
		  
		          try { Thread.sleep(100);} catch (Exception e) {}  
		  
		          synchronized (s1) {  
		            System.out.println("Thread 2: locked resource 1");  
		          }  
		        }  
		      }  
		    };  
		  
		      
		    t1.start();  
		    t2.start();  
		  }  
		}       