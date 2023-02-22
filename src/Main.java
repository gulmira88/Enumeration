import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Planeta[] planeta = Planeta.values();

       String a = new Scanner(System.in).nextLine().toUpperCase();

        switch (a){
            case "MARS":
                System.out.println("Kундон эн алыскы тортунчу планета");
                break;
            case "SATURN":
                System.out.println("Юпитерден кийинки экинчи чон планета");
                break;
            case "EARTH":
                System.out.println("Чон планеталардын ичинен бешинчи орунда турат");
                break;
            case "JUPITER":
                System.out.println("Кун системасындагы эн чон планета");
                break;
            case" MERCURY":
                System.out.println("Кун системасындагы эн кичине планета");
                break;
            case "VENUS":
                System.out.println("Жер планетасына абдан окшош");
                break;
            default:
                System.out.println("Мындай планета жок");

        }






    }
}