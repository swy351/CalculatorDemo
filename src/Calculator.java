import java.util.ArrayList;
import java.util.Collections;

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

	

	public Double median() {
		int sizeOfInput=numbers.size();
		Collections.sort(numbers);
//		for(int i=1; i< sizeOfInput; i++)
//		{
//			for(int j=2;j<sizeOfInput;j++)
//			{
//				if(numbers.get(i)>numbers.get(j))
//				{
//					Double temp=numbers.get(i);
//					numbers.set(i, numbers.get(j));
//					numbers.set(j, temp);
//				}
//			}
//		}
		
		int medianIndex=sizeOfInput/2;
		
		System.err.println(medianIndex);
		if(numbers.size() %2==	1)
		{	
			return numbers.get(medianIndex);
		}
		else
		{
			return (numbers.get(medianIndex)+numbers.get(medianIndex-1))/2;
		}
		// TODO Auto-generated method stub
	}

}
