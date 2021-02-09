package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

//import controller.MusicAddListener;
import model.MusicStudio;

public class ViewCart {
	private MusicStudio musicStudio;


	public ViewCart(JFrame window, MusicStudio musicStudio) {

		this.musicStudio = musicStudio;
	}

	public void init() {

		JPanel panel = new JPanel();

		JFrame frame = new JFrame();
		frame.setSize(400,500);
		frame.setTitle("View Cart");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(panel);

		JLabel totalLabel = new JLabel("Total: $" + musicStudio.getBalance());
		totalLabel.setBounds(10,50,70,30);
		panel.add(totalLabel);

		panel.setLayout(null);
		JLabel userLabel = new JLabel("Name:");
		userLabel.setBounds(10,110, 90,30);
		panel.add(userLabel);

		JTextField userText = new JTextField(20);
		userText.setBounds(100,100,170,20);
		panel.add(userText);

		JLabel addressLabel = new JLabel("Address:");
		addressLabel.setBounds(10,210, 90, 25);
		panel.add(addressLabel);

		JTextField addressText = new JTextField(25);
		addressText.setBounds(100,200,175,25);
		panel.add(addressText);

		JButton buyButton = new JButton("Buy");
		buyButton.setBounds(10,360,85,30);
		//buyButton.addActionListener(new MusicAddListener(this));
		panel.add(buyButton);
		buyButton.addActionListener(e -> {
		JOptionPane.showMessageDialog(frame,
		"Items Purchased", "Thank you", 
		JOptionPane.PLAIN_MESSAGE);
		});

		JButton exitButton = new JButton("Exit");
		exitButton.setBounds(10,400,80,25);
		panel.add(exitButton);

		exitButton.addActionListener(e -> {
			frame.dispose();
		});
		frame.setVisible(true);
	}
}
