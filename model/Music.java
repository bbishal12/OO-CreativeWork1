package model;

public class Music {
	private int value;
	public static final String A = "One by Metallica";
	public static final String B = "Right Now by Akon";
	public static final String C = "By the way by RHCP";
	public static final String D = "Tik Tok by Kesha";
	public static final String E = "Sweet Child by Guns and Roses";

	public Music(int value) {
		this.value = value;

	}

	public int getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		String name ="N/A";
		switch(value) {
			case 5: name =  Music.A; break;
			case 10: name = Music.B; break;
			case 15: name = Music.C; break;
			case 20: name = Music.D; break;
			case 25: name = Music.E; break;
		}

		return name;
	}
}
