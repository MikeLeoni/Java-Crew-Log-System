package member.entries;

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

import GUI.CrewLogSystem;
import member.Member;
import member.MemberOverview;


public class EntryWindow implements CrewLogSystem{
	JFrame window;
	Member m;
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
	public EntryWindow(Member m1) {
		m=m1;
		window = new JFrame("New Entry");
			window.setVisible(true);
			window.setSize(WINDOW_SIZE);
			window.setLocation(POSITION);
			
			pane = window.getContentPane();
			InfoPanel = new JPanel();
				InfoPanel.setFont(FONT_16);
				
			Date = df.format(DateObj);
				DateLabel  = new Label("Date: "+Date);
			Name=m.getName();
			Job = m.getJob();
				User = new Label("User: "+Name+":"+Job);
		
		EntryPanel = new JPanel();
			EntryWindow = new JTextArea(19,40);
			EntryWindow.setEditable(true);
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
			Entry entry = new Entry(Date, Name, Job, EntryWindow.getText());
			m.Entries.add(entry);
			@SuppressWarnings("unused")
			MemberOverview o = new MemberOverview(m);
			window.setVisible(false);
			
		}
		
	}
}
