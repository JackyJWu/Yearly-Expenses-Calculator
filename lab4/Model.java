package lab4;

public class Model
{

	public Model()
	{
		
	}
	public Model(Model other)
	{
		this.bills = other.bills;
		this.rental = other.rental;
		this.insurance = other.insurance;
		this.fuel = other.fuel;
		this.transtix = other.transtix;
		this.parking = other.parking;
		this.groceries = other.groceries;
		this.clothing = other.clothing;
		this.personal = other.personal;
		this.medicine = other.medicine;
		this.lifestyleExpense = other.lifestyleExpense;
		this.housingExpense = other.housingExpense;
		this.transportExpense = other.transportExpense;
		this.livingExpense = other.livingExpense;
		this.income = other.income;
		this.dine = other.dine;
		this.vacation = other.vacation;
		this.tax = other.tax;
		this.totalMonth=other.totalMonth;
	}
	//ADDED
	public int rental, insurance, bills, fuel, transtix, parking, groceries, clothing, personal, medicine, dine,vacation;
	public int housingExpense, transportExpense, livingExpense, lifestyleExpense, income, totalMonth;
	public float tax;
	
	public void setHousing(int housing)
	{
		this.housingExpense = housing;
	}
	public void setRental(int rental)
	{
		
		this.rental = rental;
	}
	public void setInsurance(int insurance)
	{
		this.insurance = insurance;
	}
	public void setBills(int bills)
	{
		this.bills = bills;
	}
	public void calcMonth()
	{
		totalMonth= (housingExpense+transportExpense+livingExpense+lifestyleExpense);
	}
	public int getTotal()
	{
		return totalMonth;
	}
	//
	public int getRental()
	{
		return rental;
	}
	public int getInsurance()
	{
		return insurance;
	}
	public int getBills()
	{
		return bills;
	}
	public int getFuel()
	{
		return fuel;
	}
	public int getTranstix()
	{
		return transtix;
	}
	public int getParking()
	{
		return parking;
	}
	public int getGroceries()
	{
		return groceries;
	}
	public int getClothing()
	{
		return clothing;
	}
	public int getPersonal()
	{
		return personal;
	}
	public int getMedicine()
	{
		return medicine;
	}
	public int getDine()
	{
		return dine;
	}
	public int getVacation()
	{
		return vacation;
	}
	//
	public void calcHousing()
	{
		housingExpense = insurance + rental + bills;
	}
	public int getHousing()
	{
		return housingExpense;
	}
	//
	public void setTransport(int transit)
	{
		this.transportExpense = transit;
	}
	public void setFuel(int fuel)
	{
		this.fuel = fuel;
	}
	public void setTix(int transtix)
	{
		this.transtix = transtix;
	}
	public void setParking(int parking)
	{
		this.parking = parking;
	}
	public void calcTransport()
	{
		transportExpense = fuel + transtix + parking;
	}
	public int getTransport()
	{
		return transportExpense;
	}
	
	public void setLiving(int living)
	{
		this.livingExpense = living;
	}
	
	public void setGroceries(int groceries)
	{
		this.groceries = groceries;
	}
	
	public void setClothing(int clothing)
	{
		this.clothing = clothing;
	}
	public void setPersonal(int personal)
	{
		this.personal = personal;
	}
		public void setMedicine(int medicine)
	{
		this.medicine = medicine;
	}
		
	public void calcLiving()
	{
		livingExpense = groceries + clothing + personal + medicine;
	}
	public int getLiving()
	{
		return livingExpense;
	}
	//
	public void setVacation(int vacation)
	{
		this.vacation = vacation;
	}
	public void setDine(int dine)
	{
		this.dine = dine;
	}
	public void calcLifestyle()
	{
		lifestyleExpense = vacation+dine;
	}
	public int getLifestyle()
	{
		return lifestyleExpense;
	}
	
	public void setIncome(int income)
	{
		this.income = income;
	}
	
	public int getIncome()
	{
		return income;
	}
	
	public void setTax(float tax)
	{
	
		this.tax = (tax/100);
	}
	
	public float getTax()
	{
		return tax;
	}
	

	


}














