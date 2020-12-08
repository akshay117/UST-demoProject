package com.Interface;
import java.util.HashMap;
public class HashMAP {
    public static void main(String[] args){
        //HashMAP:

     /*   HashMap<String,String> techList = new HashMap<String, String>();

        techList.put("1","Ai");
        techList.put("2","ar");
        techList.put("3","ml");
        techList.put("4","java");

        System.out.println(techList.get("1"));
        System.out.println(techList.size());

        for(String tech: techList.keySet()){
            System.out.println("Key is" + tech + "VALUE:"+ techList.get(tech));
        }
*/

        HashMap<String,Integer> products = new HashMap<String, Integer>();
        products.put("MOBILE",15000);
        products.put("LAPTOP",45000);
        products.put("CPU",1533000);
        products.put("MONITOR",135000);
        products.put("MOUSE",135000);

        for(String product: products.keySet()){
            System.out.println("KEY "+product+ " value " +products.get(product));
        }
    }
}
