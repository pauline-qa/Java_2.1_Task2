public class Main {
    public static void main(String[] args) {
        int initial_amount = 500;
        int payment = 1200;

        int bonus;
        if (payment < 1000) {
            bonus = 0;
        }
        else {
            bonus = payment / 100;
        }

        int final_amount;
        if (payment > 1000) {
        final_amount = bonus + payment + initial_amount;
        }
        else {
            final_amount = payment + initial_amount;
        }
        System.out.println(final_amount);
        System.out.println(bonus);}
    }