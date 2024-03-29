package obiektowość;

import dziedziczenie.Man;

public class Human {

    private String name;
    private String surname;
    private Integer birthYear;
    private Integer age;

    public Human ( String name, String surname, Integer birthYear) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.age = this.obliczWiek();

    }

    private Integer obliczWiek () {
        Integer actualYear = 2019;
        return actualYear - this.birthYear;

    }
    public void przedstawSie () {
        System.out.println("Hej, nazywam sie " + this.name + " " + this.surname);
        System.out.println("Mam " + this.age + " lata");
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;

        Man mezczyzna1 = new Man("Kazik", "Szulc", 1987);
        mezczyzna1.setWaga(70);
        mezczyzna1.ocenSile();
        mezczyzna1.przedstawSie();
    }

}

