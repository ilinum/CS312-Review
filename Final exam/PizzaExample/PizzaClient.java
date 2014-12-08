/**
 * Created by Svyatoslav Ilinskiy on 12/7/14.
 */
public class PizzaClient {
    public static void main(String[] args) {
        PepperoniPizza pp = new PepperoniPizza();


        //Which of the following will compile?
        PepperoniPizza a = new PepperoniPizza(10, PizzaSize.LARGE);
        HawaiianPizza b = new HawaiianPizza(3, PizzaSize.MEDIUM);
        CheesePizza c = new CheesePizza(7, PizzaSize.SMALL);
        CheesePizza d = new CheesePizza();
//        PepperoniPizza e = new HawaiianPizza();
//        HawaiianPizza f = new PepperoniPizza();
        CheesePizza g = new PepperoniPizza();
        //Pizza h = new CheesePizza();
//        CheesePizza h = new Pizza();
        Pizza i = new HawaiianPizza();
//        Object j = new CheesePizza();
//        CheesePizza k = new Object();

        PepperoniPizza p = new PepperoniPizza();
        System.out.println(p.toString());
        p.eat(2);
        System.out.println(p.toString());
        System.out.println("isVeggie? " + p.isVeggie());
        // p = new PepperoniPizza();
        // System.out.println(p.toString());
//        finishThePizza(p);
        howCheesyIsPizza(p);
        Pizza[] pizzas = new Pizza[3];
        pizzas[0] = new HawaiianPizza();
        pizzas[1] = new PepperoniPizza();
        pizzas[2] = new CheesePizza();
        ((CheesePizza) pizzas[2]).howCheesyIsThisPizza();
        //pizzas[1].eat(1);
        //howCheesyIsPizza(pizzas[2]);
        //printAllPizzas(pizzas);
        CheesePizza p2 = new PepperoniPizza();
        finishThePizza(p2);
    }

    public static void printAllPizzas(Pizza[] pizzas) {
        for (Pizza p : pizzas) {
            System.out.println(p.toString());
        }
    }

    public static void finishThePizza(Pizza p) {
        System.out.println(p.toString());
        int slicesLeft = p.getSlicesLeft();
        p.eat(slicesLeft);
        System.out.println(p.toString());
    }

    public static void howCheesyIsPizza(PepperoniPizza cp) {
        System.out.print("How cheesy is this pizza? ");
        cp.howCheesyIsThisPizza();
    }
}
