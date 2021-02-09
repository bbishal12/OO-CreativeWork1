package view;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class MainMenu {
	private JFrame window;
	
	public MainMenu(JFrame window) {
		this.window = window;
		window.setTitle("Main Menu");
}

public void init() {
	Container cp = window.getContentPane();
	JPanel panel = new JPanel();
	panel.setPreferredSize(new Dimension(400,200));
	panel.setLayout(new GridLayout(1, 1));

	JButton musicStudioButton = new JButton("Music Studio Shopping");
	

	panel.add(musicStudioButton);
	
	cp.add(BorderLayout.CENTER,panel);

	// lamda function (e) is used to print the whichever button we pressed.
	musicStudioButton.addActionListener(e -> {
		window.getContentPane().removeAll();
		var musicstudio = new MusicStudioShop(window);
		musicstudio.init();
		window.pack();
		window.revalidate();
	});
   }
}

	
		
	 

