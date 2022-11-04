public class Main {
    public static void main(String[] args) {

        System.out.println("Домашка 8, часть 2, задача 2, циклы, накопления каждые полгода:");
        int deposit = 15000;
        double saving = 0;
        double percentMonth = 1.07;
        saving = deposit + deposit * percentMonth;
        int i = 0;
        for (; saving <= 12000_000; i++) {
            saving = saving + deposit * percentMonth;
            if (i % 6 == 0) {

                if (saving < 1000_000) {
                    System.out.print("Месяц " + i + " - сумма накоплений равна " + saving + " руб. ");
                } else if (saving > 1000_000) {
                    System.out.print("Месяц " + i + " - сумма накоплений равна " + saving / 1000_000 + " млн. руб. ");
                }
            }
        }
    }
}
