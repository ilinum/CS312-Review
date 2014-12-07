import java.util.ArrayList;

/**
 * An interface for generic pizza
 * Created by Svyatoslav Ilinskiy on 12/6/14.
 */
public interface Pizza {

    public int getSlicesLeft(); //return the number of slices left
    public boolean isVeggie(); //does this pizza contain meat?
    public void eat(int slices); //print word Yum slices times
    public PizzaSize size(); //return size of pizza (SMALL, MEDIUM or LARGE)
    public ArrayList<String> getIngredients(); //return all ingredients
    public String getPizzaName(); //get name of the pizza
    
}
