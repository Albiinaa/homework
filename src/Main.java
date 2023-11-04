import javax.xml.namespace.QName;
import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println(name(17,66));
        System.out.println(name(11,28));
        System.out.println(name(23,44));
        System.out.println(name(34,15));
        System.out.println(name(18,99));
        System.out.println(name(generateRandomAge(), 10));
        }
        public static int generateRandomAge(){
            Random ageRandom = new Random();
            return ageRandom.nextInt(20);

        }

    public static String name(int age, int degree) {
        if (age>20 && age<45 && degree> -20 && degree<30) {
            return "Можно идти гулять";
        }else if (age<20 && degree >0 && degree <28 ){
            return "Можно идти гулять";
        }else if (age>45 && degree> -10 && degree<25){
            return "Можно идти гулять";
        }else {
            return "Оставайся дома";
        }
    }
    }







