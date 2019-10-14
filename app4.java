class dynamicstack implements increment{
	int a[];
	int top, size;
	
	dynamicstack (int s) {
		top = -1;
		size = s;
		a = new int [size];
	}
	
	public void push(int p) {
		int i;
		if(top == (size-1)) {
			size = size * 2;
			int temp[] = new int[size];
			for(i = 0; i < a.length; i++) {
				temp[i] = a[i];
				
			}
			a = temp;
			top++;
			a[top]=p;
		}
		else
			a[++top] = p;
	}
	
	public int pop() {
		if(top == -1) {
			System.out.println("Stack is already empty");
			return 0;
		}
		else {
			int d = a[top];
			top--;
			return d;
		}
	}	
	
	void print() {
		System.out.println("Stack is ");
		for(int i=0; i<=top; i++) {
			System.out.println(a[i]);
		}
	}

	@Override
	public void push() {
		// TODO Auto-generated method stub
		
	}	
}

public class app4 {
    public static void main(String[] args) {
        dynamicstack ds= new dynamicstack(2);
        
		ds.push(3);
		ds.push(90);
		ds.push(23);
		ds.push(98);
		ds.push(12);
		ds.pop();
		ds.push(123);
		ds.print();
    }

}

