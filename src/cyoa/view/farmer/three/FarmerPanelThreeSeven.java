package cyoa.view.farmer.three;

import java.awt.*;

import javax.swing.*;
import cyoa.controller.Controller;
import cyoa.model.FarmerStory;

/**
 * This is the panel for the seventh possibility of the third situation the user will encounter
 * It has three options for continuing the story
 * @author awil7254
 *
 */
public class FarmerPanelThreeSeven extends JPanel
{
	private JPanel panel;
	private Controller app;
	private JLabel label;
	private SpringLayout layout;
	private FarmerStory farmerInfo;
	private JButton dThreeButton;
	private JButton dThirteenButton;
	private JButton dFifteenButton;
	
	/**
	 * Creates a new FarmerPanelThreeSeven with the controller it will be contained in
	 * @param app The controller the panel will be contained in
	 */
	public FarmerPanelThreeSeven(Controller app)
	{
		super();
		this.panel = new JPanel(new GridLayout(1,2));
		this.app = app;
		
		this.label = new JLabel("c7");
		this.layout = new SpringLayout();
		this.farmerInfo = new FarmerStory();
		
		this.dThreeButton = new JButton("go to d3");
		this.dThirteenButton = new JButton("go to d13");
		this.dFifteenButton = new JButton("go to d15");
		
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
		
		panel.add(dThreeButton);
		panel.add(dThirteenButton);
		panel.add(dFifteenButton);
	}
	
	/**
	 * sets up the action listeners for all the buttons
	 */
	private void setupListeners()
	{
		dThreeButton.addActionListener(click -> app.getFrame().changeScreen(farmerInfo.panels[farmerInfo.D_THREE]));
		dThirteenButton.addActionListener(click -> app.getFrame().changeScreen(farmerInfo.panels[farmerInfo.D_THIRTEEN]));
		dFifteenButton.addActionListener(clikc -> app.getFrame().changeScreen(farmerInfo.panels[farmerInfo.D_FIFTEEN]));
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
