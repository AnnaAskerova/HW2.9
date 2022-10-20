package passports;

import java.util.HashSet;
import java.util.Set;

public class PassportKeeper {
    private final Set<Passport> passportKeeper = new HashSet<>();

    public void addPassport(Passport p) {
        if (passportKeeper.add(p)) {
            return;
        } else {
            for (Passport pass : passportKeeper) {
                if (pass.getNumber().equals(p.getNumber())) {
                    pass.setBornDate(p.getBornDate().toString());
                    pass.setSurname(p.getSurname());
                    pass.setName(p.getName());
                    pass.setMidName(p.getMidName());
                }
            }
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
        var sb = new StringBuilder();
        for (Passport passport : passportKeeper) {
            sb.append(passport.toString()).append('\n');
        }
        return sb.toString();
    }
}
