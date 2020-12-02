import org.junit.Assert;
import org.junit.Test;

public class virtualPetTest {

    @Test
    public void whatIsMyViritualPetName(){
        virtualPet myVirtualPet = new virtualPet();
        String name = myVirtualPet.nameVirtualPet("James");
        Assert.assertEquals("James", name);
    }
    //The test above is mainly focused on telling me my pets name

    @Test
    public void isTheVirtualPetHungry (){
        virtualPet myVirtualPet = new virtualPet();
        int hunger = myVirtualPet.hungerStatus(100);
        Assert.assertEquals(100, hunger);
    }
    //The test above is mainly focused on telling me if my pet is Hungry

    @Test
    public void isMyVirtualPetBored(){
        virtualPet myVirtualPet = new virtualPet();
        int excitedOrBored = myVirtualPet.excitedBored(50);
        Assert.assertEquals(50, excitedOrBored);
    }
    //The test above is mainly focused on telling me if my pet is Bored



}
