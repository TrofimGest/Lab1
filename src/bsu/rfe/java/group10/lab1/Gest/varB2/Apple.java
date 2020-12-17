package bsu.rfe.java.group10.lab1.Gest.varB2;

public class Apple extends Food {
    // Новое внутреннее поле данных РАЗМЕР
    private String size;

    public Apple(String size) {
// Вызвать конструктор предка, передав ему имя класса
        super("Яблоко",0.);
// Инициализировать размер яблока
        this.size = size;
    }
    // Переопределить способ употребления яблока
    public void consume() {

        System.out.println(this + " съедено");
    }
    public Double calculateCalories(){
        if(this.size.equals("big"))
            return 100.;
        if(this.size.equals("medium"))
            return 70.;
        if(this.size.equals("small")) {
            return 50.;
        }
        else return this.getCalories();
    }
    // Селектор для доступа к полю данных РАЗМЕР
    public String getSize() {
        return size;
    }
    // Модификатор для изменения поля данных РАЗМЕР
    public void setSize(String size) {
        this.size = size;
    }
    // Переопределѐнная версия метода equals(), которая при сравнении
// учитывает не только поле name (Шаг 1), но и проверяет совместимость
// типов (Шаг 2) и совпадение размеров (Шаг 3)
    public boolean equals(Object arg0) {
        if (super.equals(arg0)) { // Шаг 1
            if (!(arg0 instanceof Apple)) return false; // Шаг 2
            return size.equals(((Apple)arg0).size); // Шаг 3
        } else
            return false;
    }
    // Переопределѐнная версия метода toString(), возвращающая не только
// название продукта, но и его размер
    public String toString() {
        return super.toString() + " размера '" + size.toUpperCase() + "'";
    }
}
