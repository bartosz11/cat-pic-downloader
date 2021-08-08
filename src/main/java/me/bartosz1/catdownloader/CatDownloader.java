package me.bartosz1.catdownloader;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CatDownloader {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many cat pictures you want to download? Choose between 1 and 2147483467.");
        int cats=0;
        try {
            cats = scanner.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Too big amount!");
            e.printStackTrace();
            System.exit(1);
        }
        if (cats < 1){
            System.out.println("Too small amount!");
            System.exit(1);
        }
        scanner.close();
        for (int i=0; i<cats; i++){
            new DownloadThread(i+1+".png").run();
        }
    }

}
