import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Repl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CentroMedico centroMedico = new CentroMedico();
        outer: while (true) {
            System.out.println("");
            System.out.println("1. Display pazienti");
            System.out.println("2. Display medici");
            System.out.println("3. Aggiungi medico");
            System.out.println("4. Aggiungi paziente");
            System.out.println("5. Display visite mediche");
            System.out.println("6. Esci");
            int answer = scanner.nextInt();
            System.out.println("");
            switch (answer) {
                case 1:
                    centroMedico.printPazienti();
                    break;
                case 2:
                    centroMedico.printMedici();
                    break;
                case 3: {
                    String[] informazioni = get_person_from_user(scanner);
                    System.out.println("Stai inserendo un specialista? Y/N");
                    char input = ' ';
                    while (input != 'Y' && input != 'N') {
                        input = scanner.next().charAt(0);
                    }
                    boolean specialista = (input == 'Y');
                    String specializzazione;
                    int costo;
                    if (specialista) {
                        System.out.println("Inserisci la specializzazione");
                        specializzazione = scanner.next();
                        costo = scanner.nextInt();
                        centroMedico.addMedico(new Specialista(informazioni[0], informazioni[1], informazioni[2],
                                specializzazione, costo));
                    } else {
                        centroMedico.addMedico(new Medico(informazioni[0], informazioni[1], informazioni[2]));
                    }
                    break;
                }
                case 4:
                    String[] informazioni = get_person_from_user(scanner);
                    centroMedico.addPaziente(new Persona(informazioni[0], informazioni[1], informazioni[2]));
                    break;
                case 6:
                    break outer;
                default:
                    System.out.println("Valore non valido\n");
                    continue;
            }
        }

        scanner.close();
    }

    public static String[] get_person_from_user(Scanner scanner) {
        String[] informazioni = new String[3];
        System.out.println("Inserisci nome:");
        informazioni[0] = scanner.next();
        System.out.println("Inserisci cognome:");
        informazioni[1] = scanner.next();
        System.out.println("Inserisci numero di telefono:");
        informazioni[2] = scanner.next();
        return informazioni;
    }
}
