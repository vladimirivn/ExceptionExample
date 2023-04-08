/**
 * Билет №6:
 * задача - Напишите пример перехвата и обработки исключения в блоке try-catch метода
 *
 * пример перехвата исключений ArithmeticException и ArrayIndexOutOfBoundsException
 */
public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 2, 0, 4};

        try {
            System.out.println("Начало работы");

 //           System.out.println((arr[1] / arr[2]));
            arr[5] = 8;
            for (int num : arr) {
                System.out.println(num);
            }

        } catch (ArithmeticException e) {
            System.err.println(e + " ----  Операция деления на ноль !");
        } catch (ArrayIndexOutOfBoundsException e1) {
            System.err.println(e1 + " ----  Выход за пределы длины массива !");
        }
        finally {
            System.out.println("завершение работы");
        }
    }
}

