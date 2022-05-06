package cyoa.view;

import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;

import cyoa.controller.Controller;
import cyoa.model.FarmerStory;

/**
 * This is the panel for the main screen of the application
 * It has options to start one of three stories or look at previous runs of stories
 * @author awil7254
 *
 */
public class MainPanel extends JPanel
{
	private Controller app;
	private JPanel panel;
	private JLabel label;
	private SpringLayout layout;
	private FarmerStory farmerInfo;
	
	private JButton farmerButton;
	private JButton questButton;
	private JButton spaceButton;
	private JButton pastStoriesButton;
	
	/**
	 * Creates a new main panel with which controller it will be contained in
	 * @param app the controller that the panel will be contained in 
	 */
	public MainPanel(Controller app)
	{
		super();
		this.app = app;
		this.panel = new JPanel(new GridLayout(2, 2));
		this.label = new JLabel("What type of adventure would you like to have?");
		this.layout = new SpringLayout();
		this.farmerInfo = new FarmerStory();
				
		this.farmerButton = new JButton("Young Farmer");
		this.questButton = new JButton("Magic Quest");
		this.spaceButton = new JButton("Space Adventure");
		this.pastStoriesButton = new JButton("View completed stories");
		
		setupPanel();
		setupListeners();
		setupLayout();
	}
	
	/**
	 * sets up the panel, adding all the components to be displayed
	 */
	private void setupPanel()
	{
		this.setLayout(layout);
		this.setPreferredSize(new Dimension(800,800));
		
		this.add(panel);
		this.add(label);
		
		panel.add(farmerButton);
		panel.add(questButton);
		panel.add(spaceButton);
		panel.add(pastStoriesButton);
	}
	
	/**
	 * sets up the action listeners for all the buttons
	 */
	private void setupListeners()
	{
		farmerButton.addActionListener(click -> app.getFrame().changeScreen(farmerInfo.panels[farmerInfo.A_ONE]));
		pastStoriesButton.addActionListener(click -> app.getFrame().changeScreen("Past Stories"));
	}
	
	/**
	 * sets up the layout of where things are on the screen
	 */
	private void setupLayout()
	{
		layout.putConstraint(SpringLayout.SOUTH, label, -85, SpringLayout.NORTH, panel);
		layout.putConstraint(SpringLayout.EAST, label, -246, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.NORTH, panel, 265, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.SOUTH, panel, -279, SpringLayout.SOUTH, this);
		layout.putConstraint(SpringLayout.WEST, panel, -583, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.EAST, panel, -203, SpringLayout.EAST, this);
		
	}
}









