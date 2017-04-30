package GUI;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import member.Member;

public interface CrewLogSystem {
	Point POSITION = new Point(600,300);
	public final int VERT_POS=500;
	public final int HORS_POS=600;
	Font FONT_24 = new Font("monospaced", Font.PLAIN, 24);
	Font FONT_36 = new Font("monospaced", Font.PLAIN, 36);
	Font FONT_16 = new Font("monospaced", Font.PLAIN, 16);
	DateFormat df = new SimpleDateFormat("MM/dd/yy HH:mm:ss");
	ArrayList<Member> MEMBER_LIST = new ArrayList<Member>();
	public final String TITLE = "Crew Logs";
	public final Dimension WINDOW_SIZE = new Dimension(600,400);
}
