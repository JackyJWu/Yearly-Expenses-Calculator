The Controller controls the View and Model.
to run w/ terminal use the cmd java lab4.Controller
1. Input all the data within the JtextfieldBox
2. Click Calculate(Only ONCE because it would input data again into the final calculations)
giving false information
3. after clicking Calculate, click next month and repeat steps 1 and 2.


4. you can freely switch between months, as long as you do not click calculate because it will give you inaccurate data
(when you switch between months, you will see the previous inputted DATA)

*ALWAYS MAKE SURE YOU CLICK CALCULATE (once) before you switch to next MONTH!*


** THERE IS ALSO A BUG WHICH DISPLAYS A DIFFERENT GUI WHEN USING MY LAPTOP INSTEAD
OF MY DESKTOP ** I have included screenshots that accurately displays my GUI

Compilation





package lab4;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;


public class Controller implements ActionListener
{
	public static int Count = 1;

	private View aView;
	private Model expenses = new Model();
	private Model []  Months = new Model[13];
	private float netIncome;
	private int totalSpend;
	private int highMonth=0;
	private int lowMonth = 1000000;
	private int AnnualHouse, AnnualTrans, AnnualLive,AnnualLife, AnnualSave;
	//



	Controller(View aView, Model expenses)
	{
		this.aView = aView;
		this.expenses = expenses;
		

		
		aView.setEventListener((ActionListener) this);		
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		//ADDED
		
		JButton source = (JButton) e.getSource();
		//Model[] Months = new Model[12];
		if (source.getText() == "Calculate")
		{
			
			

		
		int rental = Integer.parseInt(aView.getInput1());
		//Months[Count].setRental(rental);
		expenses.setRental(rental);

		
		int insurance = Integer.parseInt(aView.getInput2());
		//Months[Count].setInsurance(insurance);
		expenses.setInsurance(insurance);
		int bills = Integer.parseInt(aView.getInput3());
		//Months[Count].setBills(bills);
		expenses.setBills(bills);
		//Months[Count].calcHousing();
		expenses.calcHousing();
		//int housingExpense = Months[Count].getHousing();
		int housingExpense = expenses.getHousing();
		aView.setOutput(String.valueOf("Total Housing Expenses:  $"+housingExpense));
		//
		int fuel = Integer.parseInt(aView.getTinput1());
		expenses.setFuel(fuel);
		//Months[Count].setFuel(fuel);
		int ticket = Integer.parseInt(aView.getTinput2());
		expenses.setTix(ticket);
		//Months[Count].setTix(ticket);
		int parking = Integer.parseInt(aView.getTinput3());
		
		expenses.setParking(parking);
		//Months[Count].setParking(parking);
		//Months[Count].calcTransport();
		expenses.calcTransport();
		//int transportExpense = Months[Count].getTransport();
		int transportExpense = expenses.getTransport();
		aView.setToutput(String.valueOf("Total Transport Expenses:  $"+transportExpense));
		
		int groceries = Integer.parseInt(aView.getLinput1());
		
		expenses.setGroceries(groceries);
		//Months[Count].setGroceries(groceries);
		int clothing = Integer.parseInt(aView.getLinput2());
		expenses.setClothing(clothing);
		//Months[Count].setClothing(clothing);
		int personal = Integer.parseInt(aView.getLinput3());
		expenses.setPersonal(personal);
		//Months[Count].setPersonal(personal);
		int medicine = Integer.parseInt(aView.getLinput4());
		expenses.setMedicine(medicine);
		//Months[Count].setMedicine(medicine);
		expenses.calcLiving();
		//Months[Count].calcLiving();
		int livingExpense = expenses.getLiving();
		//int livingExpense = Months[Count].getLiving();
		aView.setLoutput(String.valueOf("Total Living Expenses:  $"+livingExpense));
		//
		int dine = Integer.parseInt(aView.getSinput1());
		expenses.setDine(dine);
		//Months[Count].setDine(dine);
		int vacation = Integer.parseInt(aView.getSinput1());
		expenses.setVacation(vacation);
		//Months[Count].setVacation(vacation);
		//Months[Count].calcLifestyle();
		expenses.calcLifestyle();
		int styleExpense = expenses.getLifestyle();
		//int styleExpense = Months.getLifestyle();
		aView.setSoutput(String.valueOf("Total Lifestyle Expenses:  $"+styleExpense));
		
		int income = Integer.parseInt(aView.getIinput1());
		expenses.setIncome(income);
		//Months[Count].setIncome(income);
		float tax = Float.parseFloat(aView.getIinput2());
		//Months[Count].setTax(tax);
		expenses.setTax(tax);
		expenses.calcMonth();
		Months[Count]= new Model(expenses);
		

	
			aView.setYoutput("Yearly Summary: (UPDATES IN REALTIME)");
			//getting INCOME after Tax
			netIncome = (Months[1].getIncome()-(Months[1].getIncome() * Months[1].getTax()));
			aView.setIoutput(String.valueOf("Net income: $"+netIncome));
			AnnualSave =(int) netIncome;
			totalSpend += Months[Count].getTotal();

			aView.setTotaloutput(String.valueOf("Annual Expense: $"+ totalSpend));

				if(highMonth<Months[Count].getTotal())
				{
					highMonth = Months[Count].getTotal();
				}


				if(lowMonth>Months[Count].getTotal())
				{
					lowMonth = Months[Count].getTotal();
				}
				AnnualHouse += Months[Count].getHousing();
				AnnualTrans += Months[Count].getTransport();
				AnnualLive += Months[Count].getLiving();
				AnnualLife +=Months[Count].getLifestyle();
				AnnualSave -= Months[Count].getTotal();
			aView.setHoutput(String.valueOf("Highest Month Spending: $"+ highMonth));
			aView.setLowoutput(String.valueOf("Lowest Monthly Spending: $"+ lowMonth));
			aView.setyHoutput(String.valueOf("Annual House Expenses: $"+ AnnualHouse));
			aView.setyToutput(String.valueOf("Annual Transportation Expenses: $"+AnnualTrans));
			aView.setyLioutput(String.valueOf("Annual Living Expenses: $"+AnnualLive));
			aView.setLfoutput(String.valueOf("Annual Lifestyle Expenses: $"+AnnualLife));
			aView.setSaveoutput(String.valueOf("Annual Savings: $"+ AnnualSave));
			aView.setTLabel(String.valueOf("Month Total Expense: $"+Months[Count].getTotal()));
		}
		else if (source.getText() == "Previous Month")
		{
			if(Count>1)
			{
				Count--;

				aView.setMonth("Month: "+Count);
				aView.setInput1(String.valueOf(Months[Count].getRental()));
				aView.setInput2(String.valueOf(Months[Count].getInsurance()));


				

				
				aView.setInput1(String.valueOf(Months[Count].getRental()));
				
				aView.setInput2(String.valueOf(Months[Count].getInsurance()));
				aView.setInput3(String.valueOf(Months[Count].getBills()));
				aView.setTinput1(String.valueOf(Months[Count].getFuel()));
				
				aView.setTinput2(String.valueOf(Months[Count].getTranstix()));
				aView.setTinput3(String.valueOf(Months[Count].getParking()));
				aView.setLinput1(String.valueOf(Months[Count].getGroceries()));
				aView.setLinput2(String.valueOf(Months[Count].getClothing()));
				aView.setLinput3(String.valueOf(Months[Count].getPersonal()));
				aView.setLinput4(String.valueOf(Months[Count].getMedicine()));
				aView.setSinput1(String.valueOf(Months[Count].getDine()));
				aView.setSinput2(String.valueOf(Months[Count].getVacation()));
				
						
				aView.setLoutput(String.valueOf("Total Living Expenses:  $"+ Months[Count].getLiving()));
				aView.setToutput(String.valueOf("Total Transport Expenses:  $"+ Months[Count].getTransport()));
				aView.setOutput(String.valueOf("Total Housing Expenses:  $"+ Months[Count].getHousing()));

				
			}
				


		}
		else if (source.getText()== "Next Month")
		{
	
			if (Count<13)
			{
				Count++;
				if(Months[Count]==null)
				{
				aView.setMonth("Month: "+Count);
				

				
				aView.setInput1(null);
				aView.setInput2(null);
				aView.setInput3(null);
				aView.setTinput1(null);
				aView.setTinput2(null);
				aView.setTinput3(null);
				aView.setLinput1(null);
				aView.setLinput2(null); 
				aView.setLinput3(null);
				aView.setLinput4(null);
				aView.setSinput1(null);
				aView.setSinput2(null);
				aView.setOutput(null);
				aView.setToutput(null);
				aView.setLoutput(null);
				aView.setSoutput(null);
				aView.setIinput1(String.valueOf(expenses.getIncome()));
				aView.setIinput2(String.valueOf(expenses.getTax()));
				}
				else if(Months[Count]!=null)
				{
					aView.setMonth("Month: "+Count);



					
					aView.setInput1(String.valueOf(Months[Count].getRental()));
					
					aView.setInput2(String.valueOf(Months[Count].getInsurance()));
					aView.setInput3(String.valueOf(Months[Count].getBills()));
					aView.setTinput1(String.valueOf(Months[Count].getFuel()));
					
					aView.setTinput2(String.valueOf(Months[Count].getTranstix()));
					aView.setTinput3(String.valueOf(Months[Count].getParking()));
					aView.setLinput1(String.valueOf(Months[Count].getGroceries()));
					aView.setLinput2(String.valueOf(Months[Count].getClothing()));
					aView.setLinput3(String.valueOf(Months[Count].getPersonal()));
					aView.setLinput4(String.valueOf(Months[Count].getMedicine()));
					aView.setSinput1(String.valueOf(Months[Count].getDine()));
					aView.setSinput2(String.valueOf(Months[Count].getVacation()));
					
							
					aView.setLoutput(String.valueOf("Total Living Expenses:  $"+ Months[Count].getLiving()));
					aView.setToutput(String.valueOf("Total Transport Expenses:  $"+ Months[Count].getTransport()));
					aView.setOutput(String.valueOf("Total Housing Expenses:  $"+ Months[Count].getHousing()));
					
				}
			}

		}
	
		
		

	}

	public static void main(String []args)
	{
		View aView = new View();
		Model aStudent = new Model();
		Controller thisController = new Controller(aView, aStudent);

	}


}











