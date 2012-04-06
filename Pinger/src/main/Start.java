package main;

//TODO Add data.txt file check/creation on first application run
//TODO Add graphic component for view offline hosts

// Referenced classes of package main:
//            Status

public class Start
{

    public Start()
    {
    }

    public static void main(String args[]) throws Throwable {
        do
            Status.check();
        while(true);
    }
}
