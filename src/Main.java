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
            NewYorkCoffeeShop c1 = new NewYorkCoffeeShop();
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
            MoscowCoffeeShop c1 = new MoscowCoffeeShop();
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
            MinskCoffeeShop c1 = new MinskCoffeeShop();
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

class NewYorkCoffeeShop {
    public void makeLatte(){
        System.out.println("Thanks for order in New York, take your Latte. Bye!");
    }
    public void makeCappuccino(){
        System.out.println("Thanks for order in New York, take your Cappuccino. Bye!");
    }
    public void makeRaf(){
        System.out.println("Thanks for order in New York, take your Raf. Bye!");
    }
    public void waitCoffee(){
        System.out.println("Please, wait a minute.");
    }
}

class MoscowCoffeeShop {
    public void makeLatte(){
        System.out.println("Thanks for order in Moscow, take your Latte. Bye!");
    }
    public void makeCappuccino(){
        System.out.println("Thanks for order in Moscow, take your Cappuccino. Bye!");
    }
    public void makeRaf(){
        System.out.println("Thanks for order in Moscow, take your Raf. Bye!");
    }
    public void waitCoffee(){
        System.out.println("Please, wait a minute.");
    }
}

class MinskCoffeeShop {
    public void makeLatte(){
        System.out.println("Thanks for order in Minsk, take your Latte. Bye!");
    }
    public void makeCappuccino(){
        System.out.println("Thanks for order in Minsk, take your Cappuccino. Bye!");
    }
    public void makeRaf(){
        System.out.println("Thanks for order in Minsk, take your Raf. Bye!");
    }
    public void waitCoffee(){
        System.out.println("Please, wait a minute.");
    }
}