public class Usd extends Observer {

    public Usd(Subject s){
        this.s=s;
        this.s.attach(this);
    }
    @Override
    public void convert() {
        System.out.println("Rs. "+s.getRs()+" in USD is "+ s.getRs()*65 + ".");
    }
}
