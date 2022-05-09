package cyoa.view.farmer.four;

import java.awt.*;

import javax.swing.*;
import cyoa.controller.Controller;
import cyoa.model.FarmerStory;

/**
 * This is the panel for the ninth possibility of the fourth situation the user will encounter
 * It has two options for continuing the story
 * @author awil7254
 *
 */
public class FarmerPanelFourNine extends JPanel
{
	private JPanel panel;
	private Controller app;
	private JLabel label;
	private SpringLayout layout;
	private FarmerStory farmerInfo;
	private JButton eSixButton;
	private JButton eSevenButton;
	
	/**
	 * Creates a new FarmerPanelFourNine with the controller it will be contained in
	 * @param app The controller the panel will be contained in
	 */
	public FarmerPanelFourNine(Controller app)
	{
		super();
		this.panel = new JPanel(new GridLayout(2,2));
		this.app = app;
		
		this.label = new JLabel("d9");
		this.layout = new SpringLayout();
		this.farmerInfo = new FarmerStory();
		
		this.eSixButton = new JButton("go to e6");
		this.eSevenButton = new JButton("go to e7");
		
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
		
		panel.add(eSixButton);
		panel.add(eSevenButton);
	}
	
	/**
	 * sets up the action listeners for all the buttons
	 */
	private void setupListeners()
	{
		eSixButton.addActionListener(click -> app.getFrame().changeScreen(farmerInfo.panels[farmerInfo.E_SIX]));
		eSevenButton.addActionListener(click -> app.getFrame().changeScreen(farmerInfo.panels[farmerInfo.E_SEVEN]));
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
