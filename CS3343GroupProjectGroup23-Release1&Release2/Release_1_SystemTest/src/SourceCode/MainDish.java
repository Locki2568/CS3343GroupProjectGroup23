package SourceCode;
import java.util.ArrayList;

public class MainDish extends Food
{
	
	public MainDish(String foodName, Main.foodType foodType, String price)
	{
		super(foodName,foodType,price);
	}
	
	public String getFoodName()
	{
		return this.foodName;
	}
	
	public Main.foodType getFoodType()
	{
		return this.foodType;
	}
	
	public String getPrice()
	{
		return this.price;
	}
}
