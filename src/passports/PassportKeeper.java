package passports;

import recipes.Recipe;

import java.util.LinkedList;
import java.util.List;


public class PassportKeeper {
    private final List<Passport> passportKeeper = new LinkedList<>();

    public void addPassport(Passport p) {
        int x = passportKeeper.indexOf(p);
        if (x == -1) {
            passportKeeper.add(p);
        } else {
           var temp =  passportKeeper.get(x);
            temp.setBornDate(p.getBornDate().toString());
            temp.setSurname(p.getSurname());
            temp.setName(p.getName());
            temp.setMidName(p.getMidName());
        }
    }

    public Passport getPassport(String number) {
        for (Passport passport : passportKeeper) {
            if (passport.getNumber().equals(number)) {
                return passport;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        var sb = new  StringBuilder();
        for (Passport passport : passportKeeper) {
            sb.append(passport.toString()).append('\n');
        }
        return sb.toString();
    }
}
