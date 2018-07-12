public class Euro extends Observer {
    public Euro(Subject s) {
        this.s=s;
        this.s.attach(this);
    }

    @Override
    public void convert() {
        System.out.println("Rs. "+ s.getRs()+" in Euro is "+ s.getRs()*69 + ".");
    }
}
