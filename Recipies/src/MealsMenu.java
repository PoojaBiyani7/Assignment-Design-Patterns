import java.util.ArrayList;
import java.util.List;

public class MealsMenu {

    private List<MenuItems> i=new ArrayList<>();

   public void add(MenuItems i1)
    {
        i.add(i1);
    }

    public float cost()
    {
        float c=0.0f;
        for(MenuItems m1:i)
            c+=m1.price();
        return c;
    }

    void show()
    {
        for(MenuItems m1:i)
            System.out.println("Item : "+m1.name()+" \n"+"Cost : "+m1.price());
    }



}