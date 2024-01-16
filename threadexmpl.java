import java.util.*;

class thread extends Thread{

   public void run(){
    
     System.out.println("thread is rrunnng");
     
   }

}

class t{

 public static void main(String args[]){
 
    thread tt=new thread();
    tt.start();
    tt.setName("rutvikk");
    tt.setPriority(Thread.MIN_PRIORITY);
    System.out.println(tt.getName());
     System.out.println(tt.getPriority());
 }

}
