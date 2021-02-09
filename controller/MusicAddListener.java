package controller;

import model.Music;
import view.MusicStudioShop;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MusicAddListener implements ActionListener {

	private MusicStudioShop	panel;

	public MusicAddListener(MusicStudioShop panel) {
		this.panel = panel;

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		

		String buttonLabel = "";
		for(var b: panel.getRadioButtons()) {
			if(b.isSelected()) {
				buttonLabel = b.getText();
				break;
			}
			}

			int value = 0;
			switch(buttonLabel) {

				case Music.A: value = 5; break;
				case Music.B: value = 10; break;
				case Music.C: value = 15; break;
				case Music.D: value = 20; break;
				case Music.E: value = 25; break;
			}

			var c = new Music(value);
			panel.getMusicStudio().enter(c);
			String m = panel.getDisplay().getText();
			panel.getDisplay().setText(m+ "\nInserted: " + c + " | " + panel.getMusicStudio());


	}
	
}
