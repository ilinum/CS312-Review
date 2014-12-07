/**
 * Created by Svyatoslav Ilinskiy on 12/7/14.
 */
public class PizzaClient {
    public static void main(String[] args) {
        CheesePizza p = new PepperoniPizza();
        // System.out.println(p.toString());
        // p.eat(2);
        // System.out.println(p.toString());
        // System.out.println("isVeggie? " + p.isVeggie());
        // p = new PepperoniPizza();
        // System.out.println(p.toString());
        finishThePizza(p);
        howCheesyIsPizza(p);
        //TODO(Stas): add more client code
    }

    public static void finishThePizza(Pizza p) {
        System.out.println(p.toString());
        int slicesLeft = p.getSlicesLeft();
        p.eat(slicesLeft);
        System.out.println(p.toString());
    }

    public static void howCheesyIsPizza(CheesePizza cp) {
        cp.howCheesyIsThisPizza();
    }
}
