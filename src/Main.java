public class Main {
    public static void main(String[] args) {

        int balans = 1000;
        int replenishment = 1200;
        int bonus = replenishment / 100;

        int bonusBalans = balans + replenishment + bonus;

        if (replenishment > 1000) {
            System.out.println("Your balans: " + bonusBalans + " ₽");
            System.out.println("Your bonus: " + bonus + " ₽" + " !!!congratulations!!!");
        } else {
            System.out.println ("Your balans: " + (balans + replenishment) + " ₽");
            System.out.println("You don't get a bonus(((");
        }

    }
}
