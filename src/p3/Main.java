package p3; // получать инфо из консоли

import java.util.Scanner; // всегда необходима это строка при .in

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
System.out.printf("Input a number: ");
int num = scanner.nextInt();
System.out.printf("Your number: %d \n", num);
scanner.nextLine();
System.out.print("Input name: ");
String name = scanner.nextLine();
System.out.print("Input age: ");
int age = scanner.nextInt();
System.out.print("Input height: ");
float height = scanner.nextFloat();
        System.out.printf("Name: %s age: %d height: %.2f \n", name, age,height );

scanner.close(); // всегда закрывается


    }
}
