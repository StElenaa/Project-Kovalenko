package com.company.lesson9.fruitShop;

abstract class Fruit {
	private float weight;

	public Fruit(float weight) {
		super();
		this.weight = weight;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public abstract float costFruit();

	public final void  printManufacturerInfo() {
		System.out.print("Made in Ukraine");
	}

	public abstract String toString();
	
	public static void main(String[] args) {
		Fruit[] fruits = new Fruit[] { new Apple(2.0f, 21.3f), new Apple(2.5f, 12.3f), new Pear(3.0f, 15.5f),
				new Pear(1.5f, 17.0f), new Apricot(2.0f, 35.0f), new Apricot(1.5f, 35.0f) };
		float fullCost = 0;
		float appleCost = 0;
		float pearCost = 0;
		float apricotCost = 0;
		for (Fruit fruit : fruits) {
			fullCost = fullCost + fruit.costFruit();
			if ("Apple".equals(fruit.toString())) {
				appleCost = appleCost + fruit.costFruit();
			} else if ("Pear".equals(fruit.toString())) {
				pearCost = pearCost + fruit.costFruit();
			} else {
				apricotCost = apricotCost + fruit.costFruit();
			}
		}

		System.out.print("Производитель: ");
		fruits[0].printManufacturerInfo();
		System.out.println("\nОбщая стоимость проданных фруктов = " + fullCost);
		System.out.println("Стоимость проданных яблок = " + appleCost);
		System.out.println("Стоимость проданных груш = " + pearCost);
		System.out.println("Стоимость проданных абрикос = " + apricotCost);
	}
}
