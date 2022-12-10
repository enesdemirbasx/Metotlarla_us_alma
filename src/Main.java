import java.util.Scanner;
public class Main {
    static void us(int a,int b){
        int sonuc=1;
        for (int i=0;i<b;i++){
            sonuc=sonuc*a;
        }
        System.out.println(sonuc);
    }
    public static void main(String[] args) {
        us(10,0);
    }
}