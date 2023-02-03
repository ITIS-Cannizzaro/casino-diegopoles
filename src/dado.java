
public class dado {
	int facce;
    public dado() {
        this.facce = 6;
    }
    public int lancia(){
        int randomNum = (int)(Math.random() * facce);
        return randomNum;
    }
}
