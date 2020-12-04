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


        int choice = 0;

        while (choice != 5) {
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
            myVirtualPet.tickCounter();
            //tick counter location so every time it cycles through an action, it will place the tick counter here

            System.out.println("What would you like to do with " + petName + "?");
            System.out.println("1. Feed " + petName);
            System.out.println("2. play with " + petName);
            System.out.println("3. Give " + petName + " a drink");
            System.out.println("4. Nap time");
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
                //choice 2 loop, playing with dragon effects boredom level
            } else if (choice == 2) {
                do {
                    //play choices for user
                    System.out.printf("How would you like to play with %s \n", petName);
                    System.out.printf("1. Ride %s while they fly around the block \n", petName);
                    System.out.printf("2. Go burn cattle with %s\n", petName);
                    System.out.printf("3. Play fetch with %s\n", petName);
                    System.out.println("4. do nothing");

                    int playChoice = input.nextInt();

                    myVirtualPet.play(playChoice);

                    if (playChoice == 1) {
                        System.out.println("Look how high we can fly!");
                    } else if (playChoice == 2) {
                        System.out.println("Do we get to eat them now?");
                    } else if (playChoice == 3) {
                        System.out.println("That was fun! Let's invite more friends next time!");
                    } else if (playChoice == 4){
                        break;
                    }
                }
                while (!myVirtualPet.getBoredStatus());
                //choice 3 loop, giving dragon drink effects thirst level
            } else if (choice == 3) {
                do {
                    //drink choices for user
                    System.out.printf("What will you give %s to drink? \n", petName);
                    System.out.println("1. Lake Water");
                    System.out.println("2. Purified water");
                    System.out.println("3. Actually, let's do something else");

                    int drinkChoice = input.nextInt();

                    myVirtualPet.drink(drinkChoice);

                    if (drinkChoice == 1) {
                        System.out.println("That was tasty, now can we go for a swim?");
                    } else if (drinkChoice == 2) {
                        System.out.println("...Is this supposed to taste bland?");
                    } else if (drinkChoice == 3) {
                        break;
                    }
                }
                while (!myVirtualPet.getThirstStatus());
            } else if (choice == 4) {
                do {
                    System.out.printf("How long will you let %s rest?", petName);
                    System.out.printf("Let %s rest 1 hour", petName);
                    System.out.printf("Let %s rest 20 minutes", petName);
                    System.out.printf("Do something else with %s", petName);
                    int restChoice = input.nextInt();
                    myVirtualPet.rest(restChoice);
                }
                while (!myVirtualPet.getTiredStatus());
            }

        }
    }

}
