package n3exercici1;

public class GenericClass<T> {
	
	private T t;
	
	public GenericClass() {
		this.t = null;
	}
	
	public T get() {
		return this.t;
	}
	
	public void set(T t) {
		this.t = t;
	}
	
	public static <S extends Phone> void method1(S a) {
		a.call();
	}
	
	public static <U extends Smartphone> void method2(U b) {
		b.call();
		b.takePhotos();
	}

}
