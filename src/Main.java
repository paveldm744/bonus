public class Main {
    public static void main(String[] args) {
        int balans = 100;
        int deposit = 1100;
        int bonusRub = deposit / 100;
        int withBonus = deposit / 100 + deposit;
        boolean bonus = deposit >= 1000;
        int totalMoney = bonus ? withBonus : deposit;
        int totalBonus = bonus ? bonusRub : 0;
        System.out.println(totalMoney + balans + " Итоговый счет");
        System.out.println(totalBonus + " Бонусные рубли");
    }
}
