package cyoa.view;

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import cyoa.controller.Controller;

public class StoryFrame extends JFrame
{
	private Controller app;
	private MainPanel panel;
	private JPanel cardPanel;
	private FarmerPanelBeginning farmerBeginning;
	
	public StoryFrame(Controller app)
	{
		super();
		this.app = app;
		this.panel = new MainPanel(this.app);
		this.cardPanel = new JPanel(new CardLayout());
		this.farmerBeginning = new FarmerPanelBeginning(this.app);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		cardPanel.add(panel, "main");
		cardPanel.add(farmerBeginning, "FBeginning");
		
		this.setContentPane(panel);
		this.setTitle("Choose your own adventure!");
		this.setSize(1500, 900);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public void changeScreen(String screen)
	{
		((CardLayout) cardPanel.getLayout()).show(cardPanel, screen);
	}
}
