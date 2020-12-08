package com.company;

import java.text.NumberFormat;

public class MathData {
    public static void main(String[] args){
       // int result =(int)Math.floor(1.1f);
        //System.out.println(result);
      //  int result = (int)Math.round(Math.random() *100);

       // System.out.println(result);

        //Number format

    /*    NumberFormat percent =  NumberFormat.getPercentInstance();
        String result = percent.format(837842348);
        System.out.println(result);  */

        String result = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(result);
    }
}
