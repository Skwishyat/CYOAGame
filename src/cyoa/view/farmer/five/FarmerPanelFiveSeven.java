package cyoa.view.farmer.five;

import java.awt.*;

import javax.swing.*;
import cyoa.controller.Controller;
import cyoa.model.FarmerStory;

/**
 * This is the panel for the seventh possibility of the fifth situation the user will encounter
 * It has one option for continuing the story
 * @author awil7254
 *
 */
public class FarmerPanelFiveSeven extends JPanel
{
	private JPanel panel;
	private Controller app;
	private JLabel label;
	private SpringLayout layout;
	private FarmerStory farmerInfo;
	private JButton fThreeButton;
	
	/**
	 * Creates a new beginning farmer panel with the controller it will be contained in
	 * @param app The controller that the panel will be contained in
	 */
	public FarmerPanelFiveSeven(Controller app)
	{
		super();
		this.panel = new JPanel(new GridLayout(1,1));
		this.app = app;
		
		this.label = new JLabel("e7");
		this.layout = new SpringLayout();
		this.farmerInfo = new FarmerStory();
		
		this.fThreeButton = new JButton("go to third ending");
		
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
		
		panel.add(fThreeButton);
	}
	
	/**
	 * sets up the action listeners for all the buttons
	 */
	private void setupListeners()
	{
		fThreeButton.addActionListener(click -> app.getFrame().changeScreen(farmerInfo.panels[farmerInfo.F_THREE]));
	}
	
	/**
	 * sets up the layout of where things are on the screen
	 */
	private void setupLayout()
	{
		layout.putConstraint(SpringLayout.EAST, label, -384, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.NORTH, panel, 80, SpringLayout.SOUTH, label);
		layout.putConstraint(SpringLayout.WEST, panel, -498, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.SOUTH, panel, -412, SpringLayout.SOUTH, this);
		layout.putConstraint(SpringLayout.EAST, panel, -285, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.SOUTH, label, -618, SpringLayout.SOUTH, this);
	}
}
