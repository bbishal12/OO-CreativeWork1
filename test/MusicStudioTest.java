package test;

import model.Music;
import model.MusicStudio;

public class MusicStudioTest {

	public static void main(String[] args) {
		Music c1 = new Music(5);
		assert c1.getValue() == 5;

		Music c2 = new Music(10);
		assert c2.getValue() == 10;

		MusicStudio p1 = new MusicStudio();
		assert p1.getBalance() == 0;
		assert p1.getMusicOrderCount() == 0;

		p1.enter(new Music(15));
		assert p1.getBalance() == 15;
		assert p1.getMusicOrderCount() == 1;

		p1.enter(c1);
		assert p1.getBalance() == 30;
		assert p1.getMusicOrderCount() == 2;
	}
	
}
