package santamaria.aldo.nivell1_ex3;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Ex3 {

    public static Map<String, String> fileToHashmap(String path) {

        Map<String, String> countries = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split(" ");
                String name = words[0].trim();
                String capital = words[1].trim();
                countries.put(name, capital);

                if (!name.isEmpty() && !capital.isEmpty())
                    countries.put(name, capital);
            }
        } catch (IOException e) {
            e.printStackTrace();
    }
        return countries;
    }

    
    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);
        final String path = "resources/countries.txt";
        Map<String, String> mapFromFile = fileToHashmap(path);
      //  printMap(mapFromFile);
        try {
            String name;
            do {
                System.out.println("Enter your name: ");
                name = scanner.nextLine().trim().toLowerCase(); // Elimina espacios en blanco al inicio y al final
                if(name.isEmpty()){
                    System.out.println("Name cannot be empty");
                }

            } while (name.isEmpty()); // Repite hasta que el usuario ingrese algo



            int score = 0;
            for (int i = 0; i < 10; i++) {
                String country = randomCountrybyIterator(mapFromFile);
                System.out.println("What is the capital of " + country + "?");
                String capital = scanner.nextLine();
                if (capital.equalsIgnoreCase(mapFromFile.get(country))) {
                    score++;
                }


            }
            saveScore(name, score);
            System.out.println(name + " your score is: " + score);
            scanner.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void saveScore(String name, int score) {

        try {
            Map <String, Integer> scores = new HashMap<>();
            scores.put(name, score);
            FileWriter fileWriter = new FileWriter("resources/classificacio.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(name + " " + score);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String randomCountry(Map<String, String> mapFromFile) {
        return mapFromFile.keySet().toArray()[(int) (Math.random() * mapFromFile.size())].toString();
    }

    private static String randomCountrybyIterator(Map<String, String> mapFromFile) {
        int randomIndex = (int) (Math.random() * mapFromFile.size()); // Índice aleatorio
        Iterator<String> iterator = mapFromFile.keySet().iterator(); // Iterador sobre las claves

        String randomCountry = null;
        for (int i = 0; i <= randomIndex; i++) {
            randomCountry = iterator.next(); // Avanza hasta la clave aleatoria
        }

        return randomCountry;
    }

    private static void printMap(Map<String, String> mapFromFile) {
        mapFromFile.forEach((country, capital) -> {
            System.out.println("Country: " + country + " Capital: " + capital);
        });
    }


}
