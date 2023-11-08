package p2;

public class Main {
    public static void main(String []args){

        boolean fl=true;
        boolean fl2=false;
        byte b; // -128...127 байт
        short s; // -32768...32767 2 байта
        int i; //  -2*10^9..2 *10^9 4 байта
        long l; // -9*10^15...9*10^15 8 байт

float f; // 4 байта с плавающей точкой
double d; // 8 байт  с плавающей точкой

        char c; //2 байт хранит одиночный    тип
        byte b1=10;
        long l1=5_555_555_555L;
        System.out.println(l1);


        float f1=444.44f;

        String s1="Stroka";


String s2=s1+ " 2";
System.out.println(s2);
        char c1 = 'c';
        char c2 = 'a';
System.out.println(c1+c2);

char c3=102;
System.out.println(c3);
       String s3="a" ;
       String s4="c";
       System.out.println(s3+s4);

       String s5= "\tHello \nword";
       System.out.println(s5);

       int x4=10;
       int x5=20;
       System.out.println(" x= " + x4 + " x5 =" + x5);

       System.out.printf("x=%d x5=%d\n", x4, x5);

       String name = "Ivan";
       int age = 20;
       float height = 1.7f;
       System.out.printf("Name: %s age: %d height: %.2f \n", name, age,height );





    }

}
