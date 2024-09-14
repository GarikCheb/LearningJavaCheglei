import java.util.Scanner;

public class SecondLesson {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int res = 0;

            if (!scanner.hasNextInt()) {
                System.out.println("Вы ввели не число!");
                break;
            }

            int first = scanner.nextInt();

            if (scanner.hasNext()) {
                String sign = scanner.next();

                if (!scanner.hasNextInt()) {
                    System.out.println("Вы ввели не число!");
                    break;
                }

                int second = scanner.nextInt();

                switch (sign) {
                    case "+":
                        res = first + second;
                        break;
                    case "-":
                        res = first - second;
                        break;
                    case "*":
                        res = first * second;
                        break;
                    case "/":
                        res = first / second;
                        break;
                    default:
                        System.out.println("Не знаю такой математической операции");
                        break;
                }
                System.out.println(res);
            }
        }
    }
}
