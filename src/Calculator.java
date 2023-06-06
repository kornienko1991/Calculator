import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input");
        String input = scanner.nextLine(); // Чтение строки из консоли
        System.out.println("Output:\n" + Main.calc(input)); // Вывод результата выполения операции
    }
}
class Main {
    public static String calc(String input){
        String exception = "trows Exception"; // Исключение
        String[] elements = input.split(" "); // Разбиение строки на отдельные элементы
        int num1 = Integer.parseInt(elements[0]); // Парсинг первого числа
        int num2 = Integer.parseInt(elements[2]); // Парсинг второго числа
        int result;
        if (elements.length != 3) {
            return exception; // Ловим, если не 3 элемента
        }
        if ((num1 < 1) || (num1 > 10) || (num2 < 1) || (num2 > 10)) {
            return exception; // Указаваем диапазон значений
        }
        String sign = elements[1]; // sign (это знак)
        switch (sign) {
            case "+" -> result = num1 + num2;
            case "-" -> result = num1 - num2;
            case "*" -> result = num1 * num2;
            case "/" -> result = num1 / num2;
            default -> {
                return "Invalid operator"; // Если символ операции не соответствует ни одной из 4х операций, возвращаем сообщения об ошибке
            }
        }
        return String.valueOf(result); // Преобразуем результат в строку и возвращаем
    }
}

