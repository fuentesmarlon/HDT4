import java.util.Vector;

public class StackVector<E> implements Stack<E>{
	
	protected Vector<E> data;
	
	public StackVector(){
		this.data = new Vector<E>();
	}
	
	@Override
	public void push(E item) {
		// TODO Auto-generated method stub
		data.add(item);
	}

	@Override
	public E pop() {
		// TODO Auto-generated method stub
		return this.data.remove(data.size()-1);
	}

	@Override
	public E peek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean empty() {
		// TODO Auto-generated method stub
		return size()==0;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.data.size();
	}

}