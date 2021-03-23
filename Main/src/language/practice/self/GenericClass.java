package language.practice.self;

public class GenericClass <T>{
	
	private T t;
	
//	public GenericClass(T t){
//		this.t = t;
//	}

	public void setGenericClass(T t) {
		this.t = t;
	}
	
	public T getGenericClass() {
		return t;
	}
	
	public static void main(String [] args) {
		GenericClass <Integer> intclassvar = new GenericClass<Integer> ();
		GenericClass <String> strclassvar = new GenericClass<String> ();
		
		intclassvar.setGenericClass(10);
		strclassvar.setGenericClass("Hello");
		
		System.out.println(intclassvar.getGenericClass());
		System.out.println(strclassvar.getGenericClass());
	}

}
