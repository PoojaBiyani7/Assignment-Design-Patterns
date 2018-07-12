public class ObsMain {
    public static void main(String[] args)
    {
        Subject s=new Subject();
        new Usd(s);
        new Gbp(s);
        new Euro(s);
        s.setRs(20);
    }
}
