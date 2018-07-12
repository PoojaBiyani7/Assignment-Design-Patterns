import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> obsv=new ArrayList<Observer>();
    private Integer rs;

    public Integer getRs() {
        return rs;
    }

    public void setRs(Integer rs) {
        this.rs = rs;
        notifyAllObsv();
    }

    public void attach(Observer ob)
    {
        obsv.add(ob);
    }

    public void notifyAllObsv()
    {
        for(Observer ob:obsv)
            ob.convert();
    }
}
