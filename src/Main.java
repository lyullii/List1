import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> sales = new ArrayList<>();

        while (true) {
            System.out.println("Выберите операцию: \n1. Добавить\n2. Показать\n3. Удалить");
            String operation = scanner.next();

            switch (operation) {
                case "1": {
                    System.out.println("Какую покупку хотите добавить?");
                    sales.add(scanner.next());
                    break;
                }
                case "2": {
                    showOrders(sales);
                    break;
                }
                case "3": {
                    showOrders(sales);
                    System.out.println("Какую хотите удалить? Введите номер или название");
                    String nameOrNumber = scanner.next();
                    try {
                        int index = Integer.parseInt(nameOrNumber) - 1;
                        sales.remove(index);
                    } catch (Exception e) {
                        sales.remove(nameOrNumber);
                    }
                }
           }
        }
    }
    private static void showOrders(List<String> sales) {
        System.out.println("Список покупок:");
        for (int i = 0; i < sales.size(); i++) {
        int count = i + 1;
        System.out.println(count + ". " + sales.get(i));

        }
    }
}