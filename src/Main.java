public class Main {
    public static void main(String[] args) {
        int initialAmount = 500;
        int payment = 1200;

        int bonus;
        if (payment < 1000) {
            bonus = 0;
        } else {
            bonus = payment / 100;
        }

        int finalAmount;
        if (payment > 1000) {
            finalAmount = bonus + payment + initialAmount;
        } else {
            finalAmount = payment + initialAmount;
        }
        System.out.println(finalAmount);
        System.out.println(bonus);
    }
}