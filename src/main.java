import com.std.*;

import java.util.ArrayList;


public class main {
    public static void main(String[] argc){


        BiologyPackage ObjectBiology = new BiologyPackage();
        MathPackage ObjectSpace = new MathPackage();

        ObjectSpace.setName("Roony");
        ObjectBiology.setName("Miki");
        int result = ObjectSpace.number_in_power(23);
        ObjectBiology.GreetUserInConsole();

        System.out.println(result);

        //ObjectSpace.SetPersonalCode();
        //check for existing personal code
        ObjectSpace.ValidatePersonalCode(ObjectSpace);
        System.out.println(ObjectSpace.GetPersonalCode());
        ObjectBiology.AddInList(ObjectBiology);
        ObjectSpace.AddInList(ObjectSpace);
        ObjectSpace.AddInList(ObjectSpace);
        ObjectSpace.ShowListOfObjects();

    }
}
