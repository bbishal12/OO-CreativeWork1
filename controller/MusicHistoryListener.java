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
			for(var coin: history) {
				m+= ++index + ". " + coin + "\n";

			}
			panel.getDisplay().setText(existingMessage+ "\nCoin Insert History\n" + m);

		} else {
			panel.getDisplay().setText(existingMessage+ "\n" + "No Coin Insert History\n");
		}
	}
		
	}
