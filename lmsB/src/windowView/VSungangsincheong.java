package windowView;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class VSungangsincheong extends JPanel {
	private static final long serialVersionUID = 1L;
	//components
	
	private VHakgwaSelection vHakgwaSelection;
	private VGangjwaSelection vGangjwaSelection;
	private VGangjwaSelection vMiridamgi;
	private VGangjwaSelection vSincheong;
	
	public VSungangsincheong() {
		super();
		//attributes
		//components
		this.vHakgwaSelection = new VHakgwaSelection();
		this.add(this.vHakgwaSelection);
		
		JScrollPane pane;
		this.vGangjwaSelection = new VGangjwaSelection();
		pane = new  JScrollPane(this.vGangjwaSelection);
		this.add(pane);
		
		this.vMiridamgi = new VGangjwaSelection();
		pane = new JScrollPane(this.vMiridamgi);
		this.add(pane);
		
		this.vSincheong = new VGangjwaSelection();
		pane = new JScrollPane(this.vSincheong);
		this.add(pane);
	}

	public void initialize() {
		this.vHakgwaSelection.initialize();
		this.vHakgwaSelection.getDate("root");

		this.vGangjwaSelection.initialize();
		this.vGangjwaSelection.addRow("english");

		this.vMiridamgi.initialize();
		this.vMiridamgi.addRow("history");

		this.vSincheong.initialize();	
		this.vSincheong.addRow("english");
	}
}
