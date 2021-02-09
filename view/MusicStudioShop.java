package view;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import model.MusicStudio;
import model.Music;
import controller.MusicAddListener;
//import controller.MusicHistroyListener;
//import controller.PBStatListener;
import controller.MusicHistoryListener;

public class MusicStudioShop {
	private JFrame window;
	private JTextArea display = new JTextArea();
	private JRadioButton[] radioButtons;
	private MusicStudio musicStudio = new MusicStudio();

	public MusicStudioShop(JFrame window) {
		this.window = window;
		window.setTitle("Music Studio Shopping");
	}

	public void init() {
		Container cp = window.getContentPane();

		var scrollPane = new JScrollPane(display, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setPreferredSize(new Dimension(500, 500));

		cp.add(BorderLayout.CENTER, scrollPane);

		JPanel southPanel = new JPanel();
		southPanel.setLayout(new GridLayout(2,1));
		cp.add(BorderLayout.SOUTH, southPanel);

		radioButtons = new JRadioButton[5];
		radioButtons[0] = new JRadioButton(Music.A);
		radioButtons[0].setSelected(true);
		radioButtons[1] = new JRadioButton(Music.B);
		radioButtons[2] = new JRadioButton(Music.C);
		radioButtons[3] = new JRadioButton(Music.D);
		radioButtons[4] = new JRadioButton(Music.E);

		JPanel radioPanel = new JPanel();
		ButtonGroup radioGroup = new ButtonGroup();
		for(var b: radioButtons) {
			radioPanel.add(b);
			radioGroup.add(b);
		}

		southPanel.add(radioPanel);

		var addButton = new JButton("Add");
		addButton.addActionListener(new MusicAddListener(this));
		var historyButton = new JButton("History");
		historyButton.addActionListener(new MusicHistoryListener(this));
		/*var statsButton = new JButton("Stats");
		statsButton.addActionListener(new PBStatListener(this));*/
		var exitButton = new JButton("Exit");
		var viewButton = new JButton("View Cart");

		JPanel buttonPanel = new JPanel();
		southPanel.add(buttonPanel);

		buttonPanel.add(addButton);
		buttonPanel.add(historyButton);
		buttonPanel.add(viewButton);
		//buttonPanel.add(statsButton);*/
		buttonPanel.add(exitButton);

		exitButton.addActionListener(e ->  {
			window.getContentPane().removeAll();
			var menu = new MainMenu(window);
			menu.init();
			window.pack();
			window.revalidate();
		});

		
	}

	public MusicStudio getMusicStudio() {
		return musicStudio;
	}

	public JTextArea getDisplay() {
		return display;
	}

	public JRadioButton[] getRadioButtons(){
		return radioButtons;
	}
}
