package Menuvalg;

/*
    * Menuvalg
Skriv en metode, som præsenterer brugeren for følgende menu på skærmen:
1.	Beregn
2.	Udskriv
3.	Hjælp

Metoden skal:
•	udskrive menuen på skærmen
•	læse brugerens valg (fra tastaturet)
•	returnere menuvalget som et heltal
•	Inddrag fejlhåndtering i din løsning (hvordan vil du håndtere et forkert menuvalg)
*/
public class Menu {
    public static void main (String [] args){
    Controller controller = new Controller();
    controller.runProgram();
    }

}
