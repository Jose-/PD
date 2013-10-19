package state.ejemplo;

public class Context {
	private State state;

	public Context() {
		this.state = new StateA();
	}

	public State getState() {
		return this.state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public void action1() {
		state.action1(this);
	}

	public void action2() {
		state.action2(this);
	}

	@Override
	public String toString() {
		return "Context[" + state + "]";
	}
}