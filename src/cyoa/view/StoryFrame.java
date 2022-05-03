package cyoa.view;

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import cyoa.controller.Controller;
import cyoa.view.farmer.one.*;
import cyoa.view.farmer.two.*;
import cyoa.view.farmer.three.*;
import cyoa.view.farmer.four.*;
import cyoa.view.farmer.five.*;
import cyoa.view.farmer.six.*;

/**
 * This is the frame that will hold all of the information needed
 * It has all of the panels from all stories storedto be used in the cardPanel
 * @author awil7254
 *
 */
public class StoryFrame extends JFrame
{
	private Controller app;
	private MainPanel panel;
	private JPanel cardPanel;
	private FarmerPanelBeginning farmerBeginning;
	
	private FarmerPanelTwoOne bOne;
	private FarmerPanelTwoTwo bTwo;
	private FarmerPanelTwoThree bThree;
	
	private FarmerPanelThreeOne cOne;
	private FarmerPanelThreeTwo cTwo;
	private FarmerPanelThreeThree cThree;
	private FarmerPanelThreeFour cFour;
	private FarmerPanelThreeFive cFive;
	private FarmerPanelThreeSix cSix;
	private FarmerPanelThreeSeven cSeven;
	
	/**
	 * Creates a new story frame with the controller it will be contained in 
	 * @param app the controller that the frame will be contained in
	 */
	public StoryFrame(Controller app)
	{
		super();
		this.app = app;
		this.panel = new MainPanel(this.app);
		this.cardPanel = new JPanel(new CardLayout());
		this.farmerBeginning = new FarmerPanelBeginning(this.app);
		
		this.bOne = new FarmerPanelTwoOne(this.app);
		this.bTwo = new FarmerPanelTwoTwo(this.app);
		this.bThree = new FarmerPanelTwoThree(this.app);
		
		setupFrame();
	}
	
	/**
	 * sets up the frame adding the things needed to the cardPanel and what specifications the application will need
	 */
	private void setupFrame()
	{
		cardPanel.add(panel, "main");
		cardPanel.add(farmerBeginning, "FBeginning");
		cardPanel.add(bOne, "FBOne");
		cardPanel.add(bTwo, "FBTwo");
		cardPanel.add(bThree, "FBThree");
		
		this.setContentPane(cardPanel);
		this.setTitle("Choose your own adventure!");
		this.setSize(1500, 900);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	/**
	 * Changes which panel is being displayed to be used when the corresponding buttons are clicked
	 * @param screen the screen code for the panel to change to
	 */
	public void changeScreen(String screen)
	{
		((CardLayout) cardPanel.getLayout()).show(cardPanel, screen);
	}
}
