class Computer {
    String IPAddress;
    float Value;
    public Computer(String ip,float value )
    {
        this.IPAddress=ip;
        this.Value=value;
    }
    public String toString()
    {
        String s= this.IPAddress+" $"+this.Value+"\n";
        return s;
    }

}