

public class Calculator {

    enum Operace {
        SCITANI, ODCITANI, NASOBENI, DELENI
    }

    public static void main(String[] args) {
        Operace prvni = Operace.NASOBENI;

        System.out.println(pocitani(prvni));

    }
    //metoda pocitani
    private static String pocitani(Operace operace) {

        int operandJedna = 10;
        int operandDva = 20;
        return switch (operace) {

            case SCITANI  -> "Vybral si sčítání. Výsledek je: " + (operandJedna + operandDva);
            case ODCITANI -> "Vybral si odčítaní. Výsledek je: " +(operandJedna - operandDva);
            case DELENI -> "Vybral si dělení. Výsledek je: " +(operandJedna/operandDva);
            case NASOBENI ->  "Vybral si násobení. Výsledek je: " + (operandJedna * operandDva);
            default -> throw new RuntimeException("Spatný požaqdavek na operaci");
        };

    }


}
