public class Main {
    public static void main(String[] args) {

        int initialBalance = 100;
        int deposit = 2200;
        int minDeposit = 1000;
        int bonusPer100Rubles = 1;
        int totalBalance = initialBalance;
        int bonus = 0;
        if (deposit > minDeposit) {
            bonus = (deposit / 100) * bonusPer100Rubles;
        }
        totalBalance += deposit + bonus; // итоговая сумма на счету клиента
        System.out.println("Бонусные рубли: " + bonus + " рублей");
        System.out.println("Итоговый счет: " + totalBalance + " рублей");
    }

}