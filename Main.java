/*

Кенгерли Эльмар, ИП-72
Вариант 13, уровень А.

Створити наступний шаблон класу:
-	масив елементів. Тип даних елементів масиву є параметризованим ( шаблонним );
-	число елементів масиву;
-	метод пошуку індексу елементу в масиві, згідно варіанту ( 13 варіант, бінарний пошук )
-	конструктор для автоматичної ініціалізації унікального масиву елементів, заданої довжини;
-	деструктор ( за необхідністю )
Продемонструвати роботу шаблону на різних базових цілочисельних типах даних.

*/

public class Main {


 public static void main(String[] args) {

  byte a[] = {
   3,
   25,
   23,
   0,
   2,
   1,
   6,
   40,
   53,
   23,
   123,
   50,
   23
  };

  Binary < Byte > bytes = new Binary < > ();
  Binary < Integer > integers = new Binary < > ();
  Binary < Long > longes = new Binary < > ();

  for (byte k: a) {
   bytes.add(k);
   integers.add((int) k);
   longes.add((long) k);
  }

  System.out.println("Byte:");
  bytes.show();
  bytes.find(19);
  System.out.println("Integer:");
  integers.show();
  integers.find(25);
  System.out.println("Long:");
  longes.show();
  longes.find(1);

 }


}
