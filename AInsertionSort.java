public class AInsertionSort
{

    public static void main(String[] args)
    {
        Integer myNumbers[] = {0, 15, 6, 8, 2, 37};

        //Loop once for all remaining numbers in the unsorted list
        for (int i = 1; i < myNumbers.length; i++)
        {
            int rnow = myNumbers[i];
            int j = i - 1;

            //shift values to right until correct position is found
            while (j >= 0 && myNumbers[j] > rnow)
            {
                myNumbers[j + 1] = myNumbers[j];
                j = j - 1;
            }

            // insert current number into correct spot
            myNumbers[j + 1] = rnow;
        }

		//Print the contents of array after sorting completed
        for (int k = 0; k < myNumbers.length; k++)
        {
            System.out.print(myNumbers[k] + " ");
        }
    }
}
