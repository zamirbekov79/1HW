import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String cityMainStreetAge;
        final int NUM = -7;
        String word = "round";// and desert you

        cityMainStreetAge = NUM + word;

        System.out.println(cityMainStreetAge);
        System.out.println(NUM);
        System.out.println(word);


        if (NUM < 0){
            System.out.println("Вы сохранили отрицательное число");
        }
        else if (NUM > 0){
            System.out.println("Вы сохранили положительное число");
        }
        else {
            System.out.println("Вы сохранили ноль");
        }

        System.out.print("Введите ваше имя: ");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("Привет " + input);


        System.out.println("hi");
    }
}