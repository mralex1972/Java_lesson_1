
/**  Реализовать функцию возведения числа а в степень b. a, b ∈ Z. 
* Сводя количество выполняемых действий к минимуму. 
*/
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class task1FromKamyanetskysList {
    static int read(String str) {
        StringBuilder x = new StringBuilder();
        if (str.contains("-")) {
            x.append("-");
        }
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                x.append(str.charAt(i));
            }
        }
        return Integer.parseInt(x.toString());
    }

    static boolean isNotInt(String str) {
        try {
            Integer.parseInt(str);
            return false;
        } catch (NumberFormatException e) {
            return true;
        }
    }

    public static void main(String[] args) {
        System.out.println("Возведение a в степень b");
        int a = 0, b = 0;
        Scanner num = new Scanner(System.in);
        String key = null;
        do {
            System.out.println("Нажмите k, если желаете ввести a и b с клавиатуры.");
            System.out.println("Нажмите f, если желаете получить данные из файла input.txt.");
            key = num.nextLine();
        } while (!key.equals("k") & !key.equals("f"));
        if (key.equals("k")) {
            String linA = "";
            do {
                System.out.println("Введите основание степени");
                linA = num.nextLine();
            } while (isNotInt(linA));
            a = Integer.parseInt(linA);
            String linB = "";
            do {
                System.out.println("Введите показатель степени");
                linB = num.nextLine();
            } while (isNotInt(linB));
            b = Integer.parseInt(linB);
            System.out.printf("%d ^ %d = %.3f\n", a, b, Math.pow(a, b));
        }
        if (key.equals("f")) {
            try {
                File f = new File("input.txt");
                Scanner data = new Scanner(f);
                String exp = data.nextLine();
                b = read(exp);
                // System.out.println(b);
                String base = data.nextLine();
                a = read(base);
                // System.out.println(a);
                File file = new File("output.txt");
                PrintWriter pw = new PrintWriter(file);
                pw.println(Math.pow(a, b));
                System.out.println("Результат записан в файл output.txt.");
                pw.close();
                data.close();
            } catch (FileNotFoundException e) {
                System.out.println("Файл не найден");
                // break;
            }
        }
        num.close();
    }
}
