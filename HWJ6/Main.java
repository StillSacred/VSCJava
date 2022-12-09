/*
Реализовать множество (set) с помощью TreeMap.
Создать метод add, добавляющий элемент в ваше множество.
Объявить и инициализировать компаратор с обратной (от большего к меньшеиу) логикой сортировки чисел.
Объявить и инициализировать TreeSet использующий ваш компаратор.
Добавить несколько эллементов в сет и вывести в консоль.
 */

package HWJ6;

import java.util.Random;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        SetTreeMap setTreeMap = new SetTreeMap();
        for (int i = 0; i < 10; i++) {
            int randomNum = new Random().nextInt(50);
            setTreeMap.addInt(randomNum);
        }
        System.out.println(setTreeMap);

        IntegerComparator intComp = new IntegerComparator();
        TreeSet<Integer> treeSet = new TreeSet<>(intComp);

        for (int i = 0; i < 10; i++) {
            int randomNum = new Random().nextInt(500);
            treeSet.add(randomNum);
        }
        System.out.println(treeSet);
    }
}