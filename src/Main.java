public class Main {
    public static void main(String[] args) {

        short balans = 1000;
        short replenishment = 1200;
        short bonus = (short) (replenishment / 100);

        short bonusBalans = (short) (balans + replenishment + bonus);

        if (replenishment > 1000) {
            System.out.println("Your balans: " + bonusBalans + " ₽");
            System.out.println("Your bonus: " + bonus + " ₽" + " !!!congratulations!!!");
        } else {
            System.out.println ("Your balans: " + (balans + replenishment) + " ₽");
            System.out.println("You don't get a bonus(((");
        }

    }
}
