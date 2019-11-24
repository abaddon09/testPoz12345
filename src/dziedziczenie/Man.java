package dziedziczenie;

import obiektowość.Human;

public class Man extends Human {
    private String plec;
    private Integer waga;
    private Integer sila;

    public Man(String name, String surname, Integer birthYear) {
        super(name, surname, birthYear);
        this.plec = "mezczyzna";
    }

    public void setWaga(Integer waga) {
        this.waga = waga;
    }

    public void ocenSile() {
        if(this.waga < 45)
            this.sila = 1;
        else if(this.waga <= 90)
            this.sila = 2;
        else
            this.sila = 3;


    }

    @Override
    public void przedstawSie() {
        super.przedstawSie();
        switch(this.sila) {
            case 1: System.out.println("Sila nie jest moja mocna strona"); break;
            case 2: System.out.println("Jestem wystarczajaco silny"); break;
            case 3: System.out.println("Jestem mega silny"); break;
        }

        public static void opiszKlase() {
            System.out.println("Klasa Human oblicza wiek i umozliwia przedstawianie sie obiektu");
        }
    }
}


