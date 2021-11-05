import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Where are you from?");
        System.out.println("1. New York, 2. Moscow, 3. Minsk");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        System.out.println("What coffee do you want?");
        System.out.println("1. Latte, 2. Cappuccino, 3. Flat White");
        int number2 = sc.nextInt();

        if (number == 1){
            NewYorkCoffeeShop c1 = new NewYorkCoffeeShop("New York",  number2);
            c1.waitCoffee();
            c1.makeCoffee();
        } else if (number == 2){
            MoscowCoffeeShop c1 = new MoscowCoffeeShop("Moscow",  number2);
            c1.waitCoffee();
            c1.makeCoffee();
        } else if (number == 3){
            MinskCoffeeShop c1 = new MinskCoffeeShop("Minsk",  number2);
            c1.waitCoffee();
            c1.makeCoffee();
        } else{
            System.out.println("Check your number, please.");
        }
    }
}

class CoffeeHouse {
    String city;
    int typeOfCoffee;

    public CoffeeHouse(String city, int typeOfCoffee){
        this.city = city;
        this.typeOfCoffee = typeOfCoffee;
    }

    public void makeCoffee(){
        if (typeOfCoffee == 1){
            System.out.printf("Thanks for order in %s, take your Latte. Bye!", city);
        } else if (typeOfCoffee == 2){
            System.out.printf("Thanks for order in %s, take your Cappuccino. Bye!", city);
        } else if (typeOfCoffee == 3) {
            System.out.printf("Thanks for order in %s, take your Flat White. Bye!", city);
        } else {
            System.out.println("Check your number, please.");
        }
    }

    public void waitCoffee(){
        System.out.println("Please, wait a minute.");
        try
        {
            Thread.sleep(3000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }

}

class NewYorkCoffeeShop extends CoffeeHouse{
    public NewYorkCoffeeShop(String city, int typeOfCoffee){
        super(city, typeOfCoffee);
    }
}

class MoscowCoffeeShop extends CoffeeHouse{
    public MoscowCoffeeShop(String city, int typeOfCoffee){
        super(city, typeOfCoffee);
    }
}

class MinskCoffeeShop extends CoffeeHouse{
    public MinskCoffeeShop(String city, int typeOfCoffee){
        super(city, typeOfCoffee);
    }
}