package cyoa.view.farmer.two;

import javax.swing.JPanel;
import cyoa.controller.Controller;

public class FarmerPanelTwoOne extends JPanel
{
	private JPanel panel;
	private Controller app;
	
	public FarmerPanelTwoOne(Controller app)
	{
		super();
		this.panel = new JPanel();
		this.app = app;
	}
}
