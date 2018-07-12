public class MealsBuilderMain {

        public static void main(String[] args) {

            MealsBuild mealBuilder = new MealsBuild();

            MealsMenu meal = mealBuilder.mealprepare();
            System.out.println("Meals");
            meal.show();
            System.out.println("Total Cost: " + meal.cost());

        }
    }

