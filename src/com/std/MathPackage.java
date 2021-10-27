package com.std;

import java.util.ArrayList;

public class MathPackage {
      private String name;
      private String professor;
      private int personalCode;
      ArrayList<MathPackage> packages = new ArrayList<MathPackage>();


      //set personal code for object

    public void SetPersonalCode(){
        personalCode = (int )(Math.random() * 120000 + 10);
    }

     // set name of object
     public void setName (String name_arg){
         name = name_arg;
         setProfessor();
     }
    public int number_in_power(int number_int ){
         return number_int * number_int;
    }
    //set name for professor in negative case , return null
    private String setProfessor(){
         professor = name;
         if (professor == null){
             return  null;
         }
         else{
             return  professor;
         }
    }


    public  void  GreetUserInConsole(){
         System.out.println("Math Package");
    }
    public MathPackage(){
        SetPersonalCode();
    }

    //get personale code
    public int GetPersonalCode(){
        return personalCode;

    }

    public void ValidatePersonalCode(MathPackage ObjectSpace){
        boolean validation = true;

        for(MathPackage object : packages){

            if(ObjectSpace.GetPersonalCode() == object.GetPersonalCode()){
                validation = false;
                ObjectSpace.SetPersonalCode();
                ObjectSpace.ValidatePersonalCode(ObjectSpace);
            }
            validation = true;
            // in case validation passed successfully
            packages.add(ObjectSpace);
        }
        System.out.println("Validation is over");

    }

    public void  ShowListOfObjects(){
        for(Object person : packages){

            System.out.println(person);
        }
    }

    public void AddInList(MathPackage object){
        packages.add(object);
        if(packages.contains(object)){

            System.out.println("ArrayList contains object");
        }
    }
}
