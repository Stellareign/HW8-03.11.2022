public class Main {
    public static void main(String[] args) {

        System.out.println("Домашка 8, часть 1, задача 1, WHILE накопления с процентами:");
        int deposit = 15_000;
        double saving = 0;
        double percentMonth = 1.01;
        int i = 1;
        while (saving <= 2_459_000) {
            saving = deposit + saving*percentMonth;
            System.out.print("Месяц " + (i++) + " - сумма накоплений равна " + saving + ". ");
        }
    }
}