public interface CoffeeHouse {

        void makeLatte();

        void makeCappuccino();

        void makeRaf();

        default void waitCoffee(){
            System.out.println("Wait a minute, please.");
        };
    }
