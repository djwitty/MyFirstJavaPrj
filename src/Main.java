import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(LocalDate.now().format(DateTimeFormatter.ofPattern("dd MMMM YYYY ")));
    }
}
//Commented code
