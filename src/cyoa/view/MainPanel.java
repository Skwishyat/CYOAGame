package cyoa.view;

import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;

import cyoa.controller.Controller;

public class MainPanel extends JPanel
{
	private FarmerPanelBeginning farmerBeginning;
	private Controller app;
	private JPanel panel;
	private JLabel label;
	private JButton farmerButton;
	private JButton questButton;
	private JButton spaceButton;
	private JButton storeButton;
	
	public MainPanel(Controller app)
	{
		super();
		this.app = app;
		this.panel = new JPanel();
		this.label = new JLabel("What type of adventure would you like to have?:");
		
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
		this.setPreferredSize(new Dimension(1500,900));
		
		this.add(panel);
		panel.add(label);
		panel.add(farmerButton);
		panel.add(questButton);
		panel.add(storeButton);
	}
	
	private void setupListeners()
	{
//		farmerButton.addActionListener(select -> StoryFrame.changePanel(farmerBeginning));
	}
	
	private void setupLayout()
	{
		
	}
}
