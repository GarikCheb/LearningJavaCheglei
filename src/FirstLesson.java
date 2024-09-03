public class FirstLesson {
    public static void main(String[] args) {

        int a = 123;
        int b = 456;
        int c = 789;

        int sum = a + b;
        int dif = b - c;
        int multi = a * c;
        int div = c / b;
        int rem = a % b;

        long l = 1255778899;
        double d = 45.89654;
        char ch = 'M';
        String st = "Привет, Михаил!";

        boolean first = a > b;
        boolean second = b < c;
        boolean third = c != a;

        System.out.printf(
                """
                        “
                        Привет, мир!
                        
                        Сегодня я начал изучать язык программирования Java.
                        
                        Сумма чисел A&B = %d
                        Разность чисел B&C = %d
                        Произведение чисел A&C = %d
                        Частное  C/B = %d
                        Остаток от деления A&B = %d
                        
                        Число int: %d
                        
                        Число long: %d
                        
                        Число double: %f
                        
                        Символ char: %c
                        
                        Строка String: %s
                        
                        A > B = %b
                        B < C = %b
                        C ≠ A = %b
                        ”""",
                sum, dif, multi, div, rem, a, l, d, ch, st, first, second, third
        );


    }
}
