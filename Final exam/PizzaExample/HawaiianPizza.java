import java.util.ArrayList;

/**
 * Created by Svyatoslav Ilinskiy on 12/6/14.
 */
public class HawaiianPizza implements Pizza {
    private int slicesLeft;
    private PizzaSize size;

    public HawaiianPizza() {
        this(6, PizzaSize.MEDIUM);
    }

    public HawaiianPizza(int numSlices, PizzaSize size) {
        slicesLeft = numSlices;
        this.size = size;
    }

    public ArrayList<String> getIngredients() {
        ArrayList<String> ingredients = new ArrayList<String>();
        ingredients.add("bread");
        ingredients.add("cheese");
        ingredients.add("sauce");
        ingredients.add("ham");
        ingredients.add("pineapple");
        return ingredients;
    }


    public int getSlicesLeft() {
        return slicesLeft;
    }


    public boolean isVeggie() {
        //Hawaiian pizza always has ham in it. So it'll never be veggie.
        return false;
    }


    public void eat(int slices) {
        if (slices > slicesLeft) 
            throw new IllegalStateException("There's not enough slices :(");

        slicesLeft -= slices;
        while (slices > 0) {
            System.out.print("yum ");
            slices--;
        }
        System.out.println();
    }

    public PizzaSize size() {
        return size;
    }

    public String getPizzaName() {
        return "Hawaiian";
    }

    public String toString() {
        String result = "";
        result += "Tasty " + getPizzaName() + " pizza.\nIngredients: \n";
        for (String ingredient: getIngredients()) {
            result += ingredient + "\n";
        }
        result += "\nSlices left: " + slicesLeft;
        result += "\nSize: " + size + "\n";
        return result;
    }

    //method that exists only in HawaiianPizza class. 
    public void eatTwoSlices() {
        if (slicesLeft < 2)
            throw new IllegalStateException("There's less than two slices");

        slicesLeft -= 2;
        System.out.println("I just ate two slices tasty Hawaiian pizza!");
    }

}
