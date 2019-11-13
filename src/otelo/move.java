package otelo;

public class move {
	String[][] arr= new String[50][50];
	public move()
	{
		 for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8; j++) {
					arr[j][i]=".";
					
				}
			}
		 arr[3][3]="P";
		 arr[3][4]="H";
		 arr[4][3]="H";
		 arr[4][4]="P";
	}
	public void display()
	{
		 for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.print(arr[j][i]);
			}
			System.out.println("");
		}
	}
	public void gerak(int x, int y,String s)
	{	
		if(s.equals("P"))
		{
			arr[x][y]="P";
		}
		else if(s.equals("H"))
		{
			arr[x][y]="H";
		}
	}
	public boolean cekup(int x, int y,String pemain)
	{
		int i=1;	
		String p=pemain;
		String m="";
		
		if(p.equals("P"))
		{
			m="H";
		}
		else
		{
			m="P";
		}
			if(y==0)
			{
				return false;			
			}
			else
			{			
					if(arr[x][y-1].equals(".")||arr[x][y-1].equals(p))
					{
						return false;							
					}
					else
					{
						while(y-i>=0 && arr[x][y-i].equals(m))
						{
							i++;
						}
						if(y-i<0)
						{
							return false;						
						}
						else if(arr[x][y-i].equals("."))
						{
							return false;
						}
						else
						{
							return true;
						}
					}
			}	
	}
	public void flipup(int x, int y,String pemain)
	{
		int i=1;	
		String p=pemain;
		String m="";
		
		if(p.equals("P"))
		{
			m="H";
		}
		else
		{
			m="P";
		}
			if(y==0)
			{
				return;			
			}
			else
			{			
					if(arr[x][y-1].equals(".")||arr[x][y-1].equals(p))
					{
						return ;							
					}
					else
					{
						while(y-i>=0 && arr[x][y-i].equals(m))
						{
							arr[x][y-i]=p;
							i++;
						}
						
					}
			}	
	}
}
