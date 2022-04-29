package cyoa.view.farmer.six;

import javax.swing.JPanel;
import cyoa.controller.Controller;

public class FarmerPanelSecondEnding extends JPanel
{
	private JPanel panel;
	private Controller app;
	
	public FarmerPanelSecondEnding(Controller app)
	{
		super();
		this.panel = new JPanel();
		this.app = app;
	}
}
