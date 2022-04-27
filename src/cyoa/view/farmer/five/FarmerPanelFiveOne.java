package cyoa.view.farmer.five;

import javax.swing.JPanel;
import cyoa.controller.Controller;

public class FarmerPanelFiveOne extends JPanel
{
	private JPanel panel;
	private Controller app;
	
	public FarmerPanelFiveOne(Controller app)
	{
		super();
		this.panel = new JPanel();
		this.app = app;
	}
}
