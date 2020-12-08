package com.oopecom;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;


public class Filter implements Ifilter {

    List<Laptop> laptop = List.of(
            new Laptop("Gaming Laptop", "ALIENWARE", 90000, 5),
            new Laptop("WORK Laptop", "LENOVO", 75000, 4),
            new Laptop("HOME Laptop", "HP", 40000, 2),
            new Laptop("ENTERTAINMENT Laptop", "ASUS", 35000, 3),
            new Laptop("ENTERPRISE Laptop", "APPLE", 100000, 4)
    );

     public void displayCart(){

         laptop.forEach(m-> System.out.println(m.getTitle()+ " - "+m.getBrand()+" - "+m.getPrice()+" - "+m.getRating()));
         System.out.println("------------------------------------------");
     }


      public void separateOnRating() {

             Predicate<Laptop> isPopular = m -> m.getRating() > 3;
          System.out.println("Filtered by Rating \n");
            laptop.stream()
                    .filter(isPopular)
                    .forEach(m -> System.out.println(m.getTitle() + " - Rating " + m.getRating()));
          System.out.println("------------------------------------------");

    }
    public void separateOnPrice(){
        System.out.println("Filtered by Price Ascending \n");
          laptop.stream()
                  .sorted(Comparator.comparing(m->m.getPrice()))
                  .forEach(m-> System.out.println(m.getPrice() + "- -" + m.getBrand()));
        System.out.println("---------------------------------------------");
    }

    public void separateOnPriceDecend(){
        System.out.println("Filtered by Price Descending \n");
        laptop.stream()
                .sorted(Comparator.comparing(Laptop::getPrice).reversed())
                .forEach(m-> System.out.println(m.getPrice() + "- -" + m.getBrand()));

    }


}
