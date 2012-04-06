package main;

//TODO Add data.txt file check/creation on first application run

// Referenced classes of package main:
//            Status

public class Start {
	public static void main(String args[]) throws Throwable {
		
            Host[] result = Status.check();
            Window.Show(result);
        
    }
}
