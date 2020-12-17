package bsu.rfe.java.group10.lab1.Gest.varB2;

public class Pie extends Food{
    private String taste = null;
    public Pie(String taste)
    {
        super("Pie", 0.);
        this.taste = taste;

    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    @Override
    public String toString() {
        return super.toString() + " вкуса '" + taste.toUpperCase() + "'";
    }
    public boolean equals(Object arg0) {
        if (super.equals(arg0)) { // Шаг 1
            if (!(arg0 instanceof Pie)) return false; // Шаг 2
            return taste.equals(((Pie)arg0).taste); // Шаг 3
        } else
            return false;
    }
    public void consume() {
        System.out.println(this + " съедено");

    }


    public Double calculateCalories() {
        if(this.taste.equals("Cherry"))
            return 370.;
        if(this.taste.equals("Strawberry"))
            return 500.;
        if(this.taste.equals("Apple")) {
            return 340.;
        }
        else return this.getCalories();
    }
}
