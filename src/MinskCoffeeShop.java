public class MinskCoffeeShop extends CoffeeHouse implements Biscuits{
    private static int latteCounter;
    private static int cappuccinoCounter;
    private static int rafCounter;

    private static double proceeds;

    @Override
    public void makeLatte(){
        waitCoffee();
        System.out.println("Thanks for order in Minsk, take your Latte. Bye!");
        latteCounter++;
        proceeds = proceeds + lattePrice;
    }

    @Override
    public void makeCappuccino(){
        waitCoffee();
        System.out.println("Thanks for order in Minsk, take your Cappuccino. Bye!");
        cappuccinoCounter++;
        proceeds = proceeds + cappuccinoPrice;
    }

    @Override
    public void makeRaf(){
        waitCoffee();
        System.out.println("Thanks for order in Minsk, take your Raf. Bye!");
        rafCounter++;
        proceeds = proceeds + rafPrice;
    }

    public void sellBiscuits(){
        System.out.println("Take your biscuits");
    }

    @Override
    public void Statistics() {
        System.out.println("Latte sold: " + latteCounter);
        System.out.println("Cappuccino sold: " + cappuccinoCounter);
        System.out.println("Raf sold: " + rafCounter);
        System.out.println("Proceeds: " + proceeds);
    }
}