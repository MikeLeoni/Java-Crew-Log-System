package member.entries;

import GUI.CrewLogSystem;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;



public class VeiwEntry implements CrewLogSystem{
	JFrame window;
	Entry e;
	Container pane;
		JPanel InfoPanel;
			Label DateLabel;
				String Date;
					Date DateObj = new Date();
			Label User;
				String Name;
				String Job;
		JPanel EntryPanel;
			JTextArea EntryWindow;
		JPanel ButtonPanel;
			JButton DoneButton;
	public VeiwEntry(Entry e1) {
		e=e1;
		window = new JFrame("New Entry");
			window.setLocation(POSITION);
			window.setVisible(true);
			window.setSize(WINDOW_SIZE);
			
			pane = window.getContentPane();
			InfoPanel = new JPanel();
				InfoPanel.setFont(FONT_16);
				
			Date = df.format(DateObj);
				DateLabel  = new Label(e.getDate());
			Name=e.getUser();
			Job = e.getJob();
				User = new Label("User: "+Name+":"+Job);
		
		EntryPanel = new JPanel();
			EntryWindow = new JTextArea(19,40);
			EntryWindow.setEditable(false);
			EntryWindow.setText(e.getEntry());
			EntryWindow.setFont(FONT_16);
		ButtonPanel = new JPanel();
			DoneButton = new JButton("Done");
			DoneButton.addActionListener(new DoneButton());
			
		
		pane.add(InfoPanel, BorderLayout.NORTH);
			InfoPanel.add(DateLabel);
			InfoPanel.add(User);
		pane.add(ButtonPanel, BorderLayout.EAST);
			ButtonPanel.add(DoneButton);
		pane.add(EntryPanel, BorderLayout.CENTER);
			EntryPanel.add(EntryWindow);
	}
	class DoneButton implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			window.setVisible(false);
		}
		
	}
}
