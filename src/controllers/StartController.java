package controllers;
import models.BasicData;
import models.newCharacter;
import models.templates;
import java.util.Arrays;
import java.util.Scanner;

public class StartController  extends BasicData {

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Witaj w kreatorze postaci, chcesz stworzyć nową postać czy wybrać gotową?(Nowa/Gotowa)");
        String decision = String.valueOf(scanner.nextLine());

        switch (decision) {
            case "Nowa" -> {
                newCharacter newCharacter = new newCharacter();
                System.out.println("Podaj imię postaci");
                newCharacter.setName(String.valueOf(scanner.nextLine()));
                System.out.println("Podaj historię postaci");
                newCharacter.setOrigin(String.valueOf(scanner.nextLine()));
                System.out.println("Podaj płeć postaci");
                newCharacter.setGender(String.valueOf(scanner.nextLine()));
                System.out.println("Podaj przynależność postaci");
                newCharacter.setAffiliation(String.valueOf(scanner.nextLine()));
                System.out.println("Podaj wiek postaci");
                newCharacter.setAge(Integer.parseInt(scanner.nextLine()));
                System.out.println(Arrays.toString(newCharacter.CharacterData()));

            }
            case "Gotowa" -> {

                templates templates = new templates();
                System.out.println("Wybierz postać(podaj numer): 1.Donna Redfield 2.Jason Marr 3. Illeiah Marson ");
                String wybor = scanner.nextLine();
                switch(wybor){
                    case "1" -> {
                        templates.setName("Donna Redfield");
                        templates.setKlasa("Operative");
                        templates.setGender("Female");
                        templates.setOrigin("Spec op soldier");
                        templates.setAge(35);
                        templates.setAffiliation("Galactic Unified Alliance");
                    }
                    case "2" -> {
                        templates.setName("Jason Marr");
                        templates.setKlasa("Bounty Hunter");
                        templates.setGender("Male");
                        templates.setOrigin("Bounty Hunter");
                        templates.setAge(29);
                        templates.setAffiliation("Neutral");
                    }case "3" -> {
                        templates.setName("Illeiah Marson");
                        templates.setKlasa("Warrior");
                        templates.setGender("Female");
                        templates.setOrigin("Wandering templar");
                        templates.setAge(31);
                        templates.setAffiliation("Scion's order");
                    }}
                System.out.println(Arrays.toString(templates.TemplateData()));

            }
            default -> {
                System.out.println("Błędny wybór");
                this.run();
            }
        }


        this.breakLine();
    }
}
