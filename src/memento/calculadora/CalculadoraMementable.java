package memento.calculadora;

import memento.ejemplo.Mementable;
import memento.ejemplo.Memento;
import command.calculadora.Calculadora;

public class CalculadoraMementable extends Calculadora implements Mementable<Memento>{

	@Override
	public Memento createMemento() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void restoreMemento(Memento memento) {
		// TODO Auto-generated method stub
		
	}

}
