package gf.string;

public class Test06_TitleCase {

	public static void main(String[] args) {
		
		String  str = "goOD mOrNiNg inDiA";
								//Good Morning India
		str = str.toLowerCase();
		System.out.println("Lower Case :: "+str);
		String s = "";
		boolean flag = true;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(flag) {
				s = s+Character.toUpperCase(ch);
				System.out.println(s);
				flag = false;
			}else {
				s = s+ch;
			}
			
			if(ch==' ')
				flag = true;
		}
		
		System.out.println("Title  Case :: "+s);

	}

}


/*

 package gf.string;

public class Test06_TitleCase {
    public static void main(String[] args) {
        String str = "goOD mOrNiNg inDiA"; // Good Morning India
        str = str.toLowerCase();
        System.out.println("Lowercase: " + str);

        // Convert to title case
        String titleCase = "";
        boolean capitalizeNext = true;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (capitalizeNext) {
                titleCase += Character.toUpperCase(c);
                capitalizeNext = false;
            } else {
                titleCase += c;
            }
            if (c == ' ') {
                capitalizeNext = true;
            }
        }

        System.out.println("Title Case: " + titleCase);
    }
}


 */
