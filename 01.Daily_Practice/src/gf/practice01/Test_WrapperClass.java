package gf.practice01;

public class Test_WrapperClass {
	public static void main(String[] args) {
		
		Number num = new Number() {
			
			@Override
			public long longValue() {
				return 0;
			}
			
			@Override
			public int intValue() {
				return 0;
			}
			
			@Override
			public float floatValue() {
				return 0;
			}
			
			@Override
			public double doubleValue() {
				return 0;
			}
		}; 
	}
}
