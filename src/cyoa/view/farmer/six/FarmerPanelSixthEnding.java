package cyoa.view.farmer.six;

import java.awt.*;

import javax.swing.*;
import cyoa.controller.Controller;

/**
 * This is the panel for the sixth possible ending
 * It is a bad semi-common ending
 * @author awil7254
 *
 */
public class FarmerPanelSixthEnding extends JPanel
{
	private JPanel panel;
	private Controller app;
	private JLabel label;
	private SpringLayout layout;
	private JButton mainButton;
	
	/**
	 * Creates a new FarmerPanelSixthEnding with the controller it will be contained in
	 * @param app The controller that the panel will be contained in
	 */
	public FarmerPanelSixthEnding(Controller app)
	{
		super();
		this.panel = new JPanel(new GridLayout(1,1));
		this.app = app;
		
		this.label = new JLabel("sixth ending");
		this.layout = new SpringLayout();
		
		this.mainButton = new JButton("Return to main screen");
		
		
		
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
		
		panel.add(mainButton);
	}
	
	/**
	 * sets up the action listeners for all the buttons
	 */
	private void setupListeners()
	{
		mainButton.addActionListener(click -> doMethods());
	}
	
	private void doMethods()
	{
		app.addGraph("Farmer Story:");
		app.getFrame().changeScreen("main");
	}
	
	/**
	 * sets up the layout of where things are on the screen
	 */
	private void setupLayout()
	{
		layout.putConstraint(SpringLayout.WEST, panel, -498, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.EAST, panel, -285, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.SOUTH, label, -78, SpringLayout.NORTH, panel);
		layout.putConstraint(SpringLayout.EAST, label, -244, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.NORTH, panel, 262, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.SOUTH, panel, -412, SpringLayout.SOUTH, this);
	}
}
