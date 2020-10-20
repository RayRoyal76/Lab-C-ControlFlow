package com.Rayvon.Day2;

import java.util.Objects;

public class ControlFlow {

    public Object o;

    public static String myMethod(int input) {


      //  int x = 3;

        if(input == 2){
            return "true";
        }else if (input == 3){
            return "MyNumber";
        }
        else{
            return "false";
        }

    }

    public String switchMethod(int input) {
        switch(input){
            case 1: return "The One!";
            case 2: return "#2";
            case 3:
                System.out.println("BREAK!!");
                break;
            case 4:
                return "that's four";
            default:
                return  "default idk";
        }

        return "other default idk lol";
    }

//    {
//
//        System.out.println("Hello World");
//
//
//    }

    public String forMethod(){

        int[]ints = {1,2,3,4};

        for(int i = 0; i < 5; i++){
            System.out.println("I am a for loop!");
        }
       // "el :" means for each element
        outer:
        for(int el : ints){
      inner:
        for(int element : ints){
            System.out.println(el);
            if (el == 3){
                break outer;

                // skip over line under continue
               // continue;
            }
            System.out.println("I am in the continue");
        }
            System.out.println("I am outside!");

    }
        return "nothing";
}
    public static void main(String[] args){
    int x = 4;
    while(x == 4){
        System.out.println("HELP!");
        x++;
    }
    do{
        System.out.println("am I stuck?");

    }while(false);

    }
}


