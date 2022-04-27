package cyoa.view.farmer.five;

import javax.swing.JPanel;
import cyoa.controller.Controller;

public class FarmerPanelFiveTwo extends JPanel
{
	private JPanel panel;
	private Controller app;
	
	public FarmerPanelFiveTwo(Controller app)
	{
		super();
		this.panel = new JPanel();
		this.app = app;
	}
}
