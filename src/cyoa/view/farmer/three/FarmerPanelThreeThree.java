package cyoa.view.farmer.three;

import java.awt.*;

import javax.swing.*;
import cyoa.controller.Controller;
import cyoa.model.FarmerStory;

/**
 * This is the panel for the third possibility of the third situation the user will encounter
 * It has three options for continuing the story
 * @author awil7254
 *
 */
public class FarmerPanelThreeThree extends JPanel
{
	private JPanel panel;
	private Controller app;
	private JLabel label;
	private SpringLayout layout;
	private FarmerStory farmerInfo;
	private JButton dFiveButton;
	private JButton dSixButton;
	private JButton dSevenButton;
	
	/**
	 * Creates a new FarmerPanelThreeThree with the controller it will be contained in
	 * @param app The controller the panel will be contained in
	 */
	public FarmerPanelThreeThree(Controller app)
	{
		super();
		this.panel = new JPanel(new GridLayout(1,2));
		this.app = app;
		
		this.label = new JLabel("c3");
		this.layout = new SpringLayout();
		this.farmerInfo = new FarmerStory();
		
		this.dFiveButton = new JButton("go to d5");
		this.dSixButton = new JButton("go to d6");
		this.dSevenButton = new JButton("go to d7");
		
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
		
		panel.add(dFiveButton);
		panel.add(dSixButton);
		panel.add(dSevenButton);
	}
	
	/**
	 * sets up the action listeners for all the buttons
	 */
	private void setupListeners()
	{
		dFiveButton.addActionListener(click -> app.getFrame().changeScreen(farmerInfo.panels[farmerInfo.D_FIVE]));
		dSixButton.addActionListener(click -> app.getFrame().changeScreen(farmerInfo.panels[farmerInfo.D_SIX]));
		dSevenButton.addActionListener(click -> app.getFrame().changeScreen(farmerInfo.panels[farmerInfo.D_SEVEN]));
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
