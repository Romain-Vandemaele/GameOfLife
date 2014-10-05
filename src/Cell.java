


public class Cell {
	
	boolean state_=false;
	boolean futureState_=false;
	String representation_=new String("0");
	
	public Cell() {}
	
	public Cell(boolean initialState) {
		state_=initialState;
	}
	
	public void updateState() {
		if(state_!=futureState_) { //représentation change
			if(representation_==new String("0")) {
				representation_=new String("1");
			}
			else {
				representation_=new String("0");
			}
		}
		state_=futureState_;
	}
	
	public void setFutureState(boolean futureState) {
		futureState_=futureState;
	}
	
	
	
	public boolean getState() {
		return state_;
	}
	
	public boolean getFutureState() {
		return futureState_;	
	}
	
	public String toString() {
		return representation_;
	}
	
	
}
