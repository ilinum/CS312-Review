import java.util.ArrayList;

/**
 * Created by Svyatoslav Ilinskiy on 12/6/14.
 */
public class PepperoniPizza extends CheesePizza {
    private int slicesLeft;
    private PizzaSize size;

    public PepperoniPizza() {
        this(6, PizzaSize.MEDIUM);
    }

    public PepperoniPizza(int numSlices, PizzaSize size) {
        slicesLeft = numSlices;
        this.size = size;
    }

    //return the ingredients in the pizza
    public ArrayList<String> getIngredients() {
        ArrayList<String> ingredients = super.getIngredients();
        ingredients.add("pepperoni");
        return ingredients;
    }

    public String getPizzaName() {
        return "Pepperoni";
    }
}
