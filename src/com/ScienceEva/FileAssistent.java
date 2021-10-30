package com.ScienceEva;

import java.io.*;
import java.util.ArrayList;

public class FileAssistent {

    public void PutMathPackageInFile (String  file_name , ArrayList list )
             {
            try {
                File file = new File(file_name);
                FileWriter fw = new FileWriter(file);
                Writer output = new BufferedWriter(fw);
                int sz = list.size();
                for (int i = 0; i < sz; i++) {
                    output.write(list.get(i).toString() + "\n");
                }
                output.close();
            }
            catch (Exception e){
                e.printStackTrace();
            }

    }



}
