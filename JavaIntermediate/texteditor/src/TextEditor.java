import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.*;

@SuppressWarnings("serial")
/**
 * Write a description of your applet here.
 * @author (your name) 
 */
public class TextEditor extends JApplet 
	implements ActionListener {
	private TextEditorModel model;

	// add components here
	private JTextField field;
	private JTextArea area;

	/**
	 * Called by the browser or applet viewer to inform this JApplet that it has
	 * been loaded into the system. It is always called before the first time
	 * that the start method is called.
	 */
	public void init() {
		// create a model and view object
		model = new TextEditorModel();
		// set the size of this applet to the size that the view wants
		this.setSize(new Dimension(500, 500));
		// make a new content pane to organize what we put into the applet
		this.setLayout(new FlowLayout());
		// initialize the components of this applet
		initializeComponents();
	}

	/**
	 * Initializes the components of this applet.
	 */
	public void initializeComponents() {
		// initialize the buttons
		// new file button
		JButton newFile = new JButton("new");
		newFile.setActionCommand("new");
		newFile.addActionListener(this);
		add(newFile);
		// save file button
		JButton saveFile = new JButton("save");
		saveFile.setActionCommand("save");
		saveFile.addActionListener(this);
		add(saveFile);
		// open file button
		JButton openFile = new JButton("open");
		openFile.setActionCommand("open");
		openFile.addActionListener(this);
		add(openFile);
		// save as button
		JButton saveAsFile = new JButton("save as");
		saveAsFile.setActionCommand("save as");
		saveAsFile.addActionListener(this);
		add(saveAsFile);
		// clear file button
		JButton clearFile = new JButton("clear");
		clearFile.setActionCommand("clear");
		clearFile.addActionListener(this);
		add(clearFile);
		
		// text area
		area = new JTextArea(30, 30);
		add(area);
	}

	/**
	 * This method is called whenever a component with an action value is
	 * activated.
	 */
	public void actionPerformed(ActionEvent a) {
		if (a.getSource() == field) {
			// then our text field is sending us data
		}
		else {
			// otherwise, some other component is sending us data
			String action = a.getActionCommand();
			if (action.equals("new")) {
				
			}
			// get the file name to open, and set the text area to the contents
			if (action.equals("open")) {
				String fileName = JOptionPane.showInputDialog("What should I open?");
				String text = model.openFile("/Users/Keshav/Desktop/" + fileName + ".txt");
				area.setText(text);
			}
			if (action.equals("save")) {
				String fileName = JOptionPane.showInputDialog("What should I call this file?");
				model.saveFile("/Users/Keshav/Desktop/" + fileName, area.getText());
			}
			if (action.equals("save as")) {
				
			}
			if (action.equals("clear")) {
				area.setText("");
			}
		}
	}
}
