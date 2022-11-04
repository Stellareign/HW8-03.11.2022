public class Main {
    public static void main(String[] args) {

        System.out.println("Домашка 8, часть2, задача 1, WHILE накопления с процентами, без капитализации:");
        int deposit = 15_000;
        double saving = 0;
        double percentMonth = 1.07;
        int i = 1;
        saving = deposit + deposit * percentMonth;
        while (saving <= 12_000_000) {
            saving = saving + deposit * percentMonth;
            System.out.print("Месяц " + (i++) + " - сумма накоплений равна " + saving + ". ");
        }


    }
}