
public class StringCalculator {

	public static int add(String text){
	if( text.isEmpty()) {
		return 0;
}else if (text.contains(",")){
	
	String[] allnumbers = text.split(",");
	
	int sum =0;
	for (String number : allnumbers)
	sum+= Integer.parseInt(number);
	return sum;
	
	
	
}else{
	
	return Integer.parseInt(text);
	}

}
}