
package kata1;

import java.time.LocalDate;



class Person {

    private String name;
    private LocalDate birthday;

    public Person(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return getName() + "con" + getAge() + "de edad.";
    }

    private int getAge() {
        return birthday.until(LocalDate.now()).getYears();
    }
    
    
}
