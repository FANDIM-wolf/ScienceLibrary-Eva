import com.ScienceEva.*;

import java.io.*;
import java.util.ArrayList;


public class main {

    public static void main(String[] argc) throws IOException {

        ArrayList<MathPackage> list = new ArrayList<MathPackage>();
        File file = new File("text.txt");
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

        ObjectSpace.AddInList(ObjectSpace);
        ObjectSpace.AddInList(ObjectSpace);
        list.add(ObjectSpace);
        ObjectSpace.ShowListOfObjects();
        Vector Vector_of_plane = new Vector();
        Vector_of_plane.x = 12;
        Vector_of_plane.y = 6;
        Vector_of_plane.z = 2;
        System.out.println("Magnitude Vector of Plane: "+Vector_of_plane.MagnitudeOfVector(Vector_of_plane));
        FileAssistent assistent = new FileAssistent();
        assistent.PutListDataInFile("package.txt" ,list );


        String str = "2x^2";
        int val = 2;

        System.out.println(ObjectSpace.derivativeVal(str, val));


    }

}
