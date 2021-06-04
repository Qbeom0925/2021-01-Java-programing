package windowView2;

import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import control.CLecture;
import valueObject.OLecture;

public class VGangjwaSelection extends JTable {
   private static final long serialVersionUID = 1L;
   //components
   private DefaultTableModel model;
   private CLecture cLecture;
   
   public VGangjwaSelection() {
      super();
      //attributes
      this.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
      //components
      this.model = (DefaultTableModel) this.getModel();
      model.addColumn("강좌명");
      model.addColumn("강사명");
      model.addColumn("시간");
      //associations
   }
   
   public void initialize() {
      this.model.setNumRows(0);
   }
   
   public void addRow(String filename, DefaultTableModel model) {
      this.cLecture = new CLecture();
      Vector<OLecture> oLectures = this.cLecture.getAll(filename);
      
      String[] row = new String[model.getColumnCount()];
      for(OLecture oLecture : oLectures) {
         row[0] = oLecture.getId();
         row[1] = oLecture.getLectureName();
         row[2] = oLecture.getProfName();
         row[3] = oLecture.getCredits();
         row[4] =  oLecture.getTime();
         model.addRow(row);
      }
      this.updateUI();
   }
   
   public void Miridamgi(String filename, DefaultTableModel model) {
	      this.cLecture = new CLecture();
	      Vector<OLecture> oLectures = this.cLecture.WMiridamgi(filename);
	      
	      String[] row = new String[model.getColumnCount()];
	      for(OLecture oLecture : oLectures) {
	         row[0] = oLecture.getId();
	         row[1] = oLecture.getLectureName();
	         row[2] = oLecture.getProfName();
	         row[3] = oLecture.getCredits();
	         row[4] =  oLecture.getTime();
	         model.addRow(row);
	      }
	      this.updateUI();
   }
   
   public void Sincheon(String filename, DefaultTableModel model) {
	   this.cLecture = new CLecture();
	      Vector<OLecture> oLectures = this.cLecture.WSincheon(filename);
	      
	      String[] row = new String[model.getColumnCount()];
	      for(OLecture oLecture : oLectures) {
	         row[0] = oLecture.getId();
	         row[1] = oLecture.getLectureName();
	         row[2] = oLecture.getProfName();
	         row[3] = oLecture.getCredits();
	         row[4] =  oLecture.getTime();
	         model.addRow(row);
	      }
	      this.updateUI();	   
   }
}