package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class mainPanel extends JFrame{
	
	private JFrame main_frame;
	private JButton single_button, stable_button, ini_button;
	private JLabel label_one_one, label_one_two, label_one_three, label_one_four, label_one_five, label_one_six,
					label_two_one, label_two_two, label_two_three, label_two_four, label_two_five, label_two_six,
					label_three_one, label_three_two, label_three_three, label_three_four, label_three_five, label_three_six,
					label_four_one, label_four_two, label_four_three, label_four_four, label_four_five, label_four_six,
					label_five_one, label_five_two, label_five_three, label_five_four, label_five_five, label_five_six,
					label_six_one, label_six_two, label_six_three, label_six_four, label_six_five, label_six_six,
					label_seven_one, label_seven_two, label_seven_three, label_seven_four, label_seven_five, label_seven_six,
					label_eight_one, label_eight_two, label_eight_three, label_eight_four, label_eight_five, label_eight_six,
					label_nine_one, label_nine_two, label_nine_three, label_nine_four, label_nine_five, label_nine_six,
					label_ten_one, label_ten_two, label_ten_three, label_ten_four, label_ten_five, label_ten_six,
					label_eleven_one, label_eleven_two, label_eleven_three, label_eleven_four, label_eleven_five, label_eleven_six,
					label_twelve_one, label_twelve_two, label_twelve_three, label_twelve_four, label_twelve_five, label_twelve_six,
					label_thirteen_one, label_thirteen_two, label_thirteen_three, label_thirteen_four, label_thirteen_five, label_thirteen_six,
					label_forteen_one, label_forteen_two, label_forteen_three, label_forteen_four, label_forteen_five, label_forteen_six,
					label_fifteen_one, label_fifteen_two, label_fifteen_three, label_fifteen_four, label_fifteen_five, label_fifteen_six,
					label_sixteen_one, label_sixteen_two, label_sixteen_three, label_sixteen_four, label_sixteen_five, label_sixteen_six,
					label_information; 
	
	private JPanel panel_one, panel_two, panel_three, panel_four, panel_five, panel_six, panel_seven, panel_eight, panel_nine, panel_ten,
					panel_eleven, panel_twelve, panel_thirteen, panel_forteen, panel_fifteen, panel_sixteen,
					panel_button, panel_information;
	
	private Container panel_main;
	
	private mainPanel() {
		initComponents();
	}
	
	public void initComponents() {
		
		this.main_frame = new JFrame("MDP by YiQian Kailing Huang");
		this.main_frame.setLayout(new BorderLayout(10, 10));
		this.main_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.main_frame.setLocation(500, 50);
		this.main_frame.setResizable(true);
		
		this.panel_main = main_frame.getContentPane();
		this.panel_main.setLayout(new BoxLayout(this.panel_main, BoxLayout.Y_AXIS));
		
		//this.panel_main = new JPanel(new BoxLayout(this.panel_main, BoxLayout.Y_AXIS));
		
		this.panel_information = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
		this.label_information = new JLabel("red:North| yellow:South| blue:West| green:East");
		this.panel_information.add(label_information);
		this.panel_main.add(this.panel_information);
		
		// one
		this.panel_one = new JPanel(new FlowLayout(FlowLayout.LEFT, 40, 10));
		this.label_one_one = new JLabel("0");
		this.label_one_two = new JLabel("0");
		this.label_one_three = new JLabel("0");
		this.label_one_four = new JLabel("0");
		this.label_one_five = new JLabel("0");
		this.label_one_six = new JLabel("0");
		this.label_one_one.setOpaque(true);
		this.label_one_one.setBackground(Color.white);
		this.label_one_two.setOpaque(true);
		this.label_one_two.setBackground(Color.white);
		this.label_one_three.setOpaque(true);
		this.label_one_three.setBackground(Color.white);
		this.label_one_four.setOpaque(true);
		this.label_one_four.setBackground(Color.white);
		this.label_one_five.setOpaque(true);
		this.label_one_five.setBackground(Color.white);
		this.label_one_six.setOpaque(true);
		this.label_one_six.setBackground(Color.white);
		this.panel_one.add(this.label_one_one);
		this.panel_one.add(this.label_one_two);
		this.panel_one.add(this.label_one_three);
		this.panel_one.add(this.label_one_four);
		this.panel_one.add(this.label_one_five);
		this.panel_one.add(this.label_one_six);
		this.panel_main.add(this.panel_one);
		
		// two
		this.panel_two = new JPanel(new FlowLayout(FlowLayout.LEFT, 40, 10));
		this.label_two_one = new JLabel("0");
		this.label_two_two = new JLabel("0");
		this.label_two_three = new JLabel("0");
		this.label_two_four = new JLabel("0");
		this.label_two_five = new JLabel("0");
		this.label_two_six = new JLabel("0");
		this.label_two_one.setOpaque(true);
		this.label_two_one.setBackground(Color.white);
		this.label_two_two.setOpaque(true);
		this.label_two_two.setBackground(Color.white);
		this.label_two_three.setOpaque(true);
		this.label_two_three.setBackground(Color.white);
		this.label_two_four.setOpaque(true);
		this.label_two_four.setBackground(Color.white);
		this.label_two_five.setOpaque(true);
		this.label_two_five.setBackground(Color.white);
		this.label_two_six.setOpaque(true);
		this.label_two_six.setBackground(Color.white);
		this.panel_two.add(this.label_two_one);
		this.panel_two.add(this.label_two_two);
		this.panel_two.add(this.label_two_three);
		this.panel_two.add(this.label_two_four);
		this.panel_two.add(this.label_two_five);
		this.panel_two.add(this.label_two_six);
		this.panel_main.add(this.panel_two);
		
		// three
		this.panel_three = new JPanel(new FlowLayout(FlowLayout.LEFT, 40, 10));
		this.label_three_one = new JLabel("0");
		this.label_three_two = new JLabel("0");
		this.label_three_three = new JLabel("0");
		this.label_three_four = new JLabel("0");
		this.label_three_five = new JLabel("0");
		this.label_three_six = new JLabel("0");
		this.label_three_one.setOpaque(true);
		this.label_three_one.setBackground(Color.white);
		this.label_three_two.setOpaque(true);
		this.label_three_two.setBackground(Color.white);
		this.label_three_three.setOpaque(true);
		this.label_three_three.setBackground(Color.white);
		this.label_three_four.setOpaque(true);
		this.label_three_four.setBackground(Color.white);
		this.label_three_five.setOpaque(true);
		this.label_three_five.setBackground(Color.white);
		this.label_three_six.setOpaque(true);
		this.label_three_six.setBackground(Color.white);
		this.panel_three.add(this.label_three_one);
		this.panel_three.add(this.label_three_two);
		this.panel_three.add(this.label_three_three);
		this.panel_three.add(this.label_three_four);
		this.panel_three.add(this.label_three_five);
		this.panel_three.add(this.label_three_six);
		this.panel_main.add(this.panel_three);
		
		// four
		this.panel_four = new JPanel(new FlowLayout(FlowLayout.LEFT, 40, 10));
		this.label_four_one = new JLabel("0");
		this.label_four_two = new JLabel("0");
		this.label_four_three = new JLabel("0");
		this.label_four_four = new JLabel("0");
		this.label_four_five = new JLabel("0");
		this.label_four_six = new JLabel("0");
		this.label_four_one.setOpaque(true);
		this.label_four_one.setBackground(Color.white);
		this.label_four_two.setOpaque(true);
		this.label_four_two.setBackground(Color.white);
		this.label_four_three.setOpaque(true);
		this.label_four_three.setBackground(Color.white);
		this.label_four_four.setOpaque(true);
		this.label_four_four.setBackground(Color.white);
		this.label_four_five.setOpaque(true);
		this.label_four_five.setBackground(Color.white);
		this.label_four_six.setOpaque(true);
		this.label_one_six.setBackground(Color.white);
		this.panel_four.add(this.label_four_one);
		this.panel_four.add(this.label_four_two);
		this.panel_four.add(this.label_four_three);
		this.panel_four.add(this.label_four_four);
		this.panel_four.add(this.label_four_five);
		this.panel_four.add(this.label_four_six);
		this.panel_main.add(this.panel_four);
		
		// five
		this.panel_five = new JPanel(new FlowLayout(FlowLayout.LEFT, 40, 10));
		this.label_five_one = new JLabel("0");
		this.label_five_two = new JLabel("0");
		this.label_five_three = new JLabel("0");
		this.label_five_four = new JLabel("0");
		this.label_five_five = new JLabel("0");
		this.label_five_six = new JLabel("0");
		this.label_five_one.setOpaque(true);
		this.label_five_one.setBackground(Color.white);
		this.label_five_two.setOpaque(true);
		this.label_five_two.setBackground(Color.white);
		this.label_five_three.setOpaque(true);
		this.label_five_three.setBackground(Color.white);
		this.label_five_four.setOpaque(true);
		this.label_five_four.setBackground(Color.white);
		this.label_five_five.setOpaque(true);
		this.label_five_five.setBackground(Color.white);
		this.label_five_six.setOpaque(true);
		this.label_five_six.setBackground(Color.white);
		this.panel_five.add(this.label_five_one);
		this.panel_five.add(this.label_five_two);
		this.panel_five.add(this.label_five_three);
		this.panel_five.add(this.label_five_four);
		this.panel_five.add(this.label_five_five);
		this.panel_five.add(this.label_five_six);
		this.panel_main.add(this.panel_five);
		
		// six
		this.panel_six = new JPanel(new FlowLayout(FlowLayout.LEFT, 40, 10));
		this.label_six_one = new JLabel("0");
		this.label_six_two = new JLabel("0");
		this.label_six_three = new JLabel("0");
		this.label_six_four = new JLabel("0");
		this.label_six_five = new JLabel("0");
		this.label_six_six = new JLabel("0");
		this.label_six_one.setOpaque(true);
		this.label_six_one.setBackground(Color.white);
		this.label_six_two.setOpaque(true);
		this.label_six_two.setBackground(Color.white);
		this.label_six_three.setOpaque(true);
		this.label_six_three.setBackground(Color.white);
		this.label_six_four.setOpaque(true);
		this.label_six_four.setBackground(Color.white);
		this.label_six_five.setOpaque(true);
		this.label_six_five.setBackground(Color.white);
		this.label_six_six.setOpaque(true);
		this.label_six_six.setBackground(Color.white);
		this.panel_six.add(this.label_six_one);
		this.panel_six.add(this.label_six_two);
		this.panel_six.add(this.label_six_three);
		this.panel_six.add(this.label_six_four);
		this.panel_six.add(this.label_six_five);
		this.panel_six.add(this.label_six_six);
		this.panel_main.add(this.panel_six);
		
		// seven
		this.panel_seven = new JPanel(new FlowLayout(FlowLayout.LEFT, 40, 10));
		this.label_seven_one = new JLabel("0");
		this.label_seven_two = new JLabel("0");
		this.label_seven_three = new JLabel("0");
		this.label_seven_four = new JLabel("0");
		this.label_seven_five = new JLabel("0");
		this.label_seven_six = new JLabel("0");
		this.label_seven_one.setOpaque(true);
		this.label_seven_one.setBackground(Color.white);
		this.label_seven_two.setOpaque(true);
		this.label_seven_two.setBackground(Color.white);
		this.label_seven_three.setOpaque(true);
		this.label_seven_three.setBackground(Color.white);
		this.label_seven_four.setOpaque(true);
		this.label_seven_four.setBackground(Color.white);
		this.label_seven_five.setOpaque(true);
		this.label_seven_five.setBackground(Color.white);
		this.label_seven_six.setOpaque(true);
		this.label_seven_six.setBackground(Color.white);
		this.panel_seven.add(this.label_seven_one);
		this.panel_seven.add(this.label_seven_two);
		this.panel_seven.add(this.label_seven_three);
		this.panel_seven.add(this.label_seven_four);
		this.panel_seven.add(this.label_seven_five);
		this.panel_seven.add(this.label_seven_six);
		this.panel_main.add(this.panel_seven);
		
		// eight
		this.panel_eight= new JPanel(new FlowLayout(FlowLayout.LEFT, 40, 10));
		this.label_eight_one = new JLabel("0");
		this.label_eight_two = new JLabel("0");
		this.label_eight_three = new JLabel("0");
		this.label_eight_four = new JLabel("0");
		this.label_eight_five = new JLabel("0");
		this.label_eight_six = new JLabel("0");
		this.label_eight_one.setOpaque(true);
		this.label_eight_one.setBackground(Color.white);
		this.label_eight_two.setOpaque(true);
		this.label_eight_two.setBackground(Color.white);
		this.label_eight_three.setOpaque(true);
		this.label_eight_three.setBackground(Color.white);
		this.label_eight_four.setOpaque(true);
		this.label_eight_four.setBackground(Color.white);
		this.label_eight_five.setOpaque(true);
		this.label_eight_five.setBackground(Color.white);
		this.label_eight_six.setOpaque(true);
		this.label_eight_six.setBackground(Color.white);
		this.panel_eight.add(this.label_eight_one);
		this.panel_eight.add(this.label_eight_two);
		this.panel_eight.add(this.label_eight_three);
		this.panel_eight.add(this.label_eight_four);
		this.panel_eight.add(this.label_eight_five);
		this.panel_eight.add(this.label_eight_six);
		this.panel_main.add(this.panel_eight);
		
		// nine
		this.panel_nine = new JPanel(new FlowLayout(FlowLayout.LEFT, 40, 10));
		this.label_nine_one = new JLabel("0");
		this.label_nine_two = new JLabel("0");
		this.label_nine_three = new JLabel("0");
		this.label_nine_four = new JLabel("0");
		this.label_nine_five = new JLabel("0");
		this.label_nine_six = new JLabel("0");
		this.label_nine_one.setOpaque(true);
		this.label_nine_one.setBackground(Color.white);
		this.label_nine_two.setOpaque(true);
		this.label_nine_two.setBackground(Color.white);
		this.label_nine_three.setOpaque(true);
		this.label_nine_three.setBackground(Color.white);
		this.label_nine_four.setOpaque(true);
		this.label_nine_four.setBackground(Color.white);
		this.label_nine_five.setOpaque(true);
		this.label_nine_five.setBackground(Color.white);
		this.label_nine_six.setOpaque(true);
		this.label_nine_six.setBackground(Color.white);
		this.panel_nine.add(this.label_nine_one);
		this.panel_nine.add(this.label_nine_two);
		this.panel_nine.add(this.label_nine_three);
		this.panel_nine.add(this.label_nine_four);
		this.panel_nine.add(this.label_nine_five);
		this.panel_nine.add(this.label_nine_six);
		this.panel_main.add(this.panel_nine);
		
		// ten
		this.panel_ten = new JPanel(new FlowLayout(FlowLayout.LEFT, 40, 10));
		this.label_ten_one = new JLabel("0");
		this.label_ten_two = new JLabel("0");
		this.label_ten_three = new JLabel("0");
		this.label_ten_four = new JLabel("0");
		this.label_ten_five = new JLabel("0");
		this.label_ten_six = new JLabel("0");
		this.label_ten_one.setOpaque(true);
		this.label_ten_one.setBackground(Color.white);
		this.label_ten_two.setOpaque(true);
		this.label_ten_two.setBackground(Color.white);
		this.label_ten_three.setOpaque(true);
		this.label_ten_three.setBackground(Color.white);
		this.label_ten_four.setOpaque(true);
		this.label_ten_four.setBackground(Color.white);
		this.label_ten_five.setOpaque(true);
		this.label_ten_five.setBackground(Color.white);
		this.label_ten_six.setOpaque(true);
		this.label_ten_six.setBackground(Color.white);
		this.panel_ten.add(this.label_ten_one);
		this.panel_ten.add(this.label_ten_two);
		this.panel_ten.add(this.label_ten_three);
		this.panel_ten.add(this.label_ten_four);
		this.panel_ten.add(this.label_ten_five);
		this.panel_ten.add(this.label_ten_six);
		this.panel_main.add(this.panel_ten);
		
		// eleven
		this.panel_eleven = new JPanel(new FlowLayout(FlowLayout.LEFT, 40, 10));
		this.label_eleven_one = new JLabel("0");
		this.label_eleven_two = new JLabel("0");
		this.label_eleven_three = new JLabel("0");
		this.label_eleven_four = new JLabel("0");
		this.label_eleven_five = new JLabel("0");
		this.label_eleven_six = new JLabel("0");
		this.label_eleven_one.setOpaque(true);
		this.label_eleven_one.setBackground(Color.white);
		this.label_eleven_two.setOpaque(true);
		this.label_eleven_two.setBackground(Color.white);
		this.label_eleven_three.setOpaque(true);
		this.label_eleven_three.setBackground(Color.white);
		this.label_eleven_four.setOpaque(true);
		this.label_eleven_four.setBackground(Color.white);
		this.label_eleven_five.setOpaque(true);
		this.label_eleven_five.setBackground(Color.white);
		this.label_eleven_six.setOpaque(true);
		this.label_eleven_six.setBackground(Color.white);
		this.panel_eleven.add(this.label_eleven_one);
		this.panel_eleven.add(this.label_eleven_two);
		this.panel_eleven.add(this.label_eleven_three);
		this.panel_eleven.add(this.label_eleven_four);
		this.panel_eleven.add(this.label_eleven_five);
		this.panel_eleven.add(this.label_eleven_six);
		this.panel_main.add(this.panel_eleven);
		
		// twelve
		this.panel_twelve = new JPanel(new FlowLayout(FlowLayout.LEFT, 40, 10));
		this.label_twelve_one = new JLabel("0");
		this.label_twelve_two = new JLabel("0");
		this.label_twelve_three = new JLabel("0");
		this.label_twelve_four = new JLabel("0");
		this.label_twelve_five = new JLabel("0");
		this.label_twelve_six = new JLabel("0");
		this.label_twelve_one.setOpaque(true);
		this.label_twelve_one.setBackground(Color.white);
		this.label_twelve_two.setOpaque(true);
		this.label_twelve_two.setBackground(Color.white);
		this.label_twelve_three.setOpaque(true);
		this.label_twelve_three.setBackground(Color.white);
		this.label_twelve_four.setOpaque(true);
		this.label_twelve_four.setBackground(Color.white);
		this.label_twelve_five.setOpaque(true);
		this.label_twelve_five.setBackground(Color.white);
		this.label_twelve_six.setOpaque(true);
		this.label_twelve_six.setBackground(Color.white);
		this.panel_twelve.add(this.label_twelve_one);
		this.panel_twelve.add(this.label_twelve_two);
		this.panel_twelve.add(this.label_twelve_three);
		this.panel_twelve.add(this.label_twelve_four);
		this.panel_twelve.add(this.label_twelve_five);
		this.panel_twelve.add(this.label_twelve_six);
		this.panel_main.add(this.panel_twelve);
		
		// thirteen
		this.panel_thirteen = new JPanel(new FlowLayout(FlowLayout.LEFT, 40, 10));
		this.label_thirteen_one = new JLabel("0");
		this.label_thirteen_two = new JLabel("0");
		this.label_thirteen_three = new JLabel("0");
		this.label_thirteen_four = new JLabel("0");
		this.label_thirteen_five = new JLabel("0");
		this.label_thirteen_six = new JLabel("0");
		this.label_thirteen_one.setOpaque(true);
		this.label_thirteen_one.setBackground(Color.white);
		this.label_thirteen_two.setOpaque(true);
		this.label_thirteen_two.setBackground(Color.white);
		this.label_thirteen_three.setOpaque(true);
		this.label_thirteen_three.setBackground(Color.white);
		this.label_thirteen_four.setOpaque(true);
		this.label_thirteen_four.setBackground(Color.white);
		this.label_thirteen_five.setOpaque(true);
		this.label_thirteen_five.setBackground(Color.white);
		this.label_thirteen_six.setOpaque(true);
		this.label_thirteen_six.setBackground(Color.white);
		this.panel_thirteen.add(this.label_thirteen_one);
		this.panel_thirteen.add(this.label_thirteen_two);
		this.panel_thirteen.add(this.label_thirteen_three);
		this.panel_thirteen.add(this.label_thirteen_four);
		this.panel_thirteen.add(this.label_thirteen_five);
		this.panel_thirteen.add(this.label_thirteen_six);
		this.panel_main.add(this.panel_thirteen);
		
		// forteen
		this.panel_forteen = new JPanel(new FlowLayout(FlowLayout.LEFT, 40, 10));
		this.label_forteen_one = new JLabel("0");
		this.label_forteen_two = new JLabel("0");
		this.label_forteen_three = new JLabel("0");
		this.label_forteen_four = new JLabel("0");
		this.label_forteen_five = new JLabel("0");
		this.label_forteen_six = new JLabel("0");
		this.label_forteen_one.setOpaque(true);
		this.label_forteen_one.setBackground(Color.white);
		this.label_forteen_two.setOpaque(true);
		this.label_forteen_two.setBackground(Color.white);
		this.label_forteen_three.setOpaque(true);
		this.label_forteen_three.setBackground(Color.white);
		this.label_forteen_four.setOpaque(true);
		this.label_forteen_four.setBackground(Color.white);
		this.label_forteen_five.setOpaque(true);
		this.label_forteen_five.setBackground(Color.white);
		this.label_forteen_six.setOpaque(true);
		this.label_forteen_six.setBackground(Color.white);
		this.panel_forteen.add(this.label_forteen_one);
		this.panel_forteen.add(this.label_forteen_two);
		this.panel_forteen.add(this.label_forteen_three);
		this.panel_forteen.add(this.label_forteen_four);
		this.panel_forteen.add(this.label_forteen_five);
		this.panel_forteen.add(this.label_forteen_six);
		this.panel_main.add(this.panel_forteen);
		
		// fifteen
		this.panel_fifteen = new JPanel(new FlowLayout(FlowLayout.LEFT, 40, 10));
		this.label_fifteen_one = new JLabel("0");
		this.label_fifteen_two = new JLabel("0");
		this.label_fifteen_three = new JLabel("0");
		this.label_fifteen_four = new JLabel("0");
		this.label_fifteen_five = new JLabel("0");
		this.label_fifteen_six = new JLabel("0");
		this.label_fifteen_one.setOpaque(true);
		this.label_fifteen_one.setBackground(Color.white);
		this.label_fifteen_two.setOpaque(true);
		this.label_fifteen_two.setBackground(Color.white);
		this.label_fifteen_three.setOpaque(true);
		this.label_fifteen_three.setBackground(Color.white);
		this.label_fifteen_four.setOpaque(true);
		this.label_fifteen_four.setBackground(Color.white);
		this.label_fifteen_five.setOpaque(true);
		this.label_fifteen_five.setBackground(Color.white);
		this.label_fifteen_six.setOpaque(true);
		this.label_fifteen_six.setBackground(Color.white);
		this.panel_fifteen.add(this.label_fifteen_one);
		this.panel_fifteen.add(this.label_fifteen_two);
		this.panel_fifteen.add(this.label_fifteen_three);
		this.panel_fifteen.add(this.label_fifteen_four);
		this.panel_fifteen.add(this.label_fifteen_five);
		this.panel_fifteen.add(this.label_fifteen_six);
		this.panel_main.add(this.panel_fifteen);
		
		// sixteen
		this.panel_sixteen = new JPanel(new FlowLayout(FlowLayout.LEFT, 40, 10));
		this.label_sixteen_one = new JLabel("0");
		this.label_sixteen_two = new JLabel("0");
		this.label_sixteen_three = new JLabel("0");
		this.label_sixteen_four = new JLabel("0");
		this.label_sixteen_five = new JLabel("0");
		this.label_sixteen_six = new JLabel("0");
		this.label_sixteen_one.setOpaque(true);
		this.label_sixteen_one.setBackground(Color.white);
		this.label_sixteen_two.setOpaque(true);
		this.label_sixteen_two.setBackground(Color.white);
		this.label_sixteen_three.setOpaque(true);
		this.label_sixteen_three.setBackground(Color.white);
		this.label_sixteen_four.setOpaque(true);
		this.label_sixteen_four.setBackground(Color.white);
		this.label_sixteen_five.setOpaque(true);
		this.label_sixteen_five.setBackground(Color.white);
		this.label_sixteen_six.setOpaque(true);
		this.label_sixteen_six.setBackground(Color.white);
		this.panel_sixteen.add(this.label_sixteen_one);
		this.panel_sixteen.add(this.label_sixteen_two);
		this.panel_sixteen.add(this.label_sixteen_three);
		this.panel_sixteen.add(this.label_sixteen_four);
		this.panel_sixteen.add(this.label_sixteen_five);
		this.panel_sixteen.add(this.label_sixteen_six);
		this.panel_main.add(this.panel_sixteen);
		
		// button
		this.panel_button = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
		this.single_button = new JButton("Single Iterative");
		this.stable_button = new JButton("Iterative 2 stable");
		this.ini_button = new JButton("Initial board");
		this.panel_button.add(this.single_button);
		this.panel_button.add(this.stable_button);
		this.panel_button.add(this.ini_button);
		this.panel_main.add(this.panel_button);
		
		this.main_frame.setVisible(true);
		this.main_frame.pack();

		
		
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new mainPanel();
			}
		});
	}

}
