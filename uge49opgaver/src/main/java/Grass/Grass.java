package Grass;

/*Om sommeren vokser græsset ca. 0,8 cm om dagen.
Skriv en metode, der tager imod 2 inputparametre: hvor langt græsset er lige nu og
hvor højt det må være for at skulle slås.  Metoden skal beregne
og returnere hvor mange dage der er til, at græsset skal slås næste gang.
Hvor højt græsset er, når det skal slås, kan forstås på 2 måder.
1.	Græsset skal overstige denne værdi, før vi starter græsslåmaskinen

Du vælger selv hvilken løsning du vil implementere.

Benyt en Scanner til at få input fra brugeren, og udskriv resultatet på skærmen.
Alle tal, som bliver udskrevet, bør kun have 2 decimaler efter kommaet.

* */

import java.util.Scanner;

public class Grass {
    double growth = 0.8;
    double height;
    double maxLength = 7.0;

    Scanner sc = new Scanner(System.in);

    public double heightFromUser() {
        System.out.println("Indtast hvor højt græsset er");
        height = sc.nextInt();
        return height;
    }


    public void grassHitting(){

        if (height>=maxLength){
            System.out.println("Græsset skal slåes");
        }
        else{
            System.out.println("Græsset er ikke højt nok, der går " +
                    daysUntilGrassHitting() + " dage før græsset skal slåes.");

        }

    }
    public double daysUntilGrassHitting(){
       double daysUntilGrassHitting = maxLength-height/growth;
       return daysUntilGrassHitting;
       }
    }
