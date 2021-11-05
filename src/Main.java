import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Where are you from?");
        System.out.println("1. New York, 2. Moscow, 3. Minsk");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number == 1){
            NewYorkCoffeeShop c1 = new NewYorkCoffeeShop();
            c1.makeCoffee();
        } else if (number == 2){
            MoscowCoffeeShop c1 = new MoscowCoffeeShop();
            c1.makeCoffee();
        } else if (number == 3){
            MinskCoffeeShop c1 = new MinskCoffeeShop();
            c1.makeCoffee();
        } else{
            System.out.println("Check your number, please.");
        }
    }
}

class NewYorkCoffeeShop {
    public void makeCoffee(){
        System.out.println("Thanks for order, take your coffee. Bye!");
    }
}

class MoscowCoffeeShop {
    public void makeCoffee(){
        System.out.println("Thanks for order, take your coffee. Bye!");
    }
}

class MinskCoffeeShop {
    public void makeCoffee(){
        System.out.println("Thanks for order, take your coffee. Bye!");
    }
}