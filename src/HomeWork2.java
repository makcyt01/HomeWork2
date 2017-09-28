import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) throws IOException {
        //створюєм змінні
        String name;
        String city;
        int age;
        String hobby;

        //створюєм об'єкт BufferedReader для зчитування даних з консолі
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        //виводим в консоль запроси для юзера і ініціалізуємо змінні введеними даними
        System.out.print("Ваше ім'я: ");
        name = read.readLine();
        System.out.print("Місто проживання: ");
        city = read.readLine();
        System.out.print("Ваш вік: ");
        age = Integer.parseInt(read.readLine());
        System.out.print("Ваше хоббі: ");
        hobby = read.readLine();

        //виводим інформацію в консоль
        System.out.println("Ім'я: " + name + "\n" +
                            "Місто: " + city + "\n" +
                            "Вік: " + age + "\n" +
                            "Хоббі: " + hobby);
        System.out.println("-----------------------");
        System.out.println("Людина на ім'я " + name + " проживає в місті " + city + ".\n" +
                            "Цій людині " + age + " років і її хоббі " + hobby + ".");
        System.out.println("-----------------------");
        System.out.println(name + " - ім'я\n" +
                            city + " - місто\n" +
                            age + " - вік\n" +
                            hobby + " - хоббі");
    }
}
