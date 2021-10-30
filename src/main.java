import com.ScienceEva.*;

import java.io.*;
import java.util.ArrayList;


public class main {
    public static void main(String[] argc) throws IOException {

        File file = new File("text.txt");
        BiologyPackage ObjectBiology = new BiologyPackage();
        MathPackage ObjectSpace = new MathPackage();

        ObjectSpace.setName("Roony");
        ObjectBiology.setName("Miki");
        int result = ObjectSpace.number_in_power(23);
        ObjectBiology.GreetUserInConsole();

        System.out.println(result);

        ObjectSpace.SetPersonalCode();
        //check for existing personal code
        ObjectSpace.ValidatePersonalCode(ObjectSpace);
        System.out.println(ObjectSpace.GetPersonalCode());

        ObjectSpace.AddInList(ObjectSpace);
        ObjectSpace.ShowListOfObjects();
        Vector Vector_of_plane = new Vector();
        Vector_of_plane.x = 12;
        Vector_of_plane.y = 6;
        Vector_of_plane.z = 2;
        System.out.println("Magnitude Vector of Plane: "+Vector_of_plane.MagnitudeOfVector(Vector_of_plane));

        FileWriter fw = new FileWriter("list.txt");
        Writer output = new BufferedWriter(fw);
        int sz = ObjectSpace.packages.size();
        for(int i = 0 ; i < sz; i++){
            output.write(ObjectSpace.packages.get(i).toString() + "\n");

        }
        output.close();

    }

}
