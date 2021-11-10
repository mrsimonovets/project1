import java.util.Objects;
import java.util.Scanner;

public class MinskCoffeeShop implements CoffeeHouse, Biscuits{
    Scanner sc = new Scanner(System.in);

    public void sellBiscuits(){
        System.out.println("Do you want biscuits?");
        System.out.println("Yes / No");
        String answer = sc.nextLine();
        if (Objects.equals(answer, "Yes")) {
            System.out.println("Take your biscuits");
        }
    };
    public void makeLatte(){
        sellBiscuits();
        System.out.println("Thanks for order in Minsk, take your Latte. Bye!");
    }

    public void makeCappuccino(){
        sellBiscuits();
        System.out.println("Thanks for order in Minsk, take your Cappuccino. Bye!");
    }

    public void makeRaf(){
        sellBiscuits();
        System.out.println("Thanks for order in Minsk, take your Raf. Bye!");
    }

}