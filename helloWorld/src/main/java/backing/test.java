package backing;

import java.util.Locale;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(String locale: Locale.getISOCountries()){

			System.out.println(new Locale("",locale).getDisplayCountry());
			System.out.println(new Locale("",locale).getCountry());
	}

}
}
