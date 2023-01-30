public class Main {
    public static void main(String[] args) {
        int start = 300;
        int payment = 1400;

        int bonus;

        if (payment > 1000) {
            bonus = payment / 100;
        } else {
            bonus = 0;
        }

        int allmoney = start + payment + bonus;

            System.out.println("Итоговая сумма на вашем счете счете: " + allmoney + " рублей, в том числе бонусных: " + bonus + " рублей");
        }
    }