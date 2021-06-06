import java.io.IOException;

public class cls {

	public static void Cls()
	  {
	     try
	     {
	        new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
	     }



	    catch(Exception E)
	    {
	       System.out.println(E);
	    }
	  }
}