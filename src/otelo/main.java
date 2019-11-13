package otelo;

import java.util.Scanner;

public class main {
	public static void move(int x,int y,String s)
	{ 
		
				 
	}
	
	 public static void main(String[] args)
	 {
		 Scanner scan = new Scanner(System.in);	
			System.out.println("ukuran1: ");
			int ukuran1=Integer.parseInt(scan.nextLine());
			System.out.println("ukuran2: ");
			int ukuran2=Integer.parseInt(scan.nextLine());
			System.out.println("pemain: ");
			String pemain=scan.nextLine();
			
		move m= new move();
		 
		while(!pemain.equals("exit"))
			{
			m.gerak(ukuran1, ukuran2, pemain);
			if(m.cekup(ukuran1, ukuran2, pemain))
			{
				System.out.println("legal");
				m.flipup(ukuran1, ukuran2, pemain);
			}
			else
			{
				System.out.println("ilegeal");
			}
			
			
				m.display();
				
				System.out.println("ukuran1: ");
				 ukuran1=Integer.parseInt(scan.nextLine());
				System.out.println("ukuran2: ");
				 ukuran2=Integer.parseInt(scan.nextLine());
				System.out.println("pemain: ");
				 pemain=scan.nextLine();
			}
		 
	 }
}
