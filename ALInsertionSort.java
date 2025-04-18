import java.util.ArrayList;

public class ALInsertionSort
{

    public static void main(String[] args)
    {
    	Integer myNumbers[] = {0, 15, 6, 8, 2, 37};
    	ArrayList<Integer> sorted = new ArrayList<Integer>();
    	boolean inserted=false;

		//Add the first number to the array list
		sorted.add(myNumbers[0]);
		//Loop once for all of the remaining numbers in the unsorted list
			for(int i=1; i< myNumbers.length; i++)
			{
				inserted = false;
			
			//Check with each of the numbers in the sorted list
			for (int j = 0; j<sorted.size(); j++)
			{
				//If this number is less than one in the sorted list,
				//insert it there
				
					if (!inserted && myNumbers[i] < sorted.get(j))
					{
						sorted.add(j, myNumbers[i]);
						inserted = true;
					}
				}

			//If it was not inserted, stick it on the end.
				if(!inserted)
				{
				sorted.add(myNumbers[i]);
				}
			}
		//End Loop for unsorted list

		System.out.println(sorted);

		//Move the data back to the array
		for(int i=0; i< myNumbers.length; i++)
		{
			myNumbers[i] = sorted.get(i);
		}
		//Print the contents of the array
		for(int i=0; i< myNumbers.length; i++)
		{
			System.out.print(myNumbers[i] + "");
		}
    }


}
