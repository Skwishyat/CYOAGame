package cyoa.view.farmer.two;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.*;
import cyoa.controller.Controller;
import cyoa.model.FarmerStory;


/**
 * This is the panel for the third possibility of the second situation the user will encounter
 * It has two options for continuing the story
 * @author awil7254
 *
 */
public class FarmerPanelTwoThree extends JPanel
{
	private JPanel panel;
	private Controller app;
	
	private SpringLayout layout;
	private JLabel label;
	
	private FarmerStory farmerInfo;
	
	private JButton cSixButton;
	private JButton cSevenButton;
	
	
	/**
	 * Creates a new FarmerPanelTwoThree with the controller it will be contained in
	 * @param app The controller the panel will be contained in
	 */
	public FarmerPanelTwoThree(Controller app)
	{
		super();
		this.panel = new JPanel(new GridLayout(1,2));
		this.app = app;
		
		this.layout = new SpringLayout();
		this.label = new JLabel("B3");
		
		this.farmerInfo = new FarmerStory();
		
		this.cSixButton = new JButton("go to c6");
		this.cSevenButton = new JButton("go to c7");
		
		
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
		
		panel.add(cSixButton);
		panel.add(cSevenButton);
	}
	
	/**
	 * sets up the action listeners for all the buttons
	 */
	private void setupListeners()
	{
		cSixButton.addActionListener(click -> app.getFrame().changeScreen(farmerInfo.panels[farmerInfo.C_SIX]));
		cSevenButton.addActionListener(click -> app.getFrame().changeScreen(farmerInfo.panels[farmerInfo.C_SEVEN]));
	}
	
	/**
	 * sets up the layout of where things are on the screen
	 */
	private void setupLayout()
	{
		layout.putConstraint(SpringLayout.NORTH, panel, 265, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.SOUTH, panel, -279, SpringLayout.SOUTH, this);
		layout.putConstraint(SpringLayout.WEST, panel, -583, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.EAST, panel, -203, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.SOUTH, label, -83, SpringLayout.NORTH, panel);
		layout.putConstraint(SpringLayout.EAST, label, -384, SpringLayout.EAST, this);
	}
}
