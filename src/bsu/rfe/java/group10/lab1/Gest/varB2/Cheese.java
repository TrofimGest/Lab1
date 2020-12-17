package bsu.rfe.java.group10.lab1.Gest.varB2;

public class Cheese extends Food {
    public Cheese() {
        super("Сыр", 325.);
    }
    public void consume() {
        System.out.println(this + " съеден");
    }
    public Double calculateCalories(){
        return this.getCalories();
    }
// Переопределять метод equals() в данном классе не нужно, т.к. он
// не добавляет новых полей данных, а сравнение по внутреннему полю name
// уже реализовано в базовом классе
// Переопределять метод toString() в данном классе не нужно, т.к. он
// не добавляет внутренних полей данных, а возврат поля name уже
// реализован в версии toString() базового класса
}

