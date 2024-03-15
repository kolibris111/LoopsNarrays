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

        String kint = "An American in Paris";

        System.out.println(kint.replace("a","*").replace("A","*"));

        System.out.println(kint.replaceAll(("[AaEeIiOoUuYy]") , ""));

        System.out.println("/////// 6 uzduotis ///////");

        //Sukurti kintamąjį su stringu: “An American in Paris”. Jame ištrinti visas balses. Rezultatą atspausdinti.
        // Kodą pakartoti su stringais: “Breakfast at Tiffany's”, “2001: A Space Odyssey” ir “It's a Wonderful Life”.

        System.out.println(kint.replace("A","")
                .replace("e","")
                .replace("i","")
                .replace("a",""));

            String kint1 = "Breakfast at Tiffany's";

        System.out.println(kint1.replace("e","")
                .replace("a","")
                .replace("i","")
                .replace("y",""));

            String kint2 = "2001: A Space Odyssey";
        System.out.println(kint2.replace("A","")
                .replace("a","")
                .replace("e","")
                .replace("O","")
                .replace("y",""));

            String kint3 = "It's a Wonderful Life";
        System.out.println(kint3.replace("I","")
                .replace("a","")
                .replace("o","")
                .replace("e","")
                .replace("u","")
                .replace("i",""));

            System.out.println("KITAS VARIANTAS, kuri geriausia naudoti");

            System.out.println(kint.replaceAll(("[AaEeIiOoUuYy]") , ""));
            System.out.println(kint1.replaceAll(("[AaEeIiOoUuYy]") , ""));
            System.out.println(kint2.replaceAll(("[AaEeIiOoUuYy]") , ""));
            System.out.println(kint3.replaceAll(("[AaEeIiOoUuYy]") , ""));

            System.out.println("/////// 7 uzduotis ///////");

            //Stringe, kurį generuoja toks kodas:
            // "Star Wars: Episode "+ " ".repeat( (int) (Math.random() * 10))+((int)
            // (Math.random() * 7)+1) + " - A New Hope" Surasti ir atspausdinti epizodo numerį.

            String episode = "Star Wars: Episode " + " ".repeat( (int) (Math.random() * 10))+((int) (Math.random() * 7)+1) + " - A New Hope";
            System.out.println(episode);
            System.out.println("ep.numb:" + episode.replaceAll("[^0-9.]", ""));

            System.out.println("KITAS VARIANTAS");



















































    }
}