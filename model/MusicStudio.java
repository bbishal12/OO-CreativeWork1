package model;
import java.util.ArrayList;

public class MusicStudio {

	private int balance;
	private ArrayList<Music> musicHistory = new ArrayList<>();

	public MusicStudio() {

		balance =  0;
		
	}

	public void enter(Music m) {
		
		balance += m.getValue();
		musicHistory.add(m);

	}

	public int getBalance() {
		return balance;

	}

	public int getMusicOrderCount() {
		return musicHistory.size();
	}

	public ArrayList<Music> getMusicHistory() {
		return musicHistory;
	}

	@Override
	public String toString() {

		return "Balance =" + balance + ", Music Order count = " + musicHistory.size();
	}
	
}
