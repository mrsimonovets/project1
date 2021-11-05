import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Where are you from?");
        System.out.println("1. New York, 2. Moscow, 3. Minsk");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        System.out.println("What coffee do you want?");
        System.out.println("1. Latte, 2. Cappuccino, 3. Raf");
        int number2 = sc.nextInt();

        if (number == 1){
            NewYorkCoffeeShop c1 = new NewYorkCoffeeShop("New York");
            if (number2 == 1){
                c1.waitCoffee();
                c1.makeLatte();
            } else if (number2 == 2){
                c1.waitCoffee();
                c1.makeCappuccino();
            } else if (number2 == 3){
                c1.waitCoffee();
                c1.makeRaf();
            } else {
                System.out.println("Check your number, please.");
            }
        } else if (number == 2){
            MoscowCoffeeShop c1 = new MoscowCoffeeShop("Moscow");
            if (number2 == 1){
                c1.waitCoffee();
                c1.makeLatte();
            } else if (number2 == 2){
                c1.waitCoffee();
                c1.makeCappuccino();
            } else if (number2 == 3){
                c1.waitCoffee();
                c1.makeRaf();
            } else {
                System.out.println("Check your number, please.");
            }
        } else if (number == 3){
            MinskCoffeeShop c1 = new MinskCoffeeShop("Minsk");
            if (number2 == 1){
                c1.waitCoffee();
                c1.makeLatte();
            } else if (number2 == 2){
                c1.waitCoffee();
                c1.makeCappuccino();
            } else if (number2 == 3){
                c1.waitCoffee();
                c1.makeRaf();
            } else {
                System.out.println("Check your number, please.");
            }
        } else{
            System.out.println("Check your number, please.");
        }
    }
}

class CoffeeHouse {
    String city;

    public CoffeeHouse(String city){
        this.city = city;
    }

    public void makeLatte(){
        System.out.printf("Thanks for order in %s, take your Latte. Bye!", city);
    }

    public void makeCappuccino(){
        System.out.printf("Thanks for order in %s, take your Cappuccino. Bye!", city);
    }

    public void makeRaf(){
        System.out.printf("Thanks for order in %s, take your Raf. Bye!", city);
    }
    public void waitCoffee(){
        System.out.println("Please, wait a minute.");
    }

}

class NewYorkCoffeeShop extends CoffeeHouse{
    public NewYorkCoffeeShop(String city){
        super(city);
    }
}

class MoscowCoffeeShop extends CoffeeHouse{
    public MoscowCoffeeShop(String city){
        super(city);
    }
}

class MinskCoffeeShop extends CoffeeHouse{
    public MinskCoffeeShop(String city){
        super(city);
    }
}