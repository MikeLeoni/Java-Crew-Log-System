package member;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import GUI.CrewLogSystem;
import member.entries.EntryWindow;

@SuppressWarnings("serial")
public class MemberOverview extends JFrame implements CrewLogSystem{
	JFrame window;
		Member m;
		Container pane;
		JPanel TitlePanel;
		JPanel EntryPanel;
		JPanel ButtonPanel;
		JButton newEntry;
	public MemberOverview(Member m1) {
		m = m1;
	window = new JFrame();
		window.setTitle(TITLE+":Member:"+m.getName());
		window.setLocation(POSITION);
		window.setSize(WINDOW_SIZE);
		TitlePanel = new JPanel();
			
			Label Title = new Label(m.getName()+":"+m.getJob());
				Title.setFont(FONT_36);
				TitlePanel.add(Title);
		EntryPanel = new JPanel();
		
			Label Entrylabel = new Label("Previous entries:               ");
			Entrylabel.setFont(FONT_24);
		ButtonPanel = new JPanel();
			newEntry = new JButton("New Entry");
			newEntry.addActionListener(new NewEntry());
		window.add(TitlePanel, BorderLayout.NORTH);
			TitlePanel.add(Title);
		window.add(EntryPanel, BorderLayout.CENTER);
			EntryPanel.add(Entrylabel, BorderLayout.NORTH);
			for (int i=0; i<m.Entries.size(); i++){
				EntryPanel.add(m.Entries.get(i));
			}
		window.add(ButtonPanel, BorderLayout.EAST);
			ButtonPanel.add(newEntry);
		window.setVisible(true);
	}
	public class NewEntry implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			window.setVisible(false);
			@SuppressWarnings("unused")
			EntryWindow entry = new EntryWindow(m);
			
		}
		
	}
}
