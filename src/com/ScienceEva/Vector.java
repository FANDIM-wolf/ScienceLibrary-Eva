package com.ScienceEva;


import static java.lang.Math.sqrt;

public class Vector {
    public double x ;
    public double y ;
    public double z ;
    public double lenght_of_vector;
    public double magnitude;

    public double CalculateVector(double x1 , double y1 , double x2 , double y2){
        double x = x2 - x1 ;
        double y = y2 - y1 ;
        double x_result = x * x ;
        double y_result = y * y ;
        double result = x_result + y_result;
        double lenght_of_vector = sqrt(result);
        return lenght_of_vector; // completed and calculated vector

    }

    public double MagnitudeOfVector(Vector A ){
        A.magnitude = sqrt((A.x*A.x)+(A.y*A.y)+(A.z*A.z));
        return magnitude;
    }

    public void GetDistanceOfVectorInTime(float x1 , float y1 , Vector A){
        A.x = A.x + x1;
        A.y = A.y + y1;
    }

    //calculate length of two Vectors
    public double ScalarOfTwoVectors(Vector A, Vector B){
        double Scalar_lenght = ((A.x * B.x) + (A.y * B.y) + (A.z *B.z)) ;

        return Scalar_lenght;
    }


}
