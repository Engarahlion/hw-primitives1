public class Main {
    public static void main(String[] args) {

        int balance = 800;
        int refill = 1050;
        int bonus = refill / 100;

        int sum = refill >= 1000 ? (balance + refill) + bonus : balance + refill;

        if (refill >= 1000) {
            System.out.println("Бонусов начислено " + bonus);
        }
        System.out.println("Текущий баланс " + sum);
    }
}