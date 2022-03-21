public class Main {

    public static void main(String[] args) {
// вводные данные
        int customerAccount = 100_000;
        int bonus = 100;
        int refillCheck = 10_100;

// логика
        int bonusRefill = (refillCheck >= bonus) ? 1 : 0;
        int sumBonus = refillCheck / bonus;
        int grandTotal = customerAccount + refillCheck + sumBonus;
        System.out.println("Сумма на Вашем счете: " + grandTotal);
        System.out.println("Сумма бонуса: " + sumBonus);
    }
}