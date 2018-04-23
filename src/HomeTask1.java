import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;


//3*. Пользователь вводит через пробел слова.
//    Найтивсе группы палиндромов и вывести их в консоль
//    Файл Anagram

public class HomeTask1 {

    ArrayList<String> arrayList = new ArrayList<>();

    // метод для перевода введенной строки в списочный массив
    public void stringToArrayList() {
        System.out.println("Введите слова");
        Scanner scanner = new Scanner(System.in); //вводим значения
        String val = scanner.nextLine();
        val = val.toLowerCase().trim();
        String arrStr[] = val.split(" ");
        for (String str : arrStr){
            if (str.matches("^-?\\d+$")) { // проверка на наличие лишних знаков
                System.out.println("Введены некорректные символы!");
                break;
            } else if (!str.isEmpty()){ // проверка на наличие пустой строки
                arrayList.add(str);
            }
        }
        System.out.println(arrayList.toString());
    }

    // метод проверяющий и выводящий палиндромы
    public void findPalindrome(){
        for (String str : arrayList){ // берем списочный массив и идем по нему через цикл
            String b = new StringBuffer(str).reverse().toString(); // переворачиваем слово
            if (str.equals(b)){
                System.out.println("Палиндром: " + str);
            }
        }
    }

    public static void main(String[] args) {

    HomeTask1 homeTask1 = new HomeTask1();
    homeTask1.stringToArrayList();
    homeTask1.findPalindrome();

    }
}
