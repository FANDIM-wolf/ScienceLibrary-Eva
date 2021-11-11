package com.ScienceEva;

public class EconomicsPackage {

    // calculate formula  index of consumer price
    public double index_of_consumer_price(double[] consumer_goods , double[] prices , double[] new_prices){
        double result = 0 ;
        if (consumer_goods.length == prices.length) {
                for (int  i = 0; i <= consumer_goods.length; i++){
                    result += (consumer_goods[i]*new_prices[i])/(consumer_goods[i]*prices[i]);
                }
                return result;
        }
        else{
            System.out.println("ScienceEva Error:Arrays must be equaled to each other");
        }

        return  result;
    }

}
