package helpers;

public class Helpers {
	
	public void helps(int tiempo) {
		tiempo*=1000;
		try {
			Thread.sleep(tiempo);			
		}
		catch (InterruptedException e )
		{
			e.printStackTrace();
			}
		}
	 
	}


