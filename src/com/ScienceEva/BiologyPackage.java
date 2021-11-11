package com.ScienceEva;

public class BiologyPackage extends MathPackage {

    @Override
    public  void  GreetUserInConsole(){

        System.out.println("Biology object");
    }

    public double CalculateSpecificAirWayResistance(double AirwayResistance , double V ){
        // V - is lung volume at which RAW was measured (m^3)
        double SRaw = AirwayResistance * V;
        return  SRaw ;
    }

}
