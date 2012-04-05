package main;


public class Host
{

    public Host()
    {
    }

    public Host(String i, String d, String l)
    {
        ipaddress = i;
        description = d;
    }

    public String getIpaddress()
    {
        return ipaddress;
    }

    public void setIpaddress(String ipaddress)
    {
        this.ipaddress = ipaddress;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    private String ipaddress;
    private String description;
    private String status;
}
