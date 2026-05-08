// Hruday Mulky
// 4/2/26
// PutItTogether.java  
// This program uses most of the component and layout step that we have learnt."
// Once the name is entered and the checkbox is clicked, the user can choose to open a panel 
// to see information about two people(Perry the platypus and Dr. Doofenshirmtz), a panel to change the size and colour
// of a square or a panel to view my masterpiece.
// Working on: Layouts, Graphics, Components, Listeners
/* Pseudocode
 * imports
 * import graphics, color, font, dimension
 * import image
 * import file, ioexception and imageio
 * import gridlayout, borderlayout and flowlayout
 * import cardLayout
 * import jframe and jpanel
 * import jbutton, jradiobutton
 * import jbuttongroup, jtextfield
 * import jtextarea, jlabel, jslider
 * import jScrollBar and JScrollPane
 * import jmenubar, jmenu and jmenuitem
 * import JCheckBox
 * import actionlistener and actionevent
 * import changeevent and changelistener
 * import FocusListener, Focusevent
 * import Mouseevent and mouselistener
 * import adjustmentlistener and adjustmentevent
 * class putittogether
 * 	constructor of putittogether
 * 	main
 * 		create instance of putittogether called pit
 * 		use pit to call run
 * 	run
 * 		set the frame as frame with name PutItTogether
 * 		setSize as 800 by 800    
 * 		set the close operation as exit
 * 		set the top left location as 0,0
 * 		set Resizable as true
 * 		create instance of PutItTogetherHolder called pith
 * 		add pith to the contentpane    
 * 		set it to be visible    
 * class PutItTogetherHolder extends JPanel
 * 	constructor of PutItTogetherHolder
 * 		D&I card layout cards
 * 		set the layout as cards
 * 		create instance of Information called info
 * 		create instance of FIrstPagePanel called fpp
 * 		create instance of FixedPanelHolder called fph
 * 		add fpp to the card layout with identifier of First
 * 		add fph to the card layout with identifier of Home
 * class FirstPagePanel extends JPanel
 * 	D&I FVs PutItTogetherHolder panelCards
 * 	JTextField tfName
 * 	contructor of FirstPagePanel as parameters of PutItTogetherHolder panelCardsIn, CardLzyout cardsIn
 * 		and Information infoIn
 * 		set panelCards as panelCardsIn
 * 		set cards as cardsIn
 * 		set info as infoIn
 * 		set layout as null
 * 		D&I JScrollPane called paneText on intro
 * 		set the verticalpolicy of panetext as always
 * 		set the horizontalpolicy of panetext as when needed
 * 		set the bounds(location) of paneText with top-left corner as 200,100
 * 		with width of 400 and height of 300
 * 		add paneText to the panel
 * 		set tfName with the text enter your name here
 * 		set bounds(location) of tfName with top-left corner as 300,425
 * 		width width of 200 and height of 50
 * 		D&I JCheckBox understand with the text "I understand how the program works"
 * 		set bounds (location) of understand width the top-left corner as 275,500
 * 		with width of 250 and height of 30
 * 		create instance of CheckBoxListener called bl, sending in this
 * 		create instance of NameListener called nl
 * 		create instance of FocusFiedlHandler called ffh 
 * 		addActionListener of understand as bl
 * 		addActionListener of tfName as nl
 * 		addFocuslIstener of tfName as ffh
 * 		add tfName to the panel
 * 		add understand to the panel
 * 	paintComponent has a parameter of Graphics g
 * 		refresh the graphics
 * 		set the color as red
 * 		set the font as a new font of serif plainw ith size of 15
 * 		if the name in info and the text of tfName are both blank
 * 			draw a string telling the user the enter their name starting at x value of 510
 * 			with a y baseline of 460
 * 			set the text opf tfName as enter your name here
 * 	class CheckBoxListener implements ActionListener
 * 		D&I FV FirstPagePanel fpp
 * 		contructor of CheckBoxListener takes in FirstPagePanel fppIn
 * 			set fpp as fppIn
 * 			actionPerformed has a parameter of ActionEvent evt
 * 			D&I string command as the actionCommand of the event
 *			if the name in info is empty
 * 				refresh graphics of fpp
 * 				set the text of tfName as empty
 * 			else
 * 				show the home panel of card layout(layout of panel panelCards)
 * 	class NameListener implements ActionListener
 * 		actionPerformed has a parameter of ActionEvent evt
 * 			set string command as the action command of event
 * 				set the name in info as command
 * 	class FocusFieldHandler implements focusListener
 * 		focusGained has a parameter of focusevent evt
 * 			set text of textField1 as empty
 * 		focusLost has a parameter of focusevent evt
 * class FixedPanelHolder extends JPanel
 * 	D&I FVs JButton homeButton
 * 	HomePanelHolder hph
 * 	constructor of fixedPanelHolder has a parameter of information infoIn
 * 		set the layout as a borderlayout
 * 		set hph as an instance of homepanelholder, sending in infoIn
 * 		add hph to the center of the borderlayout
 * 		set homeButton as a JButton labeled home
 * 		create instance of homelistener called hl
 * 		add hl as the action listener of homebutton
 * 		D&I JPanel buttonHolder
 * 		add homebutton to the buttonHolder
 * 		add the buttonHolder to the south of the layout
 * 	class HomeListener implements ActionListener
 * 		actionPerformed has a parameter of ActionEvent evt
 * 			show the panel HomePanel of the return of getcardlayout of hph
 * 			(with the panel being hph)
 * class HomePanelHolder extends JPanel
 * 	D&I FVs image picture
 * 	string pictName
 * 	and cardLayout cards
 * 	constructor of HomePanelHolder has a parameter of Information infoIn
 * 		set cards as a new cardLayout
 * 		set the alyout as cards
 * 		set pictName as GoodAndEvil.jpg
 * 		try
 * 			set picture as the imageio reading og a new file with the anem of pictname
 * 		catch a ioexception e
 * 			tell the user that the file cannot be found
 * 			print all the errors
 * 		create instance of HomePanel called hph
 * 		sending in infoIn, this panel and cards
 * 		create instance of BothPictPanel called bc
 * 		sending in picture and this panel
 * 		create instance of MyPictPanel called mpc
 * 		sending in picture and this panel
 * 		create instance of FriendPictPnael of fpc
 * 		sending in picture and this panel
 * 		create instance of DrawPanel called dp
 * 		create instance of RobotPanel called robot
 * 		add hph to the panel, with identifier of HomePanel
 * 		add bc to the panel, with identifier of BothPic
 * 		add mpc to the panel, with identifier of Perry
 * 		add fpc to the panel, with identifier of Doofenshmirtz
 * 		add dp to the panel, with identifier of Shape
 * 		add robot to the panel, with identifier of Masterpiece
 * 		show the panel HomePanel of the cards ;layout
 * 		(with the panel being this)
 * 	public getCardLayout returns a card layout
 * 		return cards
 * class HomePanel extends JPanel
 * 	Declare FVs Information info
 * 	HomePanelHolder panelCards
 * 	CardLayout cards
 * 	JLabel welcome
 * 	constructor of HomePanel has parameters of Information infoIn, HomePanelHolder panelCardsIn
 * 	and CardLayout cardsIn
 * 		set the layout as null
 * 		set panelCards as panelCardsIn
 * 		set cards as cardsIn
 * 		set info as infoIn
 * 		set welcome as a new JLabel with the text Welcome
 * 		set font of welcome as a welcome of serif plain font of size 20
 * 		set bounds of 50,10 as the top-left corner with 750 width and 50 height
 * 		add welcome to the panel
 * 		D&I JTectArea into with the text
 * 		D&I JScrollPane paneText on intro
 * 		set font of intro as a serif plain font with size 20
 * 		set linewrapping of intro to true
 * 		set wrapping stayle as words as true
 * 		set editing of intro as false
 * 		set the verticalpolicy of panetext as always
 * 		set the horizontalpolicy of panetext as when needed
 * 		set the bounds(location) of paneText with top-left corner as 200,100
 * 		with width of 400 and height of 300
 * 		add paneText to the panel
 * 		set bg as a buttongroup
 * 		create instance of RButtonHandler called rbh
 * 		set infoPicButton as a JRadioButton titled Info
 * 		add infoPicButton to bg
 * 		set bounds (location) of infoPicButton with the top-left corner as 225,400 with wdith of 350 and height of 50
 * 		add listener rbh to infoPicButton
 * 		add infoPicButton to panel
 * 		set shapeButton as a JRadioButton titled Change the color and size of a square
 * 		add shapeButton to bg
 * 		set bounds (location) of shapeButton with the top-left corner as 225,450 with wdith of 350 and height of 50
 * 		add listener rbh to shapeButton
 * 		add shapeButton to panel
 * 		set masterpieceButton as a JRadioButton titled See my masterpiece
 * 		add masterpieceButton to bg
 * 		set bounds (location) of masterpieceButton with the top-left corner as 225,500 with wdith of 350 and height of 50
 * 		add listener rbh to masterpieceButton
 * 		add masterpieceButton to panel
 * 	paint component has a parameter of Grpahics g
 * 		refresh the graphics
 * 		set the font as a new font of serif bold with size 20
 * 		set text of welcome as welcome plus the name in info
 * 	class RButtonHandler implements ActionListener
 * 		actionPerformed has a parameter of actionevent evt
 * 			set string command as the action command of the event
 * 			if command is
 * 			Info about Perry the Platypus and Dr. Doofenshmirtz
 * 				show the bothpic of card layout(layout of panel panelCards)
 * 			else if the command is
 * 			Change the color and size of a square
 * 				show the shape of card layout(layout of panel panelCards)
 * 			else if the command is
 * 			See my masterpiece
 * 				show the masterpiece of card layout(layout of panel panelCards)
 * class BothPicPanel extends JPanel and implements MouseListener
 * 	Declare FVs HomePanelHolder homeCards, Image picture
 * 	constructor of BothPictPanel takes in Image pictureIn and HomePanelHolder homeCardsIn
 * 		set homeCards as homeCardsIn
 * 		set picture as pictureIn
 * 		set layout as flow
 * 		add a mouselistener
 * 	paintCOmponent has a parameter of graphics g
 * 		refreshes the graphics
 * 		draw the image picture with top-left corner as 50,100 with width of 700 and height of 600
 * 		and an image observer this
 * 	public void mousePressed has a parameter of Mousevent evt
 * 		D&I int xMouse as x value of event
 * 		D&I int yMouse as the y value of the event
 * 		if the click is in the side for the left character
 * 			show the panel Perry of the return of getcardlayout of homeCards
 * 			(with the panel being homeCards)
 * 		else if the click is in the side of the right character
 * 			show the panel Doofenshmirtz of the return of getcardlayout of homeCards
 * 			(with the panel being homeCards)
 * 	public void mouseReleased has a parameter of Mousevent evt
 * 	mouseClicked has a parameter of mousevent evt
 * 	mouseEntered has a parameter of mousevent evt
 * 	mouseExited has a parameter of mousevent evt
 * class MyPictPanel extends JPanel and implements ActionListener
 * 	D&I FVs image picture and HomePanelHolder homeCards
 * 	constructor of MyPictPanel has parameters of image pictureIn and HomePanelHolder homeCardsIn
 * 		set picture as pictureIn
 * 		set homeCards as homeCardsIn
 * 		D&I JButton goFriendPanel with the text
 * 		add actionListener to goFriendPanel as this panel
 * 		set layout as null
 * 		D&I JLabel name with the name
 * 		D&I JLabel birth with the DOB
 * 		D&I JLabel age with the age
 * 		D&I JLabel hobbies with the hobbies
 * 		D&I Font font as a serif bold font with size 20
 * 		set font of name as font
 * 		set font of birth as font
 * 		set font of age as font
 * 		set font of hobbies as font
 * 		set bounds(location) of name with top-left corner as 450,100 width width of 300 and height of 120
 * 		set bounds(location) of birth with top-left corner as 450,220 width width of 300 and height of 120
 * 		set bounds(location) of age with top-left corner as 450,340 width width of 300 and height of 120
 * 		set bounds(location) of age with top-left corner as 450,460 width width of 300 and height of 120
 * 		set bounds(location) of goFriendPanel with top-left corner as 450,580 width width of 300 and height of 120
 * 		add name to the panel
 * 		add birth to the panel
 * 		add age to the panel
 * 		add hobbies to the panel
 * 		add goFriendPanel to the panel
 * 	paintComponent has a parameter of graphics g
 * 		refresh the graphics
 * 		draw image picture
 * 		with top left corner of the destination being 50,100, bottom right corner of destination being 400,700
 * 		top-right corner of crop being 0,0, bottom right corner of the crop being 350,600, with an imageObserver being this panel
 * 	actionPerformed has a parameter of actionevent evt
 * 		show the panel Doofenshmirtz of the return of getcardlayout of homeCards
 *		(with the panel being homeCards)
 * class FriendPictPanel extends JPanel and implements ActionListener
 * 	D&I FVs image picture and HomePanelHolder homeCards
 * 	constructor of MyPictPanel has parameters of image pictureIn and HomePanelHolder homeCardsIn
 * 		set picture as pictureIn
 * 		set homeCards as homeCardsIn
 * 		D&I JButton goMyPanel with the text
 * 		add actionListener to goMyPanel as this panel
 * 		D&I JLabel name with the name
 * 		D&I JLabel birth with the DOB
 * 		D&I JLabel age with the age
 * 		D&I JLabel hobbies with the hobbies
 * 		D&I Font font as a serif bold font with size 20
 * 		set font of name as font
 * 		set font of birth as font
 * 		set font of age as font
 * 		set font of hobbies as font
 * 		set bounds(location) of name with top-left corner as 450,100 width width of 300 and height of 120
 * 		set bounds(location) of birth with top-left corner as 450,220 width width of 300 and height of 120
 * 		set bounds(location) of age with top-left corner as 450,340 width width of 300 and height of 120
 * 		set bounds(location) of age with top-left corner as 450,460 width width of 300 and height of 120
 * 		set bounds(location) of goMyPanel with top-left corner as 450,580 width width of 300 and height of 120
 * 		add name to the panel
 * 		add birth to the panel
 * 		add age to the panel
 *		 add hobbies to the panel
 * 		add goMyPanel to the panel
 * 	paintComponent has a parameter of graphics g
 * 		refresh the graphics
 * 		draw image picture
 * 	actionPerformed has a parameter of actionevent evt
 * 		show the panel Perry of the return of getcardlayout of homeCards
 * 		(with the panel being homeCards)
 * class DrawPanel extends JPanel
 * 	Declare FVs RIghtPanel rp
 *  int amtRed,amtGreen,amtBlue,size
 *  constructor of DrawPanel
 *  	set amtRed,amtBlue,amtGreen all to 0
 *  	set size as 0
 *  	set layout as a borderlayout
 *  	create instance of left panel called lp
 * 		set rp as an instance of RightPanel
 *  	setDimension of rp as 300 by 700
 * 		add lp to the center of the layout
 *  	add rp to the east of the layout
 * class LeftPanel extends JPanel
 *  Declare FVs JSlider red,green,blue
 *  constructor of LeftPanel
 *  	set layout as a grid layout with 4 rows and 1 column
 *  	create instance of ColorListener called cl
 *  	set red as a horizontal JSlider with min 0 max 255 start 0
 *  	set tick spacing every 16 of red
 *  	paint ticks of red
 *  	set labels every 16 for red
 *  	paint labels for red
 *  	add changelistener cl for red
 *  	set green as a horizontal JSlider with min 0 max 255 start 0
 *  	set tick spacing every 16 of green
 *  	paint ticks of green
 *  	set labels every 16 for green
 *  	paint labels for green
 *  	add changelistener cl for green
 *  	set blue as a horizontal JSlider with min 0 max 255 start 0
 *  	set tick spacing every 16 of blue
 *  	paint ticks of blue
 *  	set labels every 16 for blue
 *  	paint labels for blue
 *  	add changelistener cl for blue
 *  	D&I horizontal JScrollBar size starting value 0
 *  	create SizeListener sl
 *  	add sl as adjustmentlistener of size
 *  	set preferred size of scrollbar 500 by 100
 *  	create scrollHolder panel
 *  	add size to scrollHolder
 *  	add red green blue to panel
 *  	add scrollHolder to panel
 * 	class ColorListener implements ChangeListener
 *  	stateChanged parameter ChangeEvent evt
 *  		if source is red 
 * 				set amtRed value
 *  		else if source is green 
 * 				set amtGreen value
 *  		else if source is blue 
 * 				set amtBlue value
 *  		repaint rp
 * class RightPanel extends JPanel
 *  paintComponent(Graphics g)
 *  	refresh graphics
 *  	set color using amtRed amtGreen amtBlue
 *  	draw filled rectangle centered using size
 * class SizeListener implements AdjustmentListener
 *  adjustmentValueChanged event
 *  	set size as event value
 *  	repaint rp
 * class RobotPanel extends JPanel
 *  constructor
 *  	set background color RGB(10,15,41)
 *  paintComponent(Graphics g)
 *  	call robotDrawArms
 *  	call robotDrawBody
 *  	call drawSentence
 *  robotDrawArms(Graphics g)
 *  	set gray color
 *  	draw 4 arc arms (top/bottom left/right)
 *  	set black border arcs
 *  	draw inner arcs with background color
 *  	draw left arm polygon fill and outline
 *  	draw bottom left arm polygon fill and outline
 *  	draw bottom right arm polygon fill and outline
 *  	draw top right arm polygon fill and outline
 *  robotDrawBody(Graphics g)
 *  	set gray color
 *  	draw body rectangle
 *  	set black outline
 *  	draw eyes red
 *  	draw mouth arc black
 *  	draw ears polygons left and right
 *  	draw antenna lines
 *  drawSentence(Graphics g)
 *  	set white color
 *  	set serif bold font size 40
 *  	draw string “Say HI!!”
 * class Information
 *  declare String name
 *  constructor sets name empty
 *  getName returns name
 *  setName assigns nameIn to name
 * Testing plan:
 * Not entering a name or leaving the namefield blank prompts user to enter name and only moves on after that.
 * The radio buttons lead to their panels, the scroll bar for the text area works. Clicking on perry leads
 * to perry, clicking on Doofenshmirtz lead to him. The button for the other person leads to the other person. The
 * sliders of the colors update the color of the square, the size scroll bar updates the size as well.
 * The masterpiece is shown properly and clicking the home button works in every panel
 */

/// imports
import java.awt.Graphics; //import graphics, color, font, dimension
import java.awt.Color;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.Image; //import image

import java.io.File; //import file, ioexception and imageio
import java.io.IOException;
import javax.imageio.ImageIO;

import java.awt.GridLayout; //import gridlayout, borderlayout and flowlayout
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.CardLayout;//import cardLayout

import javax.swing.JFrame;    //import jframe and jpanel
import javax.swing.JPanel;

import javax.swing.JButton; //import jbutton, jradiobutton
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;//import jbuttongroup, jtextfield
import javax.swing.JTextField;
import javax.swing.JTextArea;//import jtextarea, jlabel, jslider
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JScrollBar; //import jScrollBar and JScrollPane
import javax.swing.JScrollPane;
import javax.swing.JMenuBar;//import jmenubar, jmenu and jmenuitem
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JCheckBox;//import JCheckBox
import java.awt.event.ActionListener;//import actionlistener and actionevent
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeEvent;//import changeevent and changelistener
import javax.swing.event.ChangeListener;
import java.awt.event.FocusListener;    //import FocusListener, Focusevent
import java.awt.event.FocusEvent;
import java.awt.event.MouseListener; //import Mouseevent and mouselistener
import java.awt.event.MouseEvent;
import java.awt.event.AdjustmentListener;//import adjustmentlistener and adjustmentevent
import java.awt.event.AdjustmentEvent;

public class PutItTogether//class putittogether
{	
	public PutItTogether()//constructor of putittogether
	{
	}
	
	public static void main(String [] args)//main
	{
		PutItTogether pit = new PutItTogether();//create instance of putittogether called pit
		pit.run();//use pit to call run
	}
	
	public void run()//run
	{
		JFrame frame = new JFrame("PutItTogether");//set the frame as frame with name PutItTogether
		frame.setSize( 800, 800);//setSize as 800 by 800	
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE); //set the close operation as exit
		frame.setLocation(0,0);//set the top left location as 0,0
		frame.setResizable(true);//set Resizable as true
		PutItTogetherHolder pith = new PutItTogetherHolder();//create instance of PutItTogetherHolder called pith
		frame.getContentPane().add( pith );	//add pith to the contentpane	
		frame.setVisible(true);	//set it to be visible	
	}
}

// this panel holds the main cards/panel 
class PutItTogetherHolder extends JPanel//class PutItTogetherHolder extends JPanel
{	
	public PutItTogetherHolder()//constructor of PutItTogetherHolder
	{
		setBackground(Color.CYAN);//set color of background as cyan

		CardLayout cards = new CardLayout();//D&I card layout cards
		setLayout(cards);//set the layout as cards
		
		Information info = new Information();//create instance of Information called info
		FirstPagePanel fpp = new FirstPagePanel(this, cards, info);//create instance of FIrstPagePanel called fpp
		FixedPanelHolder fph = new FixedPanelHolder(info);//create instance of FixedPanelHolder called fph
		
		add(fpp, "First");//add fpp to the card layout with identifier of First
		add(fph, "Home");//add fph to the card layout with identifier of Home
	}
}

class FirstPagePanel extends JPanel//class FirstPagePanel extends JPanel
{
    private PutItTogetherHolder panelCards;//D&I FVs PutItTogetherHolder panelCards
    private CardLayout cards;//CardLayout cards
    private Information info;//Information info
    private JTextField tfName;//JTextField tfName
    
    public FirstPagePanel(PutItTogetherHolder panelCardsIn, CardLayout cardsIn, Information infoIn)
    //contructor of FirstPagePanel as parameters of PutItTogetherHolder panelCardsIn, CardLzyout cardsIn
    //and Information infoIn
    {
        panelCards = panelCardsIn;//set panelCards as panelCardsIn
        cards = cardsIn;//set cards as cardsIn
        info = infoIn;//set info as infoIn
        setLayout(null);//set layout as null
        JTextArea intro = new JTextArea("Welcome to PutItTogether.java. This program uses most of the component and layout step that we have learnt."
        +"\nOnce you enter your name and click the checkbox stating that you understand the program, you will be a shown a new page which you can "+
        "choose to open a panel to:\n1. see information about two people(Perry the platypus and Dr. Doofenshirmtz)\n2. a panel to change the size and colour"+
        " of a square\n3. a panel to view my masterpiece.\nThere will always be a button to go back to the HomeScreen.");//D&I JTextArea intro with the text
        JScrollPane paneText = new JScrollPane(intro);//D&I JScrollPane called paneText on intro
        intro.setFont(new Font("serif",Font.PLAIN, 20));//set font of intro as a serif plain font with size 20
        intro.setLineWrap(true);//set linewrapping of intro to true
        intro.setWrapStyleWord(true);//set wrapping stayle as words as true
        intro.setEditable(false);//set editing of intro as false
        paneText.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        //set the verticalpolicy of panetext as always
        paneText.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        //set the horizontalpolicy of panetext as when needed
        paneText.setBounds(200,100,400,300);//set the bounds(location) of paneText with top-left corner as 200,100
        //with width of 400 and height of 300
        add(paneText);//add paneText to the panel
        tfName = new JTextField("Enter your name here");//set tfName with the text enter your name here
        tfName.setBounds(300,425,200,50);//set bounds(location) of tfName with top-left corner as 300,425
        //width width of 200 and height of 50
        JCheckBox understand = new JCheckBox("I understand how the program works");
        //D&I JCheckBox understand with the text "I understand how the program works"
        understand.setBounds(275,500,250,30);//set bounds (location) of understand width the top-left corner as 275,500
        //with width of 250 and height of 30
        CheckBoxListener bl = new CheckBoxListener(this);
        //create instance of CheckBoxListener called bl, sending in this
        NameListener nl = new NameListener();
        //create instance of NameListener called nl
        FocusFieldHandler ffh =new FocusFieldHandler();
        //create instance of FocusFiedlHandler called ffh 
        understand.addActionListener(bl);//addActionListener of understand as bl
        tfName.addActionListener(nl);//addActionListener of tfName as nl
        tfName.addFocusListener(ffh);//addFocuslIstener of tfName as ffh
        add(tfName);//add tfName to the panel
        add(understand);//add understand to the panel
    }
    public void paintComponent(Graphics g)//paint component has a parameter of graphics g
    {
		super.paintComponent(g);//refreshes
		g.setColor(Color.RED);//set the color as red
		g.setFont(new Font("Serif",Font.PLAIN,15));//set the font as a new font of serif plainw ith size of 15
		if(info.getName().equals("")&&tfName.getText().equals(""))
		//if the name in info and the text of tfName are both blank
		{
			g.drawString("Please enter your name",510,460);
			//draw a string telling the user the enter their name starting at x value of 510
			//with a y baseline of 460
			tfName.setText("Enter your name here");
			//set the text opf tfName as enter your name here
		}
	}
    class CheckBoxListener implements ActionListener//class CheckBoxListener implements ActionListener
    {
		private FirstPagePanel fpp;//D&I FV FirstPagePanel fpp
		public CheckBoxListener(FirstPagePanel fppIn)//contructor of CheckBoxListener takes in FirstPagePanel fppIn
		{
			fpp=fppIn;//set fpp as fppIn
		}
        public void actionPerformed(ActionEvent evt)//actionPerformed has a parameter of ActionEvent evt
        {
            String command = evt.getActionCommand();//D&I string command as the actionCommand of the event
            if(info.getName().equals(""))//if the name in info is empty
            {
				fpp.repaint();//refresh graphics of fpp
                tfName.setText("");//set the text of tfName as empty
            }
            else//else
            {
                cards.show(panelCards,"Home");//show the home panel of card layout(layout of panel panelCards)
            }
        }
    }
    class NameListener implements ActionListener//class NameListener implements ActionListener
    {
        public void actionPerformed(ActionEvent evt)//actionPerformed has a parameter of ActionEvent evt
        {
            String command = evt.getActionCommand();//set string command as the action command of event
            info.setName(command);//set the name in info as command
        }
    }
    class FocusFieldHandler implements FocusListener//class FocusFieldHandler implements focusListener
    {
        public void focusGained(FocusEvent evt) //focusGained has a parameter of focusevent evt
        {
            tfName.setText("");//set text of textField1 as empty
        }
        public void focusLost(FocusEvent evt) {} //focusLost has a parameter of focusevent evt
    }
}

class FixedPanelHolder extends JPanel//class FixedPanelHolder extends JPanel
{
    private JButton homeButton;//D&I FVs JButton homeButton
    private HomePanelHolder hph;//HomePanelHolder hph
    public FixedPanelHolder(Information infoIn)//constructor of fixedPanelHolder has a parameter of information infoIn
    {
        setLayout(new BorderLayout());//set the layout as a borderlayout
        hph = new HomePanelHolder(infoIn);//set hph as an instance of homepanelholder, sending in infoIn
        add(hph,BorderLayout.CENTER);//add hph to the center of the borderlayout
        homeButton = new JButton("Home");//set homeButton as a JButton labeled home
        HomeListener hl = new HomeListener();//create instance of homelistener called hl
        homeButton.addActionListener(hl);//add hl as the action listener of homebutton
        JPanel buttonHolder = new JPanel();//D&I JPanel buttonHolder
        buttonHolder.add(homeButton);//add homebutton to the buttonHolder
        add(buttonHolder,BorderLayout.SOUTH);//add the buttonHolder to the south of the layout
    }
    class HomeListener implements ActionListener//class HomeListener implements ActionListener
    {
		public void actionPerformed(ActionEvent evt)//actionPerformed has a parameter of ActionEvent evt
		{
			hph.getCardLayout().show(hph,"HomePanel");//show the panel HomePanel of the return of getcardlayout of hph
			//(with the panel being hph)
		}
	}
}

class HomePanelHolder extends JPanel//class HomePanelHolder extends JPanel
{
    private Image picture;//D&I FVs image picture
    private String pictName;//string pictName
    private CardLayout cards;//and cardLayout cards
    
    public HomePanelHolder (Information infoIn)//constructor of HomePanelHolder has a parameter of Information infoIn
    {
		cards = new CardLayout();//set cards as a new cardLayout
        setLayout(cards);//set the alyout as cards
        pictName="GoodAndEvil.jpg";//set pictName as GoodAndEvil.jpg
        try//try
        {
			picture = ImageIO.read(new File(pictName));//set picture as the imageio reading og a new file with the anem of pictname
		}
		catch(IOException e)//catch a ioexception e
		{
			System.err.println("\n\n" +pictName+" can't be found.\n\n");//tell the user that the file cannot be found
            e.printStackTrace();//print all the errors
		}
        HomePanel hph = new HomePanel(infoIn,this,cards);//create instance of HomePanel called hph
        //sending in infoIn, this panel and cards
        BothPictPanel bc = new BothPictPanel(picture,this);//create instance of BothPictPanel called bc
        //sending in picture and this panel
        MyPictPanel mpc = new MyPictPanel(picture,this);//create instance of MyPictPanel called mpc
        //sending in picture and this panel
        FriendPictPanel fpc = new FriendPictPanel(picture,this);//create instance of FriendPictPnael of fpc
        //sending in picture and this panel
        DrawPanel dp = new DrawPanel();//create instance of DrawPanel called dp
        RobotPanel robot = new RobotPanel();//create instance of RobotPanel called robot
        add(hph, "HomePanel");//add hph to the panel, with identifier of HomePanel
        add(bc,"BothPic");//add bc to the panel, with identifier of BothPic
        add(mpc,"Perry");//add mpc to the panel, with identifier of Perry
        add(fpc,"Doofenshmirtz");//add fpc to the panel, with identifier of Doofenshmirtz
        add(dp,"Shape");//add dp to the panel, with identifier of Shape
        add(robot, "Masterpiece");//add robot to the panel, with identifier of Masterpiece
        cards.show(this,"HomePanel");//show the panel HomePanel of the cards ;layout
			//(with the panel being this)
		
    }

    public CardLayout getCardLayout()//public getCardLayout returns a card layout
    {
        return cards;//return cards
    }
}

class HomePanel extends JPanel//class HomePanel extends JPanel
{
    private Information info;//Declare FVs INformation info
    private HomePanelHolder panelCards;//HomePanelHolder panelCards
    private CardLayout cards;//CardLayout cards
    private JLabel welcome;//JLabel welcome
    // Since the label for the name was created when the classes constructor was called
    // it needs to be updated after the user types in the name into the text field.
    // Update that label in paintComponent.
    public HomePanel(Information infoIn,HomePanelHolder panelCardsIn, CardLayout cardsIn)
    //constructor of HomePanel has parameters of Information infoIn, HomePanelHolder panelCardsIn
    //and CardLayout cardsIn
    {
        setLayout(null);//set the layout as null
        panelCards=panelCardsIn;//set panelCards as panelCardsIn
        cards = cardsIn;//set cards as cardsIn
        info = infoIn;//set info as infoIn
        welcome = new JLabel("Welcome ");//set welcome as a new JLabel with the text Welcome
        welcome.setFont(new Font("serif",Font.PLAIN, 20));
        //set font of welcome as a welcome of serif plain font of size 20
        welcome.setBounds(50,10,750,50);//set bounds of 50,10 as the top-left corner with 750 width and 50 height
        add(welcome);//add welcome to the panel
        JTextArea intro = new JTextArea("Welcome to PutItTogether.java. This program uses most of the component and layout step that we have learnt."
        +"\nOnce you enter your name and click the checkbox stating that you understand the program, you will be a shown a new page which you can "+
        "choose to open a panel to:\n1. see information about two people(Perry the platypus and Dr. Doofenshirmtz)\n2. a panel to change the size and colour"+
        " of a square\n3. a panel to view my masterpiece.\nThere will always be a button to go back to the HomeScreen.");
        //D&I JTectArea into with the text
        JScrollPane paneText = new JScrollPane(intro);//D&I JScrollPane paneText on intro
        intro.setFont(new Font("serif",Font.PLAIN, 20));//set font of intro as a serif plain font with size 20
        intro.setLineWrap(true);//set linewrapping of intro to true
        intro.setWrapStyleWord(true);//set wrapping stayle as words as true
        intro.setEditable(false);//set editing of intro as false
        paneText.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        //set the verticalpolicy of panetext as always
        paneText.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        //set the horizontalpolicy of panetext as when needed
        paneText.setBounds(200,100,400,300);//set the bounds(location) of paneText with top-left corner as 200,100
        //with width of 400 and height of 300
        add(paneText);//add paneText to the panel
        ButtonGroup bg = new ButtonGroup();   //set bg as a buttongroup     
        RButtonHandler rbh = new RButtonHandler();//create instance of RButtonHandler called rbh
        JRadioButton infoPicButton = new JRadioButton("Info about Perry the Platypus and Dr. Doofenshmirtz");//set infoPicButton as a JRadioButton titled Info
        bg.add(infoPicButton);                    // add infoPicButton to bg
        infoPicButton.setBounds(225,400,350,50); //set bounds (location) of infoPicButton with the top-left corner as 225,400 with wdith of 350 and height of 50
        infoPicButton.addActionListener(rbh);     // add listener rbh to infoPicButton
		add(infoPicButton);                // add infoPicButton to panel             
		JRadioButton shapeButton = new JRadioButton( "Change the color and size of a square" );//set shapeButton as a JRadioButton titled Change the color and size of a square
		bg.add( shapeButton );        // add shapeButton to bg
		shapeButton.setBounds(225,450,350,50); //set bounds (location) of shapeButton with the top-left corner as 225,450 with wdith of 350 and height of 50
		shapeButton.addActionListener(rbh);         // add listener rbh to shapeButton
		add( shapeButton );                   // add shapeButton to panel   
		JRadioButton masterpieceButton = new JRadioButton( "See my masterpiece" );    //set masterpieceButton as a JRadioButton titled See my masterpiece
		bg.add( masterpieceButton );        // add masterpieceButton to bg    
		masterpieceButton.setBounds(225,500,350,50); //set bounds (location) of masterpieceButton with the top-left corner as 225,500 with wdith of 350 and height of 50
		masterpieceButton.addActionListener(rbh);     // add listener rbh to masterpieceButton              
		add(masterpieceButton ); // add masterpieceButton to panel  
    }
    public void paintComponent(Graphics g)//paint component has a parameter of Grpahics g
    {
        super.paintComponent(g);//refresh the graphics
        setFont(new Font("Serif",Font.BOLD, 20));//set the font as a new font of serif bold with size 20
        welcome.setText("Welcome "+info.getName()+"!!");//set text of welcome as welcome plus the name in info
        
    }
    class RButtonHandler implements ActionListener//class RButtonHandler implements ActionListener
    {
		public void actionPerformed( ActionEvent evt ) //actionPerformed has a parameter of actionevent evt
        {
			String command = evt.getActionCommand();//set string command as the action command of the event
			if ( command.equals( "Info about Perry the Platypus and Dr. Doofenshmirtz" ) )//if command is 
			//Info about Perry the Platypus and Dr. Doofenshmirtz
				cards.show(panelCards,"BothPic"); //show the bothpic of card layout(layout of panel panelCards)
			else if ( command.equals( "Change the color and size of a square" ) )//else if the command is 
			//Change the color and size of a square
                cards.show(panelCards,"Shape"); //show the shape of card layout(layout of panel panelCards)
            else if ( command.equals( "See my masterpiece" ) )    //else if the command is
            //See my masterpiece
				cards.show(panelCards,"Masterpiece"); //show the masterpiece of card layout(layout of panel panelCards)
        }
	}
}

class BothPictPanel extends JPanel implements MouseListener//class BothPicPanel extends JPanel and implements MouseListener
{
	private HomePanelHolder homeCards;//Declare FVs HomePanelHolder homeCards, Image picture 
	private Image picture;
    public BothPictPanel(Image pictureIn, HomePanelHolder homeCardsIn)
    //constructor of BothPictPanel takes in Image pictureIn and HomePanelHolder homeCardsIn
    {
		homeCards=homeCardsIn;//set homeCards as homeCardsIn
		picture=pictureIn;//set picture as pictureIn
        setLayout(new FlowLayout());//set layout as flow
        addMouseListener(this);//add a mouselistener
    }
    public void paintComponent(Graphics g)//paintCOmponent has a parameter of graphics g
    {
		super.paintComponent(g);//refreshes the graphics
		g.drawImage(picture,50,100,700,600,this);//draw the image picture with top-left corner as 50,100 with width of 700 and height of 600 
		//and an image observer this
	}
    public void mousePressed ( MouseEvent evt ) //public void mousePressed has a parameter of Mousevent evt
    {
		int xMouse = evt.getX();//D&I int xMouse as x value of event
        int yMouse = evt.getY();//D&I int yMouse as the y value of the event
        
        if ((50 <= xMouse && xMouse <=400) && (100 < yMouse && yMouse <= 700 ))
        //if the click is in the side for the left character
            homeCards.getCardLayout().show(homeCards,"Perry");//show the panel Perry of the return of getcardlayout of homeCards
			//(with the panel being homeCards)
        else if ((400 <= xMouse && xMouse <=750) && (100 < yMouse && yMouse <= 700 ))
        //else if the click is in the side of the right character
            homeCards.getCardLayout().show(homeCards,"Doofenshmirtz");//show the panel Doofenshmirtz of the return of getcardlayout of homeCards
			//(with the panel being homeCards)
    }
    public void mouseReleased ( MouseEvent evt ) {} 
    //public void mouseReleased has a parameter of Mousevent evt
    public void mouseClicked ( MouseEvent evt )
    //mouseClicked has a parameter of mousevent evt
    {
    }
    public void mouseEntered ( MouseEvent evt ) {}
    //mouseEntered has a parameter of mousevent evt
    public void mouseExited ( MouseEvent evt ) {}
    //mouseExited has a parameter of mousevent evt
}

class MyPictPanel extends JPanel implements ActionListener
//class MyPictPanel extends JPanel and implements ActionListener
{
	private Image picture;//D&I FVs image picture and HomePanelHolder homeCards
	private HomePanelHolder homeCards;
	public MyPictPanel(Image pictureIn, HomePanelHolder homeCardsIn)
	//constructor of MyPictPanel has parameters of image pictureIn and HomePanelHolder homeCardsIn
	{
		picture=pictureIn;//set picture as pictureIn
		homeCards=homeCardsIn;//set homeCards as homeCardsIn
		JButton goFriendPanel = new JButton("<html><center>See info for<br>" +	
		"the other person </center>	</html>");
		//D&I JBUtton goFriendPanel with the text
		goFriendPanel.addActionListener(this);
		//add actionListener to goFriendPanel as this panel
		setLayout(null);//set layout as null
		JLabel name = new JLabel("Name: Perry the Platypus");
		//D&I JLabel name with the name
		JLabel birth = new JLabel("Birth Date: April 3rd, 2014");
		//D&I JLabel birth with the DOB
		JLabel age = new JLabel("Age: 21");
		//D&I JLabel age with the age
		JLabel hobbies = new JLabel("<html>Hobbies: Spy on villains<br> and be a good pet");
		//D&I JLabel hobbies with the hobbies
		Font font = new Font("Serif", Font.BOLD, 20);
		//D&I Font font as a serif bold font with size 20
		name.setFont(font);//set font of name as font
		birth.setFont(font);//set font of birth as font
		age.setFont(font);//set font of age as font
		hobbies.setFont(font);//set font of hobbies as font
		name.setBounds(450,100,300,120);//set bounds(location) of name with top-left corner as 450,100 width width of 300 and height of 120
		birth.setBounds(450,220,300,120);//set bounds(location) of birth with top-left corner as 450,220 width width of 300 and height of 120
		age.setBounds(450,340,300,120);//set bounds(location) of age with top-left corner as 450,340 width width of 300 and height of 120
		hobbies.setBounds(450,460,300,120);//set bounds(location) of age with top-left corner as 450,460 width width of 300 and height of 120
		goFriendPanel.setBounds(450,580,300,120);//set bounds(location) of goFriendPanel with top-left corner as 450,580 width width of 300 and height of 120
		add(name);//add name to the panel
		add(birth);//add birth to the panel
		add(age);//add age to the panel
		add(hobbies);//add hobbies to the panel
		add(goFriendPanel);//add goFriendPanel to the panel
	}
	public void paintComponent(Graphics g)//paintComponent has a parameter of graphics g
    {
		super.paintComponent(g);//refresh the graphics
		g.drawImage(picture,50,100,400,700,0,0,350,600,this);//draw image picture
		//with top left corner of the destination being 50,100, bottom right corner of destination being 400,700
		//top-right corner of crop being 0,0, bottom right corner of the crop being 350,600, with an imageObserver being this panel
	}
    public void actionPerformed(ActionEvent evt)//actionPerformed has a parameter of actionevent evt
    {
		homeCards.getCardLayout().show(homeCards,"Doofenshmirtz");//show the panel Doofenshmirtz of the return of getcardlayout of homeCards
			//(with the panel being homeCards)
	}
}


class FriendPictPanel extends JPanel implements ActionListener//class MyPictPanel extends JPanel and implements ActionListener
{
	private Image picture;//D&I FVs image picture and HomePanelHolder homeCards
	private HomePanelHolder homeCards;
	public FriendPictPanel(Image pictureIn, HomePanelHolder homeCardsIn)
	//constructor of MyPictPanel has parameters of image pictureIn and HomePanelHolder homeCardsIn
	{
		picture=pictureIn;//set picture as pictureIn
		homeCards=homeCardsIn;//set homeCards as homeCardsIn
		JButton goMyPanel = new JButton("<html><center>See info for<br>" +	
		"the other person </center>	</html>");
		//D&I JBUtton goMyPanel with the text
		goMyPanel.addActionListener(this);
		//add actionListener to goMyPanel as this panel
		setLayout(null);
		JLabel name = new JLabel("Name: Dr. Doofenshmirtz");
		//D&I JLabel name with the name
		JLabel birth = new JLabel("Birth Date: March 7th, 1982");
		//D&I JLabel birth with the DOB
		JLabel age = new JLabel("Age: 44");
		//D&I JLabel age with the age
		JLabel hobbies = new JLabel("<html>Hobbies: Create crazy<br> contraptions to show Perry</html>");
		//D&I JLabel hobbies with the hobbies
		Font font = new Font("Serif", Font.BOLD, 20);
		//D&I Font font as a serif bold font with size 20
		name.setFont(font);//set font of name as font
		birth.setFont(font);//set font of birth as font
		age.setFont(font);//set font of age as font
		hobbies.setFont(font);//set font of hobbies as font
		name.setBounds(450,100,300,120);//set bounds(location) of name with top-left corner as 450,100 width width of 300 and height of 120
		birth.setBounds(450,220,300,120);//set bounds(location) of birth with top-left corner as 450,220 width width of 300 and height of 120
		age.setBounds(450,340,300,120);//set bounds(location) of age with top-left corner as 450,340 width width of 300 and height of 120
		hobbies.setBounds(450,460,300,120);//set bounds(location) of age with top-left corner as 450,460 width width of 300 and height of 120
		goMyPanel.setBounds(450,580,300,120);//set bounds(location) of goMyPanel with top-left corner as 450,580 width width of 300 and height of 120
		add(name);//add name to the panel
		add(birth);//add birth to the panel
		add(age);//add age to the panel
		add(hobbies);//add hobbies to the panel
		add(goMyPanel);//add goMyPanel to the panel
	}
	public void paintComponent(Graphics g)//paintComponent has a parameter of graphics g
    {
		super.paintComponent(g);//refresh the graphics
		g.drawImage(picture, 50,100,400,700,350,0,700,600,this);//draw image picture
		//with top left corner of the destination being 50,100, bottom right corner of destination being 400,700
		//top-right corner of crop being 350,0, bottom right corner of the crop being 700,600, with an imageObserver being this panel
	}
    public void actionPerformed(ActionEvent evt)//actionPerformed has a parameter of actionevent evt
    {
		homeCards.getCardLayout().show(homeCards,"Perry");//show the panel Perry of the return of getcardlayout of homeCards
			//(with the panel being homeCards)
	}
}

class DrawPanel extends JPanel//class DrawPanel extends JPanel
{
    private RightPanel rp;//Declare FVs RIghtPanel rp
    private int amtRed, amtGreen, amtBlue;//int amtRed,amtGreen,amtBlue,size
    private int size;
    
    public DrawPanel()//constructor of DrawPanel
    {
		amtRed=0;//set amtRed,amtBlue,amtGreen all to 0
		amtBlue=0;
		amtGreen=0;
		size=0;//set size as 0
        setLayout(new BorderLayout());//set layout as a borderlayout
        LeftPanel lp = new LeftPanel();//create instance of left panel called lp
        rp = new RightPanel();//set rp as an instance of RightPanel
        rp.setPreferredSize(new Dimension(300,700));//setDimension of rp as 300 by 700
        add(lp,BorderLayout.CENTER);//add lp to the center of the layout
        add(rp,BorderLayout.EAST);//add rp to the east of the layout
    }
    public class LeftPanel extends JPanel//class LeftPanel extends JPanel
    {
		private JSlider red,green,blue;//Declare FVs JSlider red,green,belu
		public LeftPanel()//constructor of LeftPanel
		{
			setLayout(new GridLayout(4,1));//set layout as a grid layout with 4 rows and 1 column
			ColorListener cl = new ColorListener();//create instance of ColorListener called cl
			red = new JSlider(JSlider.HORIZONTAL,0,255,0);//set red as a horizontal JLsider with min at 0, max at 255, and starts at 0
			red.setMajorTickSpacing(16); //set tick spacing every 16 of red  
            red.setPaintTicks(true);//paint the ticks of red
            red.setLabelTable( red.createStandardLabels(16) ); //set labels every 16 for red
            red.setPaintLabels(true);//paint labels for red
            red.addChangeListener(cl);//add the changelistener cl for red
			green = new JSlider(JSlider.HORIZONTAL,0,255,0);//set green as a horizontal JLsider with min at 0, max at 255, and starts at 0
			green.setMajorTickSpacing(16);  //set tick spacing every 16 of green   
            green.setPaintTicks(true);//paint the ticks of green
            green.setLabelTable( green.createStandardLabels(16) ); //set labels every 16 for green
            green.setPaintLabels(true);//paint labels for green
            green.addChangeListener(cl);//add the changelistener cl for green
			blue = new JSlider(JSlider.HORIZONTAL,0,255,0);//set green as a horizontal JLsider with min at 0, max at 255, and starts at 0
			blue.setMajorTickSpacing(16);     //set tick spacing every 16 of green  
            blue.setPaintTicks(true);//paint the ticks of green
            blue.setLabelTable( blue.createStandardLabels(16) ); //set labels every 16 for green
            blue.setPaintLabels(true);//paint labels for green
            blue.addChangeListener(cl);//add the changelistener cl for green
			JScrollBar size = new JScrollBar(JScrollBar.HORIZONTAL,0,10,0,100);//D&I  horizontal JScrollBar size with starting value of 0
			//size of scroller as 10, min value of 0, max value of 100
			SizeListener sl = new SizeListener();//create instance of sizelistener called sl
			size.addAdjustmentListener(sl);//add sl as an adjustmentlistener of size
			size.setPreferredSize(new Dimension(500,100));//set dimension of size width width of 500 and height of 100
            JPanel scrollHolder = new JPanel();//create JPanel scrollHolder
            scrollHolder.add(size);//add size of scrollHolder
            add(red);//add red to the panel
            add(green);//add green to the panel
            add(blue);//add blue to the panel
			add(scrollHolder);//add scrollHolder to the panel
		}
		class ColorListener implements ChangeListener//class color Listener implements changeListener
		{
			public void stateChanged(ChangeEvent evt)//stateCHanged has a parameter of changeEvent evt
			{
				if(evt.getSource()==red)//if the source of event if red
				{
					amtRed=red.getValue();//set amtRed as value of red
				}
				else if(evt.getSource()==green)//else if the source of event if green
				{
					amtGreen=green.getValue();//set amtGreen as value of green
				}
				else if(evt.getSource()==blue)//else if the source of event if blue
				{
					amtBlue=blue.getValue();//set amtBlue as value of blue
				}
				rp.repaint();//refresh rp
			}
		}
    }
    
    public class RightPanel extends JPanel//class rightpanel extends JPanel
    {
		public void paintComponent(Graphics g)//paintComponent has a parameter of Graphics g
		{
			super.paintComponent(g);//refresh the graphics
			g.setColor(new Color(amtRed,amtGreen,amtBlue));//set color with rgb values of amtRed, amtGreen, amtBlue
			g.fillRect((100-(size/2)),(300-(size/2)),100+size,100+size);//draw a filled in rectangle(square)
			//with top-left corner as 100-size/2,300-size/2 with width and height as 100+size
		}
    }
    class SizeListener implements AdjustmentListener //class SLiderListener implements ChangeListener
    {
		public void adjustmentValueChanged (AdjustmentEvent evt) //stateChanged has a parameter of changeevent evt
        {
			size =evt.getValue(); //set size as the value of the event
			rp.repaint();//refresh the rp
        }
    }
}

class RobotPanel extends JPanel//RobotPanel class which extends JPanel
{
	public RobotPanel()//constructor
	{
		Color background = new Color(10,15,41);//D&I color backgorund as a color with RGB values of 10,15 and 41
		setBackground(background);//set background as the color of background as background
	}
	public void paintComponent(Graphics g)//paintComponent has the parameter of Grpahics g
	{
		super.paintComponent(g);//call the super's paintComponent sending in g
		robotDrawArms(g);//call robotDrawArms senign in g
		robotDrawBody(g);//call robotDrawBody, sending in g
		drawSentence(g);//call drawSentence, senging in g
	}
    public void robotDrawArms(Graphics g)//robotDrawArms with parameter of Grpahics g
	{
		g.setColor(Color.GRAY);//set color as gray
		g.fillArc(50,50,100,100,0,-180);//draw a sector in a rectangle with top left corner being 50,50
		//with width and height of 100, starting at 0 degree and goes 180 clockwise (top left hand)
		g.fillArc(650,50,100,100,0,-180);//draw a sector in a rectangle with top left corner being 650,50
		//with width and height of 100, starting at 0 degree and goes 180 clockwise (top right hand)
		g.fillArc(50,650,100,100,0,180);//draw a sector in a rectangle with top left corner being 50,650
		//with width and height of 100, starting at 0 degree and goes 180 anti clockwise (bottom left hand)
		g.fillArc(650,650,100,100,0,180);//draw a sector in a rectangle with top left corner being 650,650
		//with width and height of 100, starting at 0 degree and goes 180 anti clockwise (bottom right hand)
		g.setColor(Color.BLACK);//set color as black
		g.drawArc(50,50,100,100,0,-180);//draw an arc in a rectangle with top left corner being 50,50
		//with width and height of 100, starting at 0 degree and goes 180 clockwise (border of top left hand)
		g.drawArc(650,50,100,100,0,-180);//draw an arc in a rectangle with top left corner being 650,50
		//with width and height of 100, starting at 0 degree and goes 180 clockwise (border of top right hand)
		g.drawArc(50,650,100,100,0,180);//draw an arc in a rectangle with top left corner being 50,650
		//with width and height of 100, starting at 0 degree and goes 180 anti clockwise (border of bottom left hand)
		g.drawArc(650,650,100,100,0,180);//draw an arc in a rectangle with top left corner being 650,650
		//with width and height of 100, starting at 0 degree and goes 180 anti clockwise (border of bottom right hand)
		g.setColor(new Color(10,15,41));//set color as a color with RGB values of 10,15 and 41
		g.fillArc(75,75,50,50,0,-180);//draw a sector in a rectangle with top left corner being 75,75
		//with width and height of 50, starting at 0 degree and goes 180 clockwise (inner part of top left hand)
		g.fillArc(675,75,50,50,0,-180);//draw a sector in a rectangle with top left corner being 675,75
		//with width and height of 50, starting at 0 degree and goes 180 clockwise (inner part of top right hand)
		g.fillArc(75,675,50,50,0,180);//draw a sector in a rectangle with top left corner being 75,675
		//with width and height of 50, starting at 0 degree and goes 180 anti clockwise (inner part of bottom left hand)
		g.fillArc(675,675,50,50,0,180);//draw a sector in a rectangle with top left corner being 675,675
		//with width and height of 50, starting at 0 degree and goes 180 anti clockwise (inner part of bottom right hand)
        g.setColor(Color.GRAY);//set color as Gray
        int[] lineArrayX= new int[]{90,110,220,200};//D&I values of int array lineArrayX as 90,110,220,200
        int[] lineArrayY = new int[]{150,150,310,310};//D&I values of int array lineArrayY as 150,150,310,310
		g.fillPolygon(lineArrayX,lineArrayY,4);//fill a polygon with x values of lineArrayX, y values of lineArrayY
		//with 4 vertices (top left arm)
		g.setColor(Color.BLACK);//set color as Black
		g.drawPolygon(lineArrayX,lineArrayY,4);//draw a polygon with x values of lineArrayX, y values of lineArrayY
		//with 4 vertices (outline of top left arm)
		g.setColor(Color.GRAY);//set color as Gray
		lineArrayX= new int[]{90,110,220,200};//set values of lineArrayX as 90,110,220,200
		lineArrayY = new int[]{650,650,490,490};//set values of lineArrayY as 650,650,490,490
		g.fillPolygon(lineArrayX,lineArrayY,4);//fill a polygon with x values of lineArrayX, y values of lineArrayY
		//with 4 vertices (bottom left arm)
		g.setColor(Color.BLACK);//set color as Black
		g.drawPolygon(lineArrayX,lineArrayY,4);//draw a polygon with x values of lineArrayX, y values of lineArrayY
		//with 4 vertices (outline of bottom left arm)
		g.setColor(Color.GRAY);//set color as Gray
		lineArrayX= new int[]{710,690,580,600};//set values of lineArrayX as 710,690,580,600
		lineArrayY = new int[]{650,650,490,490};//set values of lineArrayY as 650,650,490,490
		g.fillPolygon(lineArrayX,lineArrayY,4);//fill a polygon with x values of lineArrayX, y values of lineArrayY
		//with 4 vertices (bottom right arm)
		g.setColor(Color.BLACK);//set color as Black
		g.drawPolygon(lineArrayX,lineArrayY,4);//draw a polygon with x values of lineArrayX, y values of lineArrayY
		//with 4 vertices (outline of bottom right arm)
		g.setColor(Color.GRAY);//set color as Gray
		lineArrayX= new int[]{710,690,580,600};//set values of lineArrayX as 710,690,580,600
		lineArrayY = new int[]{150,150,310,310};//set values of lineArrayY as 150,150,310,310
		g.fillPolygon(lineArrayX,lineArrayY,4);//fill a polygon with x values of lineArrayX, y values of lineArrayY
		//with 4 vertices (top right arm)
		g.setColor(Color.BLACK);//set color as Black
		g.drawPolygon(lineArrayX,lineArrayY,4);//draw a polygon with x values of lineArrayX, y values of lineArrayY
		//with 4 vertices (outline of top right arm)
	}
    public void robotDrawBody(Graphics g)//robotDrawBody takes in the parameter of Graphics g
    {
		g.setColor(Color.GRAY);//set color as gray
        g.fillRect(200,300,400,200);//draw a filled in rectagle with top left corner being 200,300
        //with width of 400 and height of 200 (body)
        g.setColor(Color.BLACK);//set color as black
        g.drawRect(200,300,400,200);//draw a rectagle with top left corner being 200,300
        //with width of 400 and height of 200 (outline of body)
        g.setColor(Color.RED);//set color as red
		g.fillOval(275,350,50,50);//draw a filled in circle (oval) in a square (rectangle) with the
		//top left corner being 275,350 and the width and height as 50 (left eye)
		g.fillOval(475,350,50,50);//draw a filled in circle (oval) in a square (rectangle) with the
		//top left corner being 475,350 and the width and height as 50 (right eye)
		g.setColor(Color.BLACK);//set color as black
		g.fillArc(300,400,200,75,0,-180);//draw a sector in a rectangle with top left corner being 300,400
		//with width of 200 and height of 75, starting at 0 degree and goes 180 clockwise (mouth)
		g.setColor(Color.GRAY);//set color as gray
		int[] earArrayX= new int[]{80,160,200,160,80};//D&I values of int array earArrayX as 80,160,200,160,80
        int[] earArrayY = new int[]{360,360,400,440,440};//D&I values of int array earArrayY as 360,360,400,440,440
		g.fillPolygon(earArrayX,earArrayY,5);//fill a polygon with x values of earArrayX, y values of earArrayY
		//with 5 vertices (left ear)
		g.setColor(Color.BLACK);//set color as black
		g.drawPolygon(earArrayX,earArrayY,5);//draw a polygon with x values of earArrayX, y values of earArrayY
		//with 5 vertices (outline of left ear)
		g.setColor(Color.GRAY);//set color as gray
		earArrayX= new int[]{720,640,600,640,720};//set values of earArrayX as 720,640,600,640,720
		g.fillPolygon(earArrayX,earArrayY,5);//fill a polygon with x values of earArrayX, y values of earArrayY
		//with 5 vertices (right ear)
		g.setColor(Color.BLACK);//set color as black
		g.drawPolygon(earArrayX,earArrayY,5);//draw a polygon with x values of earArrayX, y values of earArrayY
		//with 5 vertices (outline of right ear)
		g.setColor(Color.GRAY);//set color as Gray
		g.drawLine(300,300,250,200);//draw a line with one point being 300,300
		//and the other point being 250,200 (left antenna)
		g.drawLine(500,300,550,200);//draw a line with one point being 500,300
		//and the other point being 500,300(right antenna)
    }
    public void drawSentence(Graphics g)//drawSentence takes in the prameter of Graphics g
    {
		g.setColor(Color.WHITE);//set the color as white
		g.setFont(new Font("serif",Font.BOLD,40));//set font as a new font, type of serif
		//bold and size of 40
		g.drawString("Say HI!!",325,150);//draw a string saying hi, starting from x value of 325, with a baseline of y value of 150
	}
}

class Information//class Information
{
    private String name;//D&I Fv String name
    
    public Information()//constructor of Information
    {
        name = "";//set name as empty
    }
    
    public String getName()//getName returns String
    {
        return name;//return name
    }
    
    public void setName(String nameIn)//setName takes in String nameIn
    {
        name = nameIn;//set name as nameIn
    }
}
