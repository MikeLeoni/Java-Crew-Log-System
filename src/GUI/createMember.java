package GUI;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import member.Member;

@SuppressWarnings("serial")
public class createMember extends JFrame implements CrewLogSystem{
		JFrame window;
			Container main;
				JPanel TitlePanel;
					JLabel Title;
				JPanel CenterPanel;
					JLabel Name;
					JTextField NameField;
					JLabel Job;
					JTextField JobField;
					JButton Done;
				
		String name;
		String job;
	public createMember() {
	window = new JFrame();
		window.setLocation(POSITION);
		window.setSize(300,200);
		main = window.getContentPane();
//Title
		TitlePanel = new JPanel();
			Title = new JLabel("New Member");
			Title.setFont(FONT_36);
//Information
		CenterPanel = new JPanel();
			Name = new JLabel("Name: ");
			NameField = new JTextField(10);
			Job = new JLabel("Job: ");
			JobField = new JTextField(10);
			Done = new JButton("Done");
				Done.addActionListener(new DoneButton());
//Initialization
		main.add(TitlePanel, BorderLayout.NORTH);
			TitlePanel.add(Title);
		main.add(CenterPanel, BorderLayout.CENTER);
			CenterPanel.add(Name);
			CenterPanel.add(NameField);
			CenterPanel.add(Job);
			CenterPanel.add(JobField);
			CenterPanel.add(Done);
		window.setVisible(true);
			
	}
	class DoneButton implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			name = NameField.getText();
			job = JobField.getText();
			Member m = new Member(name, job);
			MEMBER_LIST.add(m);
			window.setVisible(false);
			@SuppressWarnings("unused")
			HomeScreen home =  new HomeScreen();
		}
		
	}

}
