package com.best.java.factoryPattern;

public abstract class PizzStore {
	public Pizz orderPizz(String type) {
		Pizz pizz = createPizz(type);
		pizz.prepare();
		pizz.bake();
		pizz.cut();
		pizz.box();
		return pizz;
	}

	protected abstract Pizz createPizz(String str);
}
