package gf.collection;

import java.util.EnumSet;

enum Color {
	RED, BLUE, BLACK, YELLOW, PINK, GREEN
}

enum Course {
	CORE_JAVA, ADV_JAVA, ORACLE, HTML_CSS_JS, PYTHON 
}

enum AccType {
	SAVING, CURRENT, NRI
}

enum FoodItems {
	IDLY(30), DOSA(50), WADA(20), PURI(25), UPMA(40), BONDA(60);
	
	private double price;
	
	FoodItems(double price) {
		this.price = price;
	}
	
	public double price() {
		return price;
	}
	
}

public class Test04_Set_EnumSet {
	
	public static void main(String[] args) {
		
//		System.out.println(FoodItems.IDLY);
//		System.out.println(FoodItems.UPMA);
//		System.out.println(FoodItems.WADA);
//		System.out.println();
//		
//		FoodItems items[] = FoodItems.values();
//		System.out.println("Sno \t Name \t Price");
//		System.out.println("---------------------------");
//		for(int i=0;i<items.length;i++) {
//			System.out.print(items[i].ordinal()+1 + "\t ");
//			System.out.print(items[i].name());
//			System.out.print("\t");
//			System.out.println(items[i].price());
//		}
//		System.out.println("---------------------------");
//		
//==================================================================================		
		
		EnumSet<Color> es1 = EnumSet.noneOf(Color.class);  //here colors not display only empty list is display
		EnumSet<Color> es2 = EnumSet.allOf(Color.class);		//here all colors are displayed in named constant order
		EnumSet<Color> es3 = EnumSet.of(Color.GREEN, Color.YELLOW, Color.PINK);	//here only we write colors that's only displayed
		EnumSet<Color> es4 = EnumSet.copyOf(es3);	//here copy of all es3 colors into es4 and displayed
		EnumSet<Color> es5 = EnumSet.complementOf(es3);	//here only we not mensection colors will display 
		EnumSet<Color> es6 = EnumSet.range(Color.BLACK, Color.PINK);	//here BLACK to PINK range all colors displayed
			
		System.out.println(es1);	//[]
		System.out.println(es2);	//[RED, BLUE, BLACK, YELLOW, PINK, GREEN]
		System.out.println(es3);	//[GREE, YELLOW, PINK]
		System.out.println(es4);	//[GREE, YELLOW, PINK]
		System.out.println(es5);	//[RED, BLUE, BLACK]
		System.out.println(es6); 	//[BLACK, YELLOW, PINK]
		System.out.println();
		
		es1.add(Color.GREEN);
		es1.add(Color.PINK);
		es1.add(Color.RED);
		es1.add(Color.YELLOW);
		System.out.println(es1);	//here which colors we added those colors are displayed
	}
}
