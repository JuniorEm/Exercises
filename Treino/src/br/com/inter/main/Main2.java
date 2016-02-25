package br.com.inter.main;



import java.text.ParseException;

import javax.swing.text.MaskFormatter;

public class Main2 {
	
	public String formataTelefone(String tel) {
		try {
			MaskFormatter mf = new MaskFormatter("(##) #### - ####");
			mf.setValidCharacters("0123456789");
			mf.setValueContainsLiteralCharacters(false);
			return mf.valueToString(tel);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public String formataCpf(String cpf) {
		try {
			MaskFormatter mf = new MaskFormatter("###.###.###-##");
			mf.setValueContainsLiteralCharacters(false);
			return mf.valueToString(cpf); //Transforma o que foi passado como parâmetro...
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
		
		public String formatador(String value) {
			try {
				MaskFormatter mf = new MaskFormatter("##.###.###-#");
				mf.setValueContainsLiteralCharacters(false);
				System.out.println(mf.stringToValue(value));
				return new String();
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
		}
		
	}
	public static void main(String[] args) {
		String telefone = "1139067433";
		String cpf = "40124151825";
		//System.out.println("(" + telefone.substring(0, 2) + ")" + " " + telefone.substring(2, 6) + "-" + telefone.substring(6,10));
		Main2 main = new Main2();
		String bla = main.formataTelefone(telefone);
		String bla2 = main.formataCpf(cpf);
		System.out.println(bla);
		System.out.println(bla2);
		main.formatador("36.627.483-1");
	}
}
