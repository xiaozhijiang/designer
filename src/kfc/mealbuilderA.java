package kfc;

public class mealbuilderA extends mealbuilder{

	@Override
	public food createfood() {
		// TODO �Զ����ɵķ������
		return new foodA();
	}

	@Override
	public drink createdrink() {
		// TODO �Զ����ɵķ������
		return new drinkA();
	}


}
