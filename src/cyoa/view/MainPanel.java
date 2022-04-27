package cyoa.view;

import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;

import cyoa.controller.Controller;

public class MainPanel extends JPanel
{
	private Controller app;
	private JPanel panel;
	private JLabel label;
	private SpringLayout layout;
	
	private JPanel cardPanel;
	
	private FarmerPanelBeginning farmerBeginning;
	
	private JButton farmerButton;
	private JButton questButton;
	private JButton spaceButton;
	private JButton storeButton;
	
	public MainPanel(Controller app)
	{
		super();
		this.app = app;
		this.panel = new JPanel(new GridLayout(2, 2));
		this.label = new JLabel("What type of adventure would you like to have?");
		this.layout = new SpringLayout();
		
		this.cardPanel = new JPanel(new CardLayout());
		
		this.farmerBeginning = new FarmerPanelBeginning(this.app);
		
		this.farmerButton = new JButton("Young Farmer");
		this.questButton = new JButton("Magic Quest");
		this.spaceButton = new JButton("Space Adventure");
		this.storeButton = new JButton("View completed stories");
		
		setupPanel();
		setupListeners();
		setupLayout();
	}
	
	private void setupPanel()
	{
		this.setLayout(layout);
		this.setPreferredSize(new Dimension(1500,900));
		
		this.add(panel);
		this.add(label);
		panel.add(farmerButton);
		panel.add(questButton);
		panel.add(spaceButton);
		panel.add(storeButton);
	}
	
	private void setupListeners()
	{
		farmerButton.addActionListener(click -> app.getFrame().changeScreen("FBeginning"));
	}
	
	private void setupLayout()
	{
		layout.putConstraint(SpringLayout.WEST, label, 554, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.SOUTH, label, -68, SpringLayout.NORTH, panel);
		layout.putConstraint(SpringLayout.NORTH, panel, 283, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.SOUTH, panel, -143, SpringLayout.SOUTH, this);
		layout.putConstraint(SpringLayout.WEST, panel, 405, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.EAST, panel, 1004, SpringLayout.WEST, this);
	}
	
	private void changeScreen(String screen)
	{
		
	}
}









