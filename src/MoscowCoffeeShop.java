public class MoscowCoffeeShop extends CoffeeHouse{
    private static int latteCounter;
    private static int cappuccinoCounter;
    private static int rafCounter;

    private static double proceeds;
    @Override
    public void makeLatte(){
        waitCoffee();
        System.out.println("Thanks for order in Moscow, take your Latte. Bye!");
        latteCounter++;
        proceeds = proceeds + lattePrice;
    }

    @Override
    public void makeCappuccino(){
        waitCoffee();
        System.out.println("Thanks for order in Moscow, take your Cappuccino. Bye!");
        cappuccinoCounter++;
        proceeds = proceeds + cappuccinoPrice;
    }

    @Override
    public void makeRaf(){
        waitCoffee();
        System.out.println("Thanks for order in Moscow, take your Raf. Bye!");
        rafCounter++;
        proceeds = proceeds + rafPrice;
    }

    @Override
    public void Statistics(){
        System.out.println("Latte sold: " + latteCounter);
        System.out.println("Cappuccino sold: " + cappuccinoCounter);
        System.out.println("Raf sold: " + rafCounter);
        System.out.println("Proceeds: " + proceeds);
    }
}