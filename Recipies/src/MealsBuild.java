public class MealsBuild {
    public MealsMenu mealprepare() {
        MealsMenu m = new MealsMenu();
        m.add(new AddOns());
        m.add(new Sauce());
        m.add(new Salad());
        m.add(new Bread());
    return m;
    }}
