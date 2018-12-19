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

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Binary < T extends Number > {

 List < T > list = new ArrayList < T > ();
 int length;

 public void add(T item) {

  list.add(item);
  length++;
  list.sort(Comparator.comparing(T::longValue));

 };

 public void show() {

  for (T item: list) {
   System.out.print(item.toString() + ", ");
  }

 }

 public void find(int val) {
  int res = rank(val, list, 0, list.size() - 1);

  if (res == -1)
   System.out.println("Значення " + val +
    " відсутнє у масиві.");
  else
   System.out.println("Число " + val +
    " знаходиться на " + res + " позиції.");
 }

 private int rank(int val, List < T > arr, int lo, int hi) {

  if (lo > hi) return -1;

  int mid = lo + (hi - lo) / 2;

  if (val < arr.get(mid).longValue()) {
   return rank(val, arr, lo, mid - 1);
  } else if (val > arr.get(mid).longValue()) {
   return rank(val, arr, mid + 1, hi);
  } else {
   return mid;
  }
 }


}
