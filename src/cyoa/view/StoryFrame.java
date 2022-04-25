package cyoa.view;

import javax.swing.JFrame;
import javax.swing.JPanel;

import cyoa.controller.Controller;

public class StoryFrame extends JFrame
{
	private Controller app;
	private MainPanel main;
	
	private FarmerPanelBeginning farmerBeginning;
	private FarmerPanelFirstEnding farmerFirstEnd;
	private FarmerPanelSecondEnding farmerSecondEnd;
	private FarmerPanelThirdEnding farmerThirdEnd;
	private FarmerPanelFourthEnding farmerFourthEnd;
	private FarmerPanelFifthEnding farmerFifthEnd;
	private FarmerPanelSixthEnding farmerSixthEnd;
	
	public StoryFrame (Controller app)
	{
		super();
		this.app = app;
		this.main = new MainPanel(this.app);
		
		this.farmerBeginning = new FarmerPanelBeginning();
		this.farmerFirstEnd = new FarmerPanelFirstEnding();
		this.farmerSecondEnd = new FarmerPanelSecondEnding();
		this.farmerThirdEnd = new FarmerPanelThirdEnding();
		this.farmerFourthEnd = new FarmerPanelFourthEnding();
		this.farmerFifthEnd = new FarmerPanelFifthEnding();
		this.farmerSixthEnd = new FarmerPanelSixthEnding();
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(main);
		this.setTitle("Choose your own adventure");
		this.setSize(1500, 900);
		this.setResizable(false);
		this.setVisible(true);
	}
	
	public void changePanel(JPanel panel)
	{
		getContentPane().removeAll();
		setContentPane(panel);
		getContentPane().revalidate();
		getContentPane().repaint();
	}
}
