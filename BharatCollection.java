class BCollection 
{
	private Object[] arr;
	private int ecount;

	BCollection(){
		arr = new Object[5];
		ecount=0;
	}

	void add(Object obj){
		if(ecount==arr.length){
			increaselength();
		}
        
		
			arr[ecount++]=obj;
	}

	void increaselength(){
		Object[] temp = new Object[arr.length*2];
		for(int i=0;i<arr.length;i++){
			temp[i]=arr[i];
		}

		arr=temp;
	}

	public void display(){
		System.out.println("|");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}

	}
	
}

class BharatCollection
{
	public static void main(String[] args){
		BCollection col = new BCollection();
		col.add(5);
		col.add(6);
		col.add("h");
		col.add("b");
		col.add(5);
		col.add(5);
		col.add(5);
		col.add(5);
		col.add(5);
		col.add(5);
		col.display();
}
}
