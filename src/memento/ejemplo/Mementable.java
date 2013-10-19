package memento.ejemplo;

public interface Mementable<T> {
	T createMemento();

	void restoreMemento(T memento);
}