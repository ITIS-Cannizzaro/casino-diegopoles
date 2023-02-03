
public class contogiocatore {
	double ContoGiocatore;
    public contogiocatore() {
        ContoGiocatore = 1000;
    }
    public double getContoGiocatore() {
        return ContoGiocatore;
    }
    public void perdita(double giocata){
        double temp=ContoGiocatore;
        temp=temp-giocata;
        ContoGiocatore=temp;
    }
    public void vincita(double giocata){
        double temp=ContoGiocatore;
        temp=temp+(giocata*5);
        ContoGiocatore=temp;
    }
}
