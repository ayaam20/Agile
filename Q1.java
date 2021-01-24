import java.util.*;
public class Q1
{
	public static void main(String args[])
	{
		Set<Integer> set = new HashSet<Integer>();
		set.add(34); 
        set.add(653); 
        set.add(12); 
        set.add(96);
		set.add(28); 
        set.add(84); 
        set.add(93); 
        set.add(372); 
 		set.add(27); 
        set.add(90);
		System.out.println("Set: " + set);	
		int minSet = Collections.min(set);
		System.out.println("Minimum of the set is: " + minSet); 
	}	
}