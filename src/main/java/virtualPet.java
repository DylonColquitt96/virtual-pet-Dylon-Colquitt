public class virtualPet {
   int boredomLevel;
   int hungerLevel;
   int thirstLevel;
   boolean hungry;
   int maxCount = 20;


    public virtualPet(){
        boredomLevel = maxCount;
        thirstLevel = maxCount;
        hungerLevel = maxCount;


    //Lists out the max of the levels of each field

    }

  public void tickCounter( ){
          setHungerLevel(hungerLevel -1);
          //This set method if found on line 36 on virtualPet class.
          setThirstLevel(thirstLevel -1);
          //This set method if found on line 67 on virtualPet class.
          setBoredomLevel(boredomLevel -1);
          //uses a "set method" where the value can not exceed "maxCounter" but will go down below the "maxCounter"
          //This set method if found on line 81 on virtualPet class.

          System.out.println("Boredom Level: " + boredomLevel + " Hunger Level: " + hungerLevel +
                  " Thirst Level: " + thirstLevel);
      //Tick counter, is telling the levels to go down by 1 each time it loops back over to it thanks to the
      //while loop in the main application
      //Print line shows what each level is at the time for the user
   }


  public void setHungerLevel(int newValue){
        hungerLevel = newValue;
        if ( hungerLevel > maxCount){
            hungerLevel = maxCount;
        }
  }


    public boolean getHungerStatus() {
        if (hungerLevel <= 10) {
            return hungry;
        }
        else
            return !hungry;
    }

    public void eat(int choice) {
        if (choice == 1){
            hungerLevel += 3;
        } else if(choice == 2){
            hungerLevel += 2;
        } else if (choice == 3) {
            hungerLevel += 1;
        }
        //we use the eat function on line 54 in the main application, shown as this "myVirtualPet.eat(foodChoice); "
        //we call our myVirtualPet which connects to this class, then we use .eat which connects to the method above.
        //with in the parameters (), we place food choice, which is what we named the input in which the user will type
        //out. And depending on what number they chose, then the above method will add the appropriate amount
        //to food choice.
    }

    public void setThirstLevel(int newValue){
        thirstLevel = newValue;

        if(thirstLevel > maxCount){
            thirstLevel = maxCount;
        }
    }

    public void drink(int choice){
        if (choice == 1){
            thirstLevel +=3;
        } else if (choice == 2){
            thirstLevel +=2;
        }
    }

    public void setBoredomLevel(int newValue){
        boredomLevel = newValue;
        if (boredomLevel > maxCount){
            boredomLevel = maxCount;
        }
    }

    public void play (int choice){
        if (choice == 1){
            boredomLevel += 3;
        } else if (choice == 2){
            boredomLevel += 2;
        } else if ( choice == 3){
            boredomLevel += 1;
        }
    }

}
