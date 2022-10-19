package passports;

import java.time.LocalDate;
import java.util.Objects;

public class Passport {
    private final String number;
    private String name;
    private String surname;
    private String midName;
    private LocalDate bornDate;

    public Passport(String number, String surname, String name, String midName, String bornDate) {
        if (number == null || number.isBlank() || !number.matches("\\d{4}\\s\\d{6}")) {
            throw new IllegalArgumentException();
        } else {
            this.number = number;
        }
        setName(name);
        setSurname(surname);
        setMidName(midName);
        setBornDate(bornDate);
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException();
        } else {
            this.name = name;
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (surname == null || surname.isBlank()) {
            throw new IllegalArgumentException();
        } else {
            this.surname = surname;
        }
    }

    public String getMidName() {
        return midName;
    }

    public void setMidName(String midName) {
        if (midName == null || midName.isBlank()) {
            this.midName = "Отсутствует";
        } else {
            this.midName = midName;
        }
    }

    public LocalDate getBornDate() {
        return bornDate;
    }

    public void setBornDate(String bornDate) {
        if (bornDate == null || bornDate.isBlank()) {
            throw new IllegalArgumentException();
        } else {
            this.bornDate = LocalDate.parse(bornDate.replace('.', '-'));
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return number.equals(passport.number);
    }

  /*  @Override
    public int hashCode() {
        return Objects.hash(number);
    }*/

    @Override
    public String toString() {
        return number + ", " + surname + ' ' + name + ' ' + midName + ", " + bornDate;
    }
}
