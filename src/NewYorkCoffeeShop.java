import java.util.Objects;
import java.util.Scanner;

public class NewYorkCoffeeShop implements CoffeeHouse, Biscuits{
    Scanner sc2 = new Scanner(System.in);

    public void sellBiscuits(){
        System.out.println("Do you want biscuits?");
        System.out.println("Yes / No");
        String answer = sc2.nextLine();
        if (Objects.equals(answer, "Yes")) {
            System.out.println("Take your biscuits.");
        }
    }
    public void makeLatte(){
        sellBiscuits();
        System.out.println("Thanks for order in New York, take your Latte. Bye!");
    }

    public void makeCappuccino(){
        sellBiscuits();
        System.out.println("Thanks for order in New York, take your Cappuccino. Bye!");
    }

    public void makeRaf(){
        sellBiscuits();
        System.out.println("Thanks for order in New York, take your Raf. Bye!");
    }

}

