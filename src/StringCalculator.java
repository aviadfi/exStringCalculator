
public class StringCalculator {

	public static int add(String text){
	if( text.isEmpty()) {
		return 0;
}else if (text.contains(",")){
	
	String[] allnumbers = text.split(",");
	return Integer.parseInt(allnumbers[0]) + Integer.parseInt(allnumbers[1]);
}else{
	
	return Integer.parseInt(text);
	}

}
}