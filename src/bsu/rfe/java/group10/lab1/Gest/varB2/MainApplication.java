package bsu.rfe.java.group10.lab1.Gest.varB2;

import java.util.Arrays;
import java.util.Comparator;

public class MainApplication {
    // Конструктор класса отсутствует!!!
    // Главный метод главного класса
    public static void main(String[] args) throws Exception {
        // Определение ссылок на продукты завтрака
        Food[] breakfast = new Food[20];
        boolean b1=false, b2=false;
        // Анализ аргументов командной строки и создание для них
        // экземпляров соответствующих классов для завтрака
        int itemsSoFar = 0;
        for (String arg: args) {
            String[] parts = arg.split("/");
            if (parts[0].equals("Cheese")) {
// У сыра дополнительных параметров нет
                breakfast[itemsSoFar++] = new Cheese();
            } else
            if (parts[0].equals("Apple")) {
// У яблока – 1 параметр, который находится в parts[1]
                breakfast[itemsSoFar++] = new Apple(parts[1]);
            }
            if (parts[0].equals("Pie")) {
// У пирога – 1 параметр, который находится в parts[1]
                breakfast[itemsSoFar++] = new Pie(parts[1]);

            }
            if (parts[0].equals("-sort")){
                b1=true;
            }
            if (parts[0].equals("-calories")){
                b2=true;
            }
// ... Продолжается анализ других продуктов для завтрака

        }
        for(Food f:breakfast) {
            if (f != null) {
                System.out.println(f);
            }
            else break;
        }
        if(b1) {
            Arrays.sort(breakfast, new Comparator() {
                public int compare(Object f1, Object f2) {
                    if (f1 == null) return 1;
                    if (f2 == null) return -1;
                    return ((Food) f2).calculateCalories().compareTo(((Food) f1).calculateCalories());
                }
            });
        }

        System.out.println("\n\n Завтрак после сортировки");
        for(Food f:breakfast) {
            if (f != null) {
                System.out.println(f);
            }
            else break;
        }
        if(b2){
            double calcounter = 0.;
            for(Food f:breakfast){
                if(f!=null){
                    calcounter += f.calculateCalories();
                }
            }
            System.out.println("\n\n сумма калорий завтрака = "+calcounter);
        }

// Перебор всех элементов массива
        for (Food item: breakfast)
            if (item!=null)
// Если элемент не null – употребить продукт
                item.consume();
            else
// Если дошли до элемента null – значит достигли конца
// списка продуктов, ведь 20 элементов в массиве было
// выделено с запасом, и они могут быть не
// использованы все
                break;
    }
}