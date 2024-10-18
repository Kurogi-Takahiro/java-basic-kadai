package kadai_026;

public class JyankenExec_Chapter26 {

	public static void main(String[] args) {
		
		Jyanken_Chapter26 jyanken = new Jyanken_Chapter26();
		
		String input = jyanken.getMyChoice();
		String randJyan = jyanken.getRandom();
		jyanken.playGame(input,randJyan);
	}

}
