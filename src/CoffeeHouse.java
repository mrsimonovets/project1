public abstract class CoffeeHouse {
    int latteCounter;
    int cappuccinoCounter;
    int rafCounter;
    double proceeds;

    double lattePrice = 3.5;
    double cappuccinoPrice = 4.5;
    double rafPrice = 5.5;


    public void Statistics(){}

    public void makeLatte() {}

    public void makeCappuccino() {}

    public void makeRaf() {}

    public void waitCoffee(){
            System.out.println("Wait a minute, please.");
        }
}