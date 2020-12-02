import java.util.Scanner;

public class VirtualPetApplication {
    public static void main(String[] args) {
        virtualPet myVirtualPet = new virtualPet();
        Scanner input = new Scanner(System.in);
        String petName = "";
        System.out.println("What will you name your pet?");
        petName = input.nextLine();
        System.out.println("Hello, " + petName + "!");
    }
}
