package main;

import java.io.*;
import java.net.*;
import javax.swing.JOptionPane;

// Referenced classes of package main:
//            Host

public class Status
{

    public Status()
    {
    }

    public static Host[] check()
        throws UnknownHostException, IOException
    {
        int arraySize = 50;
        File file = new File("C:\\ps\\data.txt");
        FileReader freader = new FileReader(file);
        BufferedReader breader = new BufferedReader(freader);
        Host hostArr[] = new Host[arraySize];
        for(int i = 0; i < arraySize; i++)
            hostArr[i] = new Host();

        String str;
        for(int loop = 0; (str = breader.readLine()) != null; loop++)
        {
            hostArr[loop].setIpaddress(str.substring(0, str.indexOf("\t")));
            hostArr[loop].setDescription(str.substring(str.indexOf("\t") + 1));
            InetAddress i = Inet4Address.getByName(hostArr[loop].getIpaddress());
            if(i.isReachable(2000))
            {
                hostArr[loop].setStatus("Online");
            } else
            {
                hostArr[loop].setStatus("Offline!");
                JOptionPane.showMessageDialog(null, (new StringBuilder("\u041E\u0442\u0441\u0443\u0442\u0441\u0442\u0432\u0443\u0435\u0442 \u0441\u0432\u044F\u0437\u044C \u0441 \u0445\u043E\u0441\u0442\u043E\u043C\n ")).append(hostArr[loop].getIpaddress()).append(" - ").append(hostArr[loop].getDescription()).toString(), "\u041E\u0448\u0438\u0431\u043A\u0430 \u0441\u0432\u044F\u0437\u0438", 0);
            }
        }

        return hostArr;
    }
}
