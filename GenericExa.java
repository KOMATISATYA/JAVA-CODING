class GenericExa1<T>{               
	T t;                      
	GenericExa1(T t){
		this.t = t;
	}
	public T getObject(){
		return this.t;
	}
}
class GenericExa{
	public static void main(String args[]){
		GenericExa1<Integer> obj = new GenericExa1<Integer>(26);
		System.out.println(obj.getObject());
		GenericExa1<String> obj1 = new GenericExa1<String>("Satya");
		System.out.println(obj1.getObject());
		
		

	}
}
