import java.util.ArrayList;

public class Calculator {
	ArrayList<Double> numbers=new ArrayList<Double>();
	
	public void add(double d) {
		numbers.add(d);
	}

	public double average() throws EmptyException {
		if(numbers.isEmpty())
		{
			throw new EmptyException();
		}
			
		Double sum=0.0;
		for(Double number:numbers)
		{
			sum+=number;
		}
		
		double result=sum/numbers.size();
		
		System.err.println(result);
		return result;
	}

}
