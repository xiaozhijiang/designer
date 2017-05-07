package kfc;

import kfc1.Meal;
import kfc1.MealBuilder;

public class KFCWaiter1 {
	private mealbuilder mb;
	private food sw;
	private drink dl;
	public void setA()
	{
		this.mb=new mealbuilderA();
		sw=mb.createfood();
		dl=mb.createdrink();
		sw.Food();
		dl.drink();
	}
	public void setB()
	{
		this.mb=new mealbuilderB();
		sw=mb.createfood();
		dl=mb.createdrink();
		sw.Food();
		dl.drink();
	}

	
}
