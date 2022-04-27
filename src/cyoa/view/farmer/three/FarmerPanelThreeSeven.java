package cyoa.view.farmer.three;

import javax.swing.JPanel;
import cyoa.controller.Controller;

public class FarmerPanelThreeSeven extends JPanel
{
	private JPanel panel;
	private Controller app;
	
	public FarmerPanelThreeSeven(Controller app)
	{
		super();
		this.panel = new JPanel();
		this.app = app;
	}
}
