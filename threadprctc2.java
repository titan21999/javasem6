import java.util.*;
import java.io.*;

class xyz extends Thread{

	public void run(){

		System.out.println("Name of thread is:"+ Thread.currentThread().getName());
		System.out.println("Priority of thread is:"+ Thread.currentThread().getPriority());

	}
}

class threadprctc2e{

	public static void main( String args[]){

		xyz f = new xyz();
		f.setName("First Thread");
		f.setPriority(10);
		f.start();

		xyz h = new xyz();
		h.setName("Second Thread");
		h.setPriority(9);
		h.start();

		xyz s = new xyz();
		s.setName("Third Thread");
		s.setPriority(6);
		s.start();

	}
}

