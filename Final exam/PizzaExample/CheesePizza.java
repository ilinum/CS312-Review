import java.util.ArrayList;

/**
 * Created by Svyatoslav Ilinskiy on 12/6/14.
 */
public class CheesePizza implements Pizza {
    private int slicesLeft;
    private PizzaSize size;

    public CheesePizza(int numSlices, PizzaSize size) {
        slicesLeft = numSlices;
        this.size = size;
    }

    public CheesePizza() {
        //default values for CheesePizza
        this(6, PizzaSize.MEDIUM);
    }

    //return the ingredients in the pizza
    public ArrayList<String> getIngredients() {
        ArrayList<String> ingredients = new ArrayList<String>();
        ingredients.add("bread");
        ingredients.add("cheese");
        ingredients.add("sauce");
        return ingredients;
    }

    //return number of slices that is left
    public int getSlicesLeft() {
        return slicesLeft;
    }

    //does this pizza contain meat?
    public boolean isVeggie() {
        ArrayList<String> ingredients = getIngredients();
        return !(ingredients.contains("meat") || ingredients.contains("pepperoni") || ingredients.contains("ham"));
    }

    //print word "yum" slices times
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

    //what is the size of this pizza?
    public PizzaSize size() {
        return size;
    }

    //what's the name of this pizza?
    public String getPizzaName() {
        return "Cheese";
    }


    //basic toString() method.
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

    //method that exists only in CheesePizza
    public void howCheesyIsThisPizza() {
        System.out.println("VERY");
    }
}
