import java.util.ArrayList;
import java.util.Collections;
//Program tworzy z 4 dostępnych cyfr najpóźniejszą możliwą godzinę.
public class Clock {
    public static void main(String[] args){
        int a = 2;
        int b = 3;
        int c = 5;
        int d = 9;
        zegar(a, b, c, d);
    }
    private static void maks(int i, int j, int k, int l){
        if(i >= j){
            if(i >= k){
                if(i >= l){
                    int biggest = i;
                }
                else{
                    int biggest = l;
                }
            }
            else if(k >= l){
                int biggest = k;
            }
            else {
                int biggest = l;
            }
        }
        else if(j >= k){
            if(j >= l){
                int biggest = j;
            }
            else {
                int biggest = l;
            }
        } else if(k >= l){
            int biggest = k;
        } else {
            int biggest = l;
        }
        if(i == 2){
            int first = i;
        } else if(j == 2){
            int first = j;
        } else if(k == 2){
            int first = k;
        } else if(l == 2){
            int first = l;
        } else if(i == 1){
            int first = i;
        } else if(j == 1){
            int first = j;
        } else if(k == 1){
            int first = k;
        } else if(l == 1){
            int first = l;
        } else {
            System.out.println("Podany czas nie jest poprawny ze standardami ziemskimi!");
        }
    }
    private static void zegar(int i, int j, int k, int l){
        if(i <= 2){
            if(i == 2){
                if(j <= 3){
                    if(k <= 5){
                        if(l <= 9){
                            ArrayList<Integer> time = new ArrayList<>();
                            time.add(i);
                            time.add(j);
                            time.add(k);
                            time.add(l);
                            String overclock = String.valueOf(i) + String.valueOf(j) + ":" + String.valueOf(k) + String.valueOf(l);
                            System.out.println(overclock);
                            Collections.sort(time, Collections.reverseOrder());
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
                            ArrayList<Integer> time = new ArrayList<>();
                            time.add(i);
                            time.add(j);
                            time.add(k);
                            time.add(l);
                            String overclock = String.valueOf(i) + String.valueOf(j) + ":" + String.valueOf(k) + String.valueOf(l);
                            System.out.println(overclock);
                            Collections.sort(time, Collections.reverseOrder());
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
