package Main;
public class Main {

    public static void main(String[] args) {
        int numeroIf = 5;

        if (numeroIf > 0) {
            System.out.println("El número es positivo.");
        } else if (numeroIf < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }


        int numeroWhile = 0;

        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("Bucle while " + numeroWhile);
        }


        int numeroDoWhile = 0;

        do {
            numeroDoWhile++;
            System.out.println(numeroDoWhile);
        } while (numeroDoWhile < 1);


        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("Bucle For " + numeroFor);
        }

        String estacion = "verano";

        switch (estacion) {
            case "verano":
                System.out.println("Estamos en verano.");
                break;
            case "otoño":
                System.out.println("Estamos en otoño.");
                break;
            case "invierno":
                System.out.println("Estamos en invierno.");
                break;
            case "primavera":
                System.out.println("Estamos en primavera.");
                break;
            default:
                System.out.println("El valor dado no corresponde a ninguna estación.");
        }

    }
}