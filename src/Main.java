public class Main {
    public static void main(String[] args) {

        System.out.println("Домашка 8, часть 2, задача 1, WHILE накопления с процентами, без капитализации:");
        int deposit = 15000;
        double saving = 0;
        double percentMonth = 1.07;
        int i = 1;
        saving = deposit + deposit * percentMonth;
        while (saving <= 12000_000) {
            saving = saving + deposit * percentMonth;
            if (saving < 1000_000) {
                System.out.print("Месяц " + (i++) + " - сумма накоплений равна " + saving + " руб. ");
            }
            if (saving > 1000_000) {
                System.out.print("Месяц " + (i++) + " - сумма накоплений равна " + saving / 1000_000 + " млн. руб. ");
            }
        }

    }
}