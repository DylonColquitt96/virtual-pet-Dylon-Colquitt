import java.util.Scanner;

public class VirtualPetApplication {
    public static void main(String[] args) {
        virtualPet myVirtualPet = new virtualPet();

        Scanner input = new Scanner(System.in);
        String petName = "";
        System.out.println("What will you name your pet?");
        petName = input.nextLine();
        System.out.println("Congratulations! You have adopted a dragon named " + petName + "!");
        System.out.println("\n");

        System.out.println("                      / \\\\  / \\                \n" +
                "                     /.  \\\\/   \\      |\\___/|  \n" +
                "  *----*           / / |  \\\\    \\  __/  O  O\\  \n" +
                "  |   /          /  /  |   \\\\    \\_\\/  \\     \\    \n" +
                " / /\\/         /   /   |    \\\\   _\\/    '@___@     \n" +
                "/  /         /    /    |     \\\\ _\\/       |U\n" +
                "|  |       /     /     |      \\\\\\/        |\n" +
                "\\  |     /_     /      |       \\\\  )   \\ _|_\n" +
                "\\   \\       ~-./_ _    |    .- ; (  \\_ _ _,\\'\n" +
                "~    ~.           .-~-.|.-*      _        {-,\n" +
                " \\      ~-. _ .-~                 \\      /\\'\n" +
                "  \\                   }            {   .*\n" +
                "   ~.                 '-/        /.-~----.\n" +
                "     ~- _             /        >..----.\\\\\\\n" +
                "         ~ - - - - ^}_ _ _ _ _ _ _.-\\\\\\");
        int choice = 0;

        while (choice != 5) {


            //Tried to post up above the level of hunger and everything, but
            //it didn't come out right
            System.out.println("What would you like to do with " + petName + "?");
            System.out.println("1. Feed " + petName);
            System.out.println("2. Tell " + petName + " a story");
            System.out.println("3. Let " + petName + " fly around");
            System.out.println("4. Ask " + petName + " to show off");
            System.out.println("5. Do nothing");

            choice = input.nextInt();
            if (choice == 1) {
                do {
                    System.out.println("What will you feed " + petName + "?");
                    System.out.println("1. A pesky goblin");
                    System.out.println("2. A cream cheese danish");
                    System.out.println("3. A sprig of parsley");
                    System.out.println("4. Nothing");
                    int foodChoice = input.nextInt();

                    myVirtualPet.eat(foodChoice);
                    //links up to eat method in virtual pet line 40

                    if (foodChoice == 1) {
                        System.out.println(petName + " says, My favorite!\n");
                        System.out.println("                      / \\\\  / \\                \n" +
                                "                     /.  \\\\/   \\      |\\___/|  \n" +
                                "  *----*           / / |  \\\\    \\  __/  ♡  ♡\\  \n" +
                                "  |   /          /  /  |   \\\\    \\_\\/  \\     \\    \n" +
                                " / /\\/         /   /   |    \\\\   _\\/    '@___@     \n" +
                                "/  /         /    /    |     \\\\ _\\/       |U\n" +
                                "|  |       /     /     |      \\\\\\/        |\n" +
                                "\\  |     /_     /      |       \\\\  )   \\ _|_\n" +
                                "\\   \\       ~-./_ _    |    .- ; (  \\_ _ _,\\'\n" +
                                "~    ~.           .-~-.|.-*      _        {-,\n" +
                                " \\      ~-. _ .-~                 \\      /\\'\n" +
                                "  \\                   }            {   .*\n" +
                                "   ~.                 '-/        /.-~----.\n" +
                                "     ~- _             /        >..----.\\\\\\\n" +
                                "         ~ - - - - ^}_ _ _ _ _ _ _.-\\\\\\");
                    } else if (foodChoice == 2) {
                        System.out.println(petName + " says, Mmmmmmmm\n");
                        System.out.println("                      / \\\\  / \\                \n" +
                                "                     /.  \\\\/   \\      |\\___/|  \n" +
                                "  *----*           / / |  \\\\    \\  __/  O  O\\  \n" +
                                "  |   /          /  /  |   \\\\    \\_\\/  \\     \\    \n" +
                                " / /\\/         /   /   |    \\\\   _\\/    '@___@     \n" +
                                "/  /         /    /    |     \\\\ _\\/       |U\n" +
                                "|  |       /     /     |      \\\\\\/        |\n" +
                                "\\  |     /_     /      |       \\\\  )   \\ _|_\n" +
                                "\\   \\       ~-./_ _    |    .- ; (  \\_ _ _,\\'\n" +
                                "~    ~.           .-~-.|.-*      _        {-,\n" +
                                " \\      ~-. _ .-~                 \\      /\\'\n" +
                                "  \\                   }            {   .*\n" +
                                "   ~.                 '-/        /.-~----.\n" +
                                "     ~- _             /        >..----.\\\\\\\n" +
                                "         ~ - - - - ^}_ _ _ _ _ _ _.-\\\\\\");

                    } else if (foodChoice == 3) {
                        System.out.println(petName + " says, \"Thanks, I guess\" \n");
                        System.out.println("                      / \\\\  / \\                \n" +
                                "                     /.  \\\\/   \\      |\\___/|  \n" +
                                "  *----*           / / |  \\\\    \\  __/  -  -\\  \n" +
                                "  |   /          /  /  |   \\\\    \\_\\/  \\     \\    \n" +
                                " / /\\/         /   /   |    \\\\   _\\/    '@___@     \n" +
                                "/  /         /    /    |     \\\\ _\\/       |U\n" +
                                "|  |       /     /     |      \\\\\\/        |\n" +
                                "\\  |     /_     /      |       \\\\  )   \\ _|_\n" +
                                "\\   \\       ~-./_ _    |    .- ; (  \\_ _ _,\\'\n" +
                                "~    ~.           .-~-.|.-*      _        {-,\n" +
                                " \\      ~-. _ .-~                 \\      /\\'\n" +
                                "  \\                   }            {   .*\n" +
                                "   ~.                 '-/        /.-~----.\n" +
                                "     ~- _             /        >..----.\\\\\\\n" +
                                "         ~ - - - - ^}_ _ _ _ _ _ _.-\\\\\\");
                    } else if (foodChoice == 4) {
                        break;
                    }
                }
                while (!myVirtualPet.getHungerStatus());
/*            } else if (choice == 2) {
                    int boredomLevel = 0;
                    while (boredomLevel)
            } else if (choice == 3) {
            } else if (choice == 4) {
                }*/

            }
            myVirtualPet.tickCounter();
        }
    }

}
