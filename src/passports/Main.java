package passports;

public class Main {
    public static void main(String[] args) {
        var passp = new Passport("0222 125556", "Крылов", "Иван",
                "Андреевич", "1996.12.01");
        var passp1 = new Passport("0221 123456", "Быков", "Владимир",
                "", "1976.11.11");
        var passp2 = new Passport("0722 177456", "Иванова", "Анна",
                "Андреевна", "1990.12.31");
        var passp3 = new Passport("0722 177456", "Петрова", "Анна",
                "Андреевна", "1990.12.31");
        var passpKeeper = new PassportKeeper();
        passpKeeper.addPassport(passp2);
        passpKeeper.addPassport(passp3);
        passpKeeper.addPassport(passp1);
        passpKeeper.addPassport(passp);
        System.out.print(passpKeeper);
        System.out.println(passpKeeper.getPassport("0222 125556"));
        System.out.println(passpKeeper.getPassport("0222 "));
    }
}
