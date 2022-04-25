package cyoa.view;

import javax.swing.JPanel;
import javax.swing.*;

import cyoa.controller.Controller;

public class MainPanel extends JPanel
{
	private Controller app;
	private ImageIcon image;
	private JLabel infoLabel;
	private JButton farmerButton;
	private JButton questButton;
	private JButton spaceButton;
	private JButton storeButton;
	
	public MainPanel(Controller app)
	{
		super();
		this.app = app;
		this.image = new ImageIcon();
		this.infoLabel = new JLabel("What type of adventure would you like to have?:");
		
		this.farmerButton = new JButton("Young Farmer");
		this.questButton = new JButton("Magic Quest");
		this.spaceButton = new JButton("Space Adventure");
		this.storeButton = new JButton("View completed stories");
	}
}
