
import java.util.*;

public class main_Poles {
	public static void main(String[] args) {
		dado d=new dado();
        contogiocatore G1=new contogiocatore();
        contocasinò C1=new contocasinò();
        System.out.println("Benvenuti al casinò!!");
        String risposta="si";
        Scanner in = new Scanner(System.in);
        Scanner in1 = new Scanner(System.in);
        while (risposta.equals("si")) {
            System.out.println("Inserisci un numero: ");
            int numero = in.nextInt();
            if(numero>0 && numero<7){
                System.out.println("Inserisci importo giocata: ");
                int giocata = in1.nextInt();
                double ContoGiocatore = G1.getContoGiocatore();
                double ContoCasinò = C1.getContoCasinò();
                double ContoCasinò1 = ContoCasinò/5;
                if (giocata <= ContoGiocatore && giocata <= ContoCasinò1) {
                    System.out.println("Lancio il dado...");
                    int lancio = d.lancia();
                    System.out.print("Il risulatato del dado è: "+lancio);
                    if (lancio==numero){
                        System.out.println("Complimenti hai vinto");
                        G1.vincita(giocata);
                        C1.perdita(giocata);
                    }
                    else{
                        System.out.println("\nPeccato, hai perso");
                        G1.perdita(giocata);
                        C1.vincita(giocata);
                    }
                }
                else{
                    System.out.println("Non puoi puntare quella somma");
                }
                double newImporto = G1.getContoGiocatore();
                System.out.print("Il tuo conto è pari a :  ");
                System.out.println(G1.getContoGiocatore());
                if (newImporto>0) {
                    System.out.println("Vuoi continuare a scommettere?");
                    risposta = in.next();
                }
                else{
                    System.out.println("Conto esaurito!");
                    System.out.println(G1.getContoGiocatore());
                    risposta="no";
                }
            }
        }
	}
}
