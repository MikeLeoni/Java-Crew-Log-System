package GUI;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import member.Member;

public class HomeScreen implements CrewLogSystem{
	public final String WindowName="Home";
	JPanel NorthPanel;
	JPanel CenterPanel;
	Container pane;
	JButton newMember;
	JFrame frame;
	public HomeScreen() {
		frame = new JFrame();
		frame.setTitle(TITLE+":"+WindowName);
		pane = frame.getContentPane();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(POSITION);
		
		NorthPanel = new JPanel();
			NorthPanel.setLayout(new BorderLayout());
			newMember = new JButton("New Member");
				newMember.setFont(FONT_16);
				newMember.addActionListener(new NewMember());
				NorthPanel.add(newMember, BorderLayout.EAST);
			 pane.add(NorthPanel, BorderLayout.NORTH);
		CenterPanel = new JPanel();
			pane.add(CenterPanel, BorderLayout.CENTER);
			frame.setSize(WINDOW_SIZE);
			

			for (int i=0; i<MEMBER_LIST.size(); i++){
				CenterPanel.add(MEMBER_LIST.get(i), BorderLayout.AFTER_LAST_LINE);
			}
			frame.setVisible(true);
		
	}
	
	class NewMember implements  ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			@SuppressWarnings("unused")
			createMember mem = new createMember();
			frame.setVisible(false);
		}
	}
	Member m1;
	public void addMemberButton(Member m){
		m1=m;
		JButton member = new JButton(m.getName()+":"+m.getJob());
		member.setFont(FONT_24);
		member.setSize(300, 75);
		
	
		
	}

	

}
