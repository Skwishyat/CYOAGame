package cyoa.view.farmer.three;

import javax.swing.JPanel;
import cyoa.controller.Controller;

public class FarmerPanelThreeFive extends JPanel
{
	private JPanel panel;
	private Controller app;
	
	public FarmerPanelThreeFive(Controller app)
	{
		super();
		this.panel = new JPanel();
		this.app = app;
	}
}
