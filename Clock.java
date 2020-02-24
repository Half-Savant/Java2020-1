//import java.util.ArrayList;
//import java.util.Collections;

public class Clock {
//    private static void zegar(int a, int b){
//        int zegarek = 0;
//        for(int i = 0; i < 24; i++){
//            for(int j = 0; j < 60; j++) {
//                zegarek++;
//            }
//        }
//        System.out.println(zegarek);
//    }
//źle zrozumiałem zadanie dlatego zakomentowane
    public static void main(String[] args){
        int a = 2;
        int b = 3;
        int c = 5;
        int d = 9;
        zegar(a, b, c, d);
    }

    private static void zegar(int i, int j, int k, int l){
        if(i <= 2){
            if(i == 2){
                if(j <= 3){
                    if(k <= 5){
                        if(l <= 9){
                            //ArrayList<Integer> time = new ArrayList<>();
                            //time.add(i);
                            //time.add(j);
                            //time.add(k);
                            //time.add(l);
                            String overclock = String.valueOf(i) + String.valueOf(j) + ":" + String.valueOf(k) + String.valueOf(l);
                            System.out.println(overclock);
                            //Colletions.sort(time, Collections.reverseOrder());
                        }
                        else {
                            System.out.println("Podany czas nie jest poprawny ze standardami ziemskimi!");
                        }
                    }
                    else {
                        System.out.println("Podany czas nie jest poprawny ze standardami ziemskimi!");
                    }
                }
                else {
                    System.out.println("Podany czas nie jest poprawny ze standardami ziemskimi!");
                }
            }
            else{
                if(j <= 9){
                    if(k <= 5){
                        if(l <= 9){
                            //ArrayList<Integer> time = new ArrayList<>();
                            //time.add(i);
                            //time.add(j);
                            //time.add(k);
                            //time.add(l);
                            String overclock = String.valueOf(i) + String.valueOf(j) + ":" + String.valueOf(k) + String.valueOf(l);
                            System.out.println(overclock);
                            //Colletions.sort(time, Collections.reverseOrder());
                        }
                        else {
                            System.out.println("Podany czas nie jest poprawny ze standardami ziemskimi!");
                        }
                    }
                    else {
                        System.out.println("Podany czas nie jest poprawny ze standardami ziemskimi!");
                    }
                }
                else {
                    System.out.println("Podany czas nie jest poprawny ze standardami ziemskimi!");
                }
            }
        }
        else {
            System.out.println("Podany czas nie jest poprawny ze standardami ziemskimi!");
        }
    }
}
