import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        //створюєм змінні
        String name;
        String city;
        int age;
        String hobby;

        //створюєм об'єкт Scanner
        Scanner scan = new Scanner(System.in);

        //виводим в консоль запроси для юзера і ініціалізуємо змінні введеними даними
        System.out.print("Ваше ім'я: ");
        name = scan.nextLine();
        System.out.print("Місто проживання: ");
        city = scan.nextLine();
        System.out.print("Ваш вік: ");
        age = scan.nextInt();
        System.out.print("Ваше хоббі: ");
        hobby = scan.nextLine();

        
    }
}
