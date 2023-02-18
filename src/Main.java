import java.util.Scanner;

public class Main {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.printf("Enter array size: ");
    int size = scan.nextInt();
    System.out.println("");
    ListAnimals animals = new ListAnimals(size);
    while(true){
        System.out.println("1. Add new animal");
        System.out.println("2. Search name");
        System.out.println("3. Delete an animal");
        System.out.println("4. Display");
        System.out.println("5. Exit");
        System.out.printf("Choose option: ");
        int choice = scan.nextInt();
        scan.nextLine();

        switch(choice){
            case 1:
                System.out.printf("Type of animal(Fish/Cat): ");
                String type = scan.nextLine();
                System.out.printf("Name: ");
                String name = scan.nextLine();
                if (type != null) {
                    if(type.equalsIgnoreCase("Cat")) {
                        Cat cat = new Cat(name);
                        if(animals.addAnimal(cat)) {
                            System.out.println("Cat " + name + " successfully added.");
                            System.out.println("");
                        }
                    } else if(type.equalsIgnoreCase("Fish")){
                        Fish fish = new Fish(name);
                        if(animals.addAnimal(fish)) {
                            System.out.println("Fish " + name + " successfully added.");
                            System.out.println("");
                        }
                    } else{
                        System.out.println("Animal name exist or you chose a type not specified.");
                    }
                }
                break;
            case 2:
                System.out.printf("Enter animal name: ");
                String searchName = scan.nextLine();
                Animal searchanimal = animals.searchByName(searchName);
                if (searchanimal != null) {
                    System.out.println((searchanimal.getClass().getName()) + " " + searchName + " has " + searchanimal.legs + " legs.");
                } else {
                    System.out.println("<<"+ searchName + ">>" + " not in the list");
                }
                break;
            case 3:
                System.out.println("Enter animal name: ");
                String deleteName = scan.nextLine();
                Animal delAnimal = animals.deleteAnimal(deleteName);
                if (delAnimal != null) {
                    System.out.println(((Pet)delAnimal).getName() + " deleted successfully!");
                } else {
                    System.out.println("Animal not found.");
                }
                break;
            case 4:
                animals.display();
                break;
            default:
                break;
        }

        }

    }
}