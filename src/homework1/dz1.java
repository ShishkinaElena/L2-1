package homework1;

import java.util.Scanner;

public class dz1 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in); //Д/з: создать приложение запрашивающее у пользователя//
        System.out.print("Input product name: ");  //наименование товара
        String  productName = scanner.nextLine();
        System.out.print("Input amount of product: "); //количество
        int num = scanner.nextInt();
        System.out.print("Input phone contact: "); // телефон пользователя
        String phone = scanner.nextLine(); // или нижняя строчка
        // long l1=scanner.nextLong() ;
        scanner.nextLine();
        System.out.print("Input address: "); //адрес
        String address = scanner.nextLine();
        System.out.printf("Ваш заказ принят.Товар %s в количестве %d прибудет к вам в ближайшее время.\n" +
                "Товар доставим по адресу: %s. Ваш контактный номер: %s.", productName, num, address, phone); // это заменяет все ниже написанные строчки
        //System.out.println("Ваш заказ принят");  // Ваш заказ принят
        //System.out.println("Прибудет к вам в ближайшее время"); //  прибудет к вам в ближайшее время
       // System.out.printf("Product name: %s \namount of product: %d  \n", productName, num);
        //System.out.println("Tовар доставим по адресу: "); // Товар доставим по адресу:
       // System.out.printf("Adress: %s  \nphone: %d  \n", address, l1 );
       scanner.close();

       /*В консоль выводит информацию о заказе, в виде:
    Товар <Наименование товара>
    в количестве <количество>
    Товар доставим по адресу: <адрес>.
    Ваш контактный номер: <телефон> */

    }
}
