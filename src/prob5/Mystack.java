package prob5;

public class Mystack implements Stack {
	int top=-1;
	String[] buffer;
	public Mystack(int a){
		this.buffer = new String[a];
	}
	private void resize(){
		String[] a=buffer;
		buffer=new String[buffer.length*2];
		for(int i=0;i<a.length;i++){
			buffer[i]=a[i];
		}
	}
	@Override
	public void push(String item) {
		// TODO Auto-generated method stub
		
		if(top+1==buffer.length){
			resize();
		}
		
		top++;
		buffer[top]=item;
	}

	@Override
	public String pop() throws MyStackException {
		
		if(top==-1){
			throw new MyStackException();
		}
		top--;
		return buffer[top+1];
	}

	@Override
	public boolean isEmpty() {
		if(top==-1){
			return true;
		}
		else{
			return false;
		}
	}

	@Override
	public int size() {
		
		return 0;
	}

}
