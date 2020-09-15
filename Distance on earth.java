package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Your coordinates -->");
        System.out.print("Latitude (-90 до 90) = ");
        Scanner sc = new Scanner(System.in);
        float re = sc.nextFloat();
        System.out.print("longitude (-180 до 180) = ");
        Scanner d = new Scanner(System.in);
        float deg = d.nextFloat();



        System.out.println("Coordinates to the point -->");
        System.out.print("Latitude(-90 до 90) = ");
        Scanner sc2 = new Scanner(System.in);
        float re2 = sc2.nextFloat();
        System.out.print("longitude (-180 до 180) = ");
        Scanner d2 = new Scanner(System.in);
        float deg2 = d2.nextFloat();


int e =6371;

double ree = re*Math.PI/180;
        double ree2 = re2*Math.PI/180;
        double deeg2 = deg*Math.PI/180;
        double deeg = deg2*Math.PI/180;


        double di =Math.sin(ree)*Math.sin(ree2)+Math.cos(ree)*Math.cos(ree2)*Math.cos(deeg-deeg2);
        double di2= Math.acos(di);
        double dist = di2*e;
        String result = String.format("%.2f", dist);
        System.out.println("Distanceto the point --> "+ result +"Км");

    }
}
