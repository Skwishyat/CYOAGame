package cyoa.view.farmer.five;

import javax.swing.JPanel;
import cyoa.controller.Controller;

public class FarmerPanelFiveTen extends JPanel
{
	private JPanel panel;
	private Controller app;
	
	public FarmerPanelFiveTen(Controller app)
	{
		super();
		this.panel = new JPanel();
		this.app = app;
	}
}
