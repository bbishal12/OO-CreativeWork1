package controller;

import view.MusicStudioShop;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import model.Music;


public class MusicHistoryListener implements ActionListener {
	private MusicStudioShop panel;

	public MusicHistoryListener(MusicStudioShop panel) {

		this.panel = panel;
}

	@Override
	public void actionPerformed(ActionEvent e) {
		ArrayList<Music>history = panel.getMusicStudio().getMusicHistory();
		int index = 0;
		String existingMessage = panel.getDisplay().getText();
		String m = "";

		if(history.size() > 0) {
			for(var music: history) {
				m+= ++index + ". " + music + "\n";

			}
			panel.getDisplay().setText(existingMessage+ "\nMusic History\n" + m);

		} else {
			panel.getDisplay().setText(existingMessage+ "\n" + "No Music selected History\n");
		}
	}
		
	}
