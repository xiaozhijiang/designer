package kfc;

public class mealbuilderB extends mealbuilder{
	@Override
	public food createfood() {
		// TODO �Զ����ɵķ������
		return new foodB();
	}

	@Override
	public drink createdrink() {
		// TODO �Զ����ɵķ������
		return new drinkB();
	}
}
