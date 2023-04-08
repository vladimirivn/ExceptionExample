/**
 * Билет №6:
 * задача - Напишите пример перехвата и обработки исключения в блоке try-catch метода
 *
 * пример перехвата исключений ArithmeticException и ArrayIndexOutOfBoundsException
 */
public class Main {
    public static void main(String[] args) {

        int[] arr = {1,2,0,4};

        System.out.println("Начало работы");
        try {
       //     System.out.println(arr[5]);
            System.out.println(arr[1]/arr[2]);

        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println(e);
        }
        finally {
            System.out.println("завершение работы");
        }


    }
}

