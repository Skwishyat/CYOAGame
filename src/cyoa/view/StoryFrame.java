package cyoa.view;

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import cyoa.controller.Controller;
import cyoa.model.*;

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
	
	private FarmerStory farmerInfo;
	private QuestStory questInfo;
	private SpaceStory spaceInfo;
	
	private PastStoriesPanel pastStories;
	
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
	
	private FarmerPanelFourOne dOne;
	private FarmerPanelFourTwo dTwo;
	private FarmerPanelFourThree dThree;
	private FarmerPanelFourFour dFour;
	private FarmerPanelFourFive dFive;
	private FarmerPanelFourSix dSix;
	private FarmerPanelFourSeven dSeven;
	private FarmerPanelFourEight dEight;
	private FarmerPanelFourNine dNine;
	private FarmerPanelFourTen dTen;
	private FarmerPanelFourEleven dEleven;
	private FarmerPanelFourTwelve dTwelve;
	private FarmerPanelFourThirteen dThirteen;
	private FarmerPanelFourFourteen dFourteen;
	private FarmerPanelFourFifteen dFifteen;
	
	private FarmerPanelFiveOne eOne;
	private FarmerPanelFiveTwo eTwo;
	private FarmerPanelFiveThree eThree;
	private FarmerPanelFiveFour eFour;
	private FarmerPanelFiveFive eFive;
	private FarmerPanelFiveSix eSix;
	private FarmerPanelFiveSeven eSeven;
	private FarmerPanelFiveEight eEight;
	private FarmerPanelFiveNine eNine;
	private FarmerPanelFiveTen eTen;
	private FarmerPanelFiveEleven eEleven;
	private FarmerPanelFiveTwelve eTwelve;
	private FarmerPanelFiveThirteen eThirteen;
	
	private FarmerPanelFirstEnding fOne;
	private FarmerPanelSecondEnding fTwo;
	private FarmerPanelThirdEnding fThree;
	private FarmerPanelFourthEnding fFour;
	private FarmerPanelFifthEnding fFive;
	private FarmerPanelSixthEnding fSix;
	
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
		
		this.farmerInfo = new FarmerStory();
		this.questInfo = new QuestStory();
		this.spaceInfo = new SpaceStory();
		
		this.pastStories = new PastStoriesPanel(this.app);

		this.farmerBeginning = new FarmerPanelBeginning(this.app);
		
		this.bOne = new FarmerPanelTwoOne(this.app);
		this.bTwo = new FarmerPanelTwoTwo(this.app);
		this.bThree = new FarmerPanelTwoThree(this.app);
		
		this.cOne = new FarmerPanelThreeOne(this.app);
		this.cTwo = new FarmerPanelThreeTwo(this.app);
		this.cThree = new FarmerPanelThreeThree(this.app);
		this.cFour = new FarmerPanelThreeFour(this.app);
		this.cFive = new FarmerPanelThreeFive(this.app);
		this.cSix = new FarmerPanelThreeSix(this.app);
		this.cSeven = new FarmerPanelThreeSeven(this.app);
		
		this.dOne = new FarmerPanelFourOne(this.app);
		this.dTwo = new FarmerPanelFourTwo(this.app);
		this.dThree = new FarmerPanelFourThree(this.app);
		this.dFour = new FarmerPanelFourFour(this.app);
		this.dFive = new FarmerPanelFourFive(this.app);
		this.dSix = new FarmerPanelFourSix(this.app);
		this.dSeven = new FarmerPanelFourSeven(this.app);
		this.dEight = new FarmerPanelFourEight(this.app);
		this.dNine = new FarmerPanelFourNine(this.app);
		this.dTen = new FarmerPanelFourTen(this.app);
		this.dEleven = new FarmerPanelFourEleven(this.app);
		this.dTwelve = new FarmerPanelFourTwelve(this.app);
		this.dThirteen = new FarmerPanelFourThirteen(this.app);
		this.dFourteen = new FarmerPanelFourFourteen(this.app);
		this.dFifteen = new FarmerPanelFourFifteen(this.app);
		
		this.eOne = new FarmerPanelFiveOne(this.app);
		this.eTwo = new FarmerPanelFiveTwo(this.app);
		this.eThree = new FarmerPanelFiveThree(this.app);
		this.eFour = new FarmerPanelFiveFour(this.app);
		this.eFive = new FarmerPanelFiveFive(this.app);
		this.eSix = new FarmerPanelFiveSix(this.app);
		this.eSeven = new FarmerPanelFiveSeven(this.app);
		this.eEight = new FarmerPanelFiveEight(this.app);
		this.eNine = new FarmerPanelFiveNine(this.app);
		this.eTen = new FarmerPanelFiveTen(this.app);
		this.eEleven = new FarmerPanelFiveEleven(this.app);
		this.eTwelve = new FarmerPanelFiveTwelve(this.app);
		this.eThirteen = new FarmerPanelFiveThirteen(this.app);
		
		this.fOne = new FarmerPanelFirstEnding(this.app);
		this.fTwo = new FarmerPanelSecondEnding(this.app);
		this.fThree = new FarmerPanelThirdEnding(this.app);
		this.fFour = new FarmerPanelFourthEnding(this.app);
		this.fFive = new FarmerPanelFifthEnding(this.app);
		this.fSix = new FarmerPanelSixthEnding(this.app);
		
		setupFrame();
	}
	
	/**
	 * sets up the frame adding the things needed to the cardPanel and what specifications the application will need
	 */
	private void setupFrame()
	{
		cardPanel.add(panel, "main");
		cardPanel.add(pastStories, "Past Stories");
		cardPanel.add(farmerBeginning, farmerInfo.panels[farmerInfo.A_ONE]);
		
		cardPanel.add(bOne, farmerInfo.panels[farmerInfo.B_ONE]);
		cardPanel.add(bTwo, farmerInfo.panels[farmerInfo.B_TWO]);
		cardPanel.add(bThree, farmerInfo.panels[farmerInfo.B_THREE]);
		
		cardPanel.add(cOne, farmerInfo.panels[farmerInfo.C_ONE]);
		cardPanel.add(cTwo, farmerInfo.panels[farmerInfo.C_TWO]);
		cardPanel.add(cThree, farmerInfo.panels[farmerInfo.C_THREE]);
		cardPanel.add(cFour, farmerInfo.panels[farmerInfo.C_FOUR]);
		cardPanel.add(cFive, farmerInfo.panels[farmerInfo.C_FIVE]);
		cardPanel.add(cSix, farmerInfo.panels[farmerInfo.C_SIX]);
		cardPanel.add(cSeven, farmerInfo.panels[farmerInfo.C_SEVEN]);
		
		cardPanel.add(dOne, farmerInfo.panels[farmerInfo.D_ONE]);
		cardPanel.add(dTwo, farmerInfo.panels[farmerInfo.D_TWO]);
		cardPanel.add(dThree, farmerInfo.panels[farmerInfo.D_THREE]);
		cardPanel.add(dFour, farmerInfo.panels[farmerInfo.D_FOUR]);
		cardPanel.add(dFive, farmerInfo.panels[farmerInfo.D_FIVE]);
		cardPanel.add(dSix, farmerInfo.panels[farmerInfo.D_SIX]);
		cardPanel.add(dSeven, farmerInfo.panels[farmerInfo.D_SEVEN]);
		cardPanel.add(dEight, farmerInfo.panels[farmerInfo.D_EIGHT]);
		cardPanel.add(dNine, farmerInfo.panels[farmerInfo.D_NINE]);
		cardPanel.add(dTen, farmerInfo.panels[farmerInfo.D_TEN]);
		cardPanel.add(dEleven, farmerInfo.panels[farmerInfo.D_ELEVEN]);
		cardPanel.add(dTwelve, farmerInfo.panels[farmerInfo.D_TWELVE]);
		cardPanel.add(dThirteen, farmerInfo.panels[farmerInfo.D_THIRTEEN]);
		cardPanel.add(dFourteen, farmerInfo.panels[farmerInfo.D_FOURTEEN]);
		cardPanel.add(dFifteen, farmerInfo.panels[farmerInfo.D_FIFTEEN]);
		
		cardPanel.add(eOne, farmerInfo.panels[farmerInfo.E_ONE]);
		cardPanel.add(eTwo, farmerInfo.panels[farmerInfo.E_TWO]);
		cardPanel.add(eThree, farmerInfo.panels[farmerInfo.E_THREE]);
		cardPanel.add(eFour, farmerInfo.panels[farmerInfo.E_FOUR]);
		cardPanel.add(eFive, farmerInfo.panels[farmerInfo.E_FIVE]);
		cardPanel.add(eSix, farmerInfo.panels[farmerInfo.E_SIX]);
		cardPanel.add(eSeven, farmerInfo.panels[farmerInfo.E_SEVEN]);
		cardPanel.add(eEight, farmerInfo.panels[farmerInfo.E_EIGHT]);
		cardPanel.add(eNine, farmerInfo.panels[farmerInfo.E_NINE]);
		cardPanel.add(eTen, farmerInfo.panels[farmerInfo.E_TEN]);
		cardPanel.add(eEleven, farmerInfo.panels[farmerInfo.E_ELEVEN]);
		cardPanel.add(eTwelve, farmerInfo.panels[farmerInfo.E_TWELVE]);
		cardPanel.add(eThirteen, farmerInfo.panels[farmerInfo.E_THIRTEEN]);
		
		cardPanel.add(fOne, farmerInfo.panels[farmerInfo.F_ONE]);
		cardPanel.add(fTwo, farmerInfo.panels[farmerInfo.F_TWO]);
		cardPanel.add(fThree, farmerInfo.panels[farmerInfo.F_THREE]);
		cardPanel.add(fFour, farmerInfo.panels[farmerInfo.F_FOUR]);
		cardPanel.add(fFive, farmerInfo.panels[farmerInfo.F_FIVE]);
		cardPanel.add(fSix, farmerInfo.panels[farmerInfo.F_SIX]);
		
		this.setContentPane(cardPanel);
		this.setTitle("Choose your own adventure!");
		this.setSize(800, 800);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public PastStoriesPanel getPastStories()
	{
		return pastStories;
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
