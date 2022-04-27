package cyoa.view.farmer.three;

import javax.swing.JPanel;
import cyoa.controller.Controller;

public class FarmerPanelThreeFour extends JPanel
{
	private JPanel panel;
	private Controller app;
	
	public FarmerPanelThreeFour(Controller app)
	{
		super();
		this.panel = new JPanel();
		this.app = app;
	}
}
