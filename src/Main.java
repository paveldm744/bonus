public class Main {
    public static void main(String[] args) {
        int balans = 100;
        int dep =1100;
        int bonusrub = dep / 100;
        int sbonusom = dep / 100 + dep;
        boolean bonus = dep >= 1000;
        int itog = bonus ? sbonusom : dep;
        int itogbonus = bonus ? bonusrub : 0;
        System.out.println(itog + balans + " Итоговый счет");
        System.out.println(itogbonus + " Бонусные рубли");






    }
}
