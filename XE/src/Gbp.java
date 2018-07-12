public class Gbp extends Observer {
    public Gbp(Subject s) {
        this.s=s;
        this.s.attach(this);
    }

    @Override
    public void convert() {
        System.out.println("Rs. "+ s.getRs()+" in GBP is "+ s.getRs()*80 + ".");
    }
}
