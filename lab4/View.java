package lab4;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionListener;
import javax.swing.*;

public class View extends JFrame
{
	
	private JTextField input1;
	private JTextField input2;
	private JTextField input3;
	
	private JTextField tinput1;
	private JTextField tinput2;
	private JTextField tinput3;
	
	private JTextField linput1;
	private JTextField linput2;
	private JTextField linput3;
	private JTextField linput4;
	
	private JTextField sinput1;
	private JTextField sinput2;
	
	private JTextField iinput1;
	private JTextField iinput2;
	
	public JButton aButton,bButton, calculate;
	private JLabel title,output,toutput,loutput,soutput,month,year;
	private JLabel netIncome, totalExpense, highMonth, lowMonth, savings, yearHouse, yearTrans, yearLive, yearLife, mIncome;
	private JLabel TLabel;
	private JLabel house1,house2,house3, trans1,trans2,trans3, live1,live2,live3,live4;
	private JLabel dine, vacation,income, tax;
	
	
	private JPanel myPanel,buttonPanel, transpanel, lpanel, spanel, ipanel;

	public void setEventListener(ActionListener listener)
	{
		aButton.addActionListener(listener);
		bButton.addActionListener(listener);
		calculate.addActionListener(listener);
	}
//Living Expenses
	public String getInput1()
	{
		return input1.getText();
	}
	public String getInput2()
	{
		return input2.getText();
	}
	
	public String getInput3()
	{
		return input3.getText();
	}
	
	
//Transportation Expenses
	public String getTinput1()
	{
		return tinput1.getText();
	}
	public String getTinput2()
	{
		return tinput2.getText();
	}
	public String getTinput3()
	{
		return tinput3.getText();
	}
	
//living Expenses
	public String getLinput1()
	{
		return linput1.getText();
	}
	
	public String getLinput2()
	{
		return linput2.getText();
	}
	public String getLinput3()
	{
		return linput3.getText();
	}
	public String getLinput4()
	{
		return linput4.getText();
	}
	
	//lifestyle
	public String getSinput1()
	{
		return sinput1.getText();
	}
	public String getSinput2()
	{
		return sinput2.getText();
	}
	//Income and tax
	public String getIinput1()
	{
		return iinput1.getText();
	}
	public String getIinput2()
	{
		return iinput2.getText();
	}

	//Setting Input Box
	public void setInput1(String input)
	{
		this.input1.setText(input);
	}
	public void setInput2(String input)
	{
		this.input2.setText(input);
	}
	public void setInput3(String input)
	{
		this.input3.setText(input);
	}
	
	public void setTinput1(String input)
	{
		this.tinput1.setText(input);
	}
	
	public void setTinput2(String input)
	{
		this.tinput2.setText(input);
	}
	
	public void setTinput3(String input)
	{
		this.tinput3.setText(input);
	}
	
	public void setLinput1(String input)
	{
		this.linput1.setText(input);
	}
	
	public void setLinput2(String input)
	{
		this.linput2.setText(input);
	}
	
	public void setLinput3(String input)
	{
		this.linput3.setText(input);
	}
	
	public void setLinput4(String input)
	{
		this.linput4.setText(input);
	}
	
	public void setSinput1(String input)
	{
		this.sinput1.setText(input);
	}
	
	public void setSinput2(String input)
	{
		this.sinput2.setText(input);
	}
	
	public void setIinput1(String input)
	{
		this.iinput1.setText(input);
	}
	
	public void setIinput2(String input)
	{
		this.iinput2.setText(input);
	}
	
	//
	public void setMonth(String monthString)
	{
		this.month.setText(monthString);
	}

	public void setOutput(String ouputString)
	{
		this.output.setText(ouputString);
	}
	
	public void setToutput(String toutputString)
	{
		this.toutput.setText(toutputString);
	}
	
	public void setLoutput(String loutputString)
	{
		this.loutput.setText(loutputString);
	}
	
	public void setSoutput(String soutputString)
	{
		this.soutput.setText(soutputString);
	}
//CALCULATIONS
	public void setYoutput(String youtputString)
	{
		this.year.setText(youtputString);
	}
	public void setIoutput(String youiputString)
	{
		this.netIncome.setText(youiputString);
	}
	public void setTotaloutput(String youiputString)
	{
		this.totalExpense.setText(youiputString);
	}
	public void setHoutput(String youhputString)
	{
		this.highMonth.setText(youhputString);
	}
	
	public void setLowoutput(String youlowputString)
	{
		this.lowMonth.setText(youlowputString);
	}
	public void setyHoutput(String yhoutputString)
	{
		this.yearHouse.setText(yhoutputString);
	}
	public void setyToutput(String ytoutputString)
	{
		this.yearTrans.setText(ytoutputString);
	}
	public void setyLioutput(String output)
	{
		this.yearLive.setText(output);
	}
	public void setLfoutput(String output)
	{
		this.yearLife.setText(output);
	}
	public void setSaveoutput(String output)
	{
		this.savings.setText(output);
	}
	public void setNextmonth(String newName)
	{
		this.aButton.setText(newName);
	}
	public void setTLabel(String newName)
	{
		this.TLabel.setText(newName);
	}
	View()
	{
		super("Monthly Expenses Calculation");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setBackground(Color.CYAN);
		setSize(800,800);
		setLayout(null);
		input1 = new JTextField(20);
		input2 = new JTextField(20);
		input3 = new JTextField(20);
		
		tinput1 = new JTextField(20);
		tinput2 = new JTextField(20);
		tinput3 = new JTextField(20);
		toutput = new JLabel();
		
		
		linput1 = new JTextField(14);
		linput2 = new JTextField(14);
		linput3 = new JTextField(14);
		linput4 = new JTextField(14);

		sinput1 = new JTextField(15);
		sinput2 = new JTextField(15);
		
		iinput1 = new JTextField(15);
		iinput2 = new JTextField(15);
		year = new JLabel();
		netIncome = new JLabel("Net income: ");
		totalExpense = new JLabel("Annual Expense: ");
		highMonth = new JLabel("Highest Month Spending: ");
		lowMonth = new JLabel("Lowest Month Spending:");
		savings = new JLabel("Annual Savings: ");
		yearHouse = new JLabel("Annual House Expenses: ");
		yearTrans = new JLabel("Annual Transportation Expenses: ");
		yearLive = new JLabel("Annual Living Expenses: ");
		yearLife = new JLabel("Annual Lifestyle Expenses: ");
		TLabel = new JLabel();
		add(totalExpense);
		add(highMonth);
		add(lowMonth);
		add(netIncome);
		add(year);
		add(savings);
		add(yearHouse);
		add(yearTrans);
		add(yearLive);
		add(yearLife);
		add(TLabel);
		yearHouse.setBounds(350,530,250,20);
		yearTrans.setBounds(350,560,250,20);
		yearLive.setBounds(350,590,250,20);
		yearLife.setBounds(350,620,250,20);
		totalExpense.setBounds(50,560,250,20);
		year.setBounds(10, 480, 250, 20);
		TLabel.setBounds(330, 405, 250, 20);
		netIncome.setBounds(50,530,250,20);
		highMonth.setBounds(50,590,250,20);
		lowMonth.setBounds(50,620,250,20);
		savings.setBounds(50,650,250,20);
		ipanel = new JPanel();
		add(ipanel);
		ipanel.add(iinput1);
		ipanel.add(iinput2);
		ipanel.setBounds(90, 400, 200, 300);
		ipanel.setBackground(Color.cyan);
		
		
		spanel = new JPanel();
		lpanel = new JPanel();
		loutput = new JLabel();
		soutput = new JLabel();
		add(spanel);
		spanel.add(sinput1);
		spanel.add(sinput2);
		spanel.add(soutput);
		spanel.setBackground(Color.cyan);
		spanel.setBounds(37,340,700,60);
		
		
		add(lpanel);
		lpanel.add(linput1);
		lpanel.add(linput2);
		lpanel.add(linput3);
		lpanel.add(linput4);
		lpanel.add(loutput);
		lpanel.setBounds(37,260,700,60);
		lpanel.setBackground(Color.cyan);
		
		aButton = new JButton("Next Month");
		bButton = new JButton("Previous Month");
		calculate = new JButton("Calculate");
		//label
		title = new JLabel("Assignment 4: Living Expenses Calculator");
		output = new JLabel();
		house1 = new JLabel("Rental/Morgage:");
		house2 = new JLabel("Insurance:");
		house3 = new JLabel("Bills:");
		trans1 = new JLabel("Fuel:");
		trans2 = new JLabel("Subscription/Ticket:");
		trans3 = new JLabel("Parking:");
		live1 = new JLabel("Groceries:");
		live2 = new JLabel("Clothing:");
		live3 = new JLabel("Personal Care:");
		live4 = new JLabel("Medication:");
		dine = new JLabel("Dining Out:");
		vacation = new JLabel("Vacation:");
		income = new JLabel("Year Income:");
		tax = new JLabel("Tax %:");
		
		
		add(dine);
		add(vacation);
		dine.setBounds(230,310,100,50);
		vacation.setBounds(395,310,100,50);
		
		add(income);
		add(tax);
		income.setBounds(10, 405, 250, 20);
		tax.setBounds(10, 430, 250, 20);
		add(live1);
		add(live2);
		add(live3);
		add(live4);
		live1.setBounds(65,230,100,50);
		live2.setBounds(230,230,100,50);
		live3.setBounds(395,230,100,50);
		live4.setBounds(560,230,100,50);
		month = new JLabel("Month: 1" );
		//
		lpanel= new JPanel();

		transpanel = new JPanel();
		add(transpanel);
		transpanel.add(tinput1);
		transpanel.add(tinput2);
		transpanel.add(tinput3);
		transpanel.add(toutput);
		transpanel.setBounds(37,180,700,60);
		transpanel.setBackground(Color.cyan);
		add(month);
		add(trans1);
		add(trans2);
		add(trans3);
		add(title);
		title.setBounds(250, 10, 300, 15);
		trans1.setBounds(50,145,100,55);
		trans2.setBounds(280,145,300,55);
		trans3.setBounds(510,145,100,55);
		month.setBounds(700, 30, 300, 15);
		
		myPanel = new JPanel(); 
		myPanel.setBackground(Color.cyan);
		buttonPanel = new JPanel();
		buttonPanel.setBackground(Color.cyan);
		add(buttonPanel);
		
		add(house1);
		add(house2);
		add(house3);
		house1.setBounds(50,65,100,60);
		house2.setBounds(280,65,100,60);
		house3.setBounds(510,65,100,60);
		
		myPanel.setBounds(40,100,700,60);
		add(myPanel);
		myPanel.add(input1);
		myPanel.add(input2);
		myPanel.add(input3);
		
		myPanel.add(output);
		
		buttonPanel.add(bButton);
		buttonPanel.add(calculate);
		buttonPanel.add(aButton);
		
		buttonPanel.setBounds(10,700,750,50);
		
		
		
		setVisible(true);


	}



}
