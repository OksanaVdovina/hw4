public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.print("\n");
        for (int r = 10; r >= 0; r = r - 1) {
            System.out.print(r + " ");
        }
    }

    public static void task2() {
        System.out.print("\n");
        for (int firstFriday = 6; firstFriday <= 31; firstFriday++) {
            if ((firstFriday - 6) % 7 == 0) {
                System.out.println("Сегодня пятница, " + firstFriday + "-е число. Необходимо подготовить отчет.");
                continue;
            }
        }
    }

    public static void task3() {
        int year = 1;
        int yearMinus200 = 1821;
        int yearPlus100 = 2121;
        for (; year <= 2150; year++) {
            if (year % 79 == 0 && year > yearMinus200 && year < yearPlus100) {
                System.out.println("Комета будет рядом с Землей в " + year + " году");
            }
        }
    }
}