import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("/////// 1 uzduotis ///////");

        // Sukurti du kintamuosius. Jiems priskirti savo mylimo aktoriaus vardą ir pavardę kaip stringus //
        // (Jonas Jonaitis). Atspausdinti trumpesnį stringą. //

        String name = "Tomas";
        String surname = "Kruzas";

        System.out.println(name.length());

        if (name.length() > surname.length()) {
            System.out.println(surname);
        }
        else if ( name.length() < surname.length() ) {
            System.out.println(name);
        }

        System.out.println("/////// 2 uzduotis ///////");

        //*Sukurti du kintamuosius. Jiems priskirti savo mylimo aktoriaus vardą ir pavardę kaip stringus.
        // Vardą atspausdinti tik didžiosiom raidėm, o pavardę tik mažosioms. (LEONARDO dicaprio)

        System.out.println(name.toUpperCase());
        System.out.println(surname.toLowerCase());

        System.out.println("/////// 3 uzduotis ///////");

        //Sukurti du kintamuosius. Jiems priskirti savo mylimo aktoriaus vardą ir pavardę kaip stringus.
        // Sukurti trečią kintamąjį ir jam priskirti stringą, sudarytą iš pirmų vardo ir pavardės kintamųjų raidžių.
        // Jį atspausdinti.

        String inic = name.substring(0,1) + surname.substring(0,1);

        System.out.println(name.substring(0,1) + surname.substring(0,1));

        System.out.println("/////// 4 uzduotis ///////");

        //*Sukurti du kintamuosius. Jiems priskirti savo mylimo aktoriaus vardą ir
        // pavardę kaip stringus. Sukurti trečią kintamąjį ir jam priskirti stringą, sudarytą iš trijų paskutinių
        // vardo ir pavardės kintamųjų raidžių. Jį atspausdinti.

        int a = name.length() - 3;
        int b = surname.length() - 3;

        System.out.println(name.substring(a) + surname.substring(b));

        System.out.println("/////// 5 uzduotis ///////");

        //Sukurti kintamąjį su stringu: “An American in Paris”. Jame visas “a” (didžiąsias ir mažąsias)
        // pakeisti žvaigždutėm “*”.  Rezultatą atspausdinti.
































    }
}