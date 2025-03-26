package santamaria.aldo.level3_ex1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List<Person> personas = new ArrayList<>();
    private static final String FILE_PATH = "resources/personas.csv";

   public static void readCSV(String path){
         try {
              File file = new File(path);
              Scanner scanner = new Scanner(file);
              while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] data = line.split(",");
                System.out.println("Nombre: " + data[0] + " Apellido: " + data[1] + " DNI: " + data[2]);
              }
              scanner.close();
         } catch (Exception e){
              System.out.println("Error: " + e.getMessage());
         }
   }

   public static void showMenu(){

           System.out.println("\nMenú:");
           System.out.println("1.- Introduir persona.");
           System.out.println("2.- Mostrar les persones ordenades per nom (A-Z).");
           System.out.println("3.- Mostrar les persones ordenades per nom (Z-A).");
           System.out.println("4.- Mostrar les persones ordenades per cognoms (A-Z).");
           System.out.println("5.- Mostrar les persones ordenades per cognoms (Z-A).");
           System.out.println("6.- Mostrar les persones ordenades per DNI (1-9).");
           System.out.println("7.- Mostrar les persones ordenades per DNI (9-1).");
           System.out.println("0.- Sortir.");

    }

    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
       int option;

       do {
            showMenu();
            option = scanner.nextInt();
            switch (option){
                case 1:
                    System.out.println("Introdueix el nom:");
                    String name = scanner.next();
                    System.out.println("Introdueix el cognom:");
                    String lastName = scanner.next();
                    System.out.println("Introdueix el DNI:");
                    String dni = scanner.next();
                    personas.add(new Person(name, lastName, dni));
                    break;
                case 2:
                    personas.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));
                    personas.forEach(person -> System.out.println(person.getName() + " " + person.getLastName() + " " + person.getDni()));
                    break;
                case 3:
                    personas.sort((p1, p2) -> p2.getName().compareTo(p1.getName()));
                    personas.forEach(person -> System.out.println(person.getName() + " " + person.getLastName() + " " + person.getDni()));
                    break;
                case 4:
                    personas.sort((p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
                    personas.forEach(person -> System.out.println(person.getName() + " " + person.getLastName() + " " + person.getDni()));
                    break;
                case 5:
                    personas.sort((p1, p2) -> p2.getLastName().compareTo(p1.getLastName()));
                    personas.forEach(person -> System.out.println(person.getName() + " " + person.getLastName() + " " + person.getDni()));
                    break;
                case 6:
                    personas.sort((p1, p2) -> p1.getDni().compareTo(p2.getDni()));
                    personas.forEach(person -> System.out.println(person.getName() + " " + person.getLastName() + " " + person.getDni()));
                    break;
                case 7:
                    personas.sort((p1, p2) -> p2.getDni().compareTo(p1.getDni()));
                    personas.forEach(person -> System.out.println(person.getName() + " " + person.getLastName() + " " + person.getDni()));
                    break;
                case 0:
                    break ;
                default:
                    System.out.println("Opció no vàlida.");
            }
        } while (option != 0);




    }


}
