package com.company;

public class ControlFlow {
    public static void main(String[] args){
        //JAVA conditions and if Statements. if,else,else if,switch........
     /*
        if(condition){
            //block of code.
        }
       */
      /*  int x = 50;
        int y=  30;

        if(x<y){
            System.out.println("X is Less than Y");
        } else {
            System.out.println("X is Greater than Y");
        }
        */

        int time = 22;
        if (time < 10){
            System.out.println("GM");
        }else if (time>20)
            System.out.println("GD");
        else
            System.out.println("gE");

        //Simplify

    /*    int income = 400_000_000;
        boolean hasHighIncome = (income > 200_000_000);
        System.out.println(hasHighIncome);

        //Ternary Operator

        //variable = (condition)? expressionTRUE : expressionFALSE

       int var= 20;
        String result = (var < 18) ? "Goodmor.." : "Good eve";
        System.out.println(result);
*/
          //Switch Statement

     /*   switch (expression){
            case x:
                //codeblock
                break;
            case y:
                //codeblock
                break;
            default:
        }
        */

        int day = 2;
        switch (day){
            case 1:
                System.out.println("MONDAY");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("WEDNESDAY");
                break;
            default:
}

    }
}
