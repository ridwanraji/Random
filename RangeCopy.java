/**
 * Author: Ridwan Raji
 * Date: January 31, 2018
 */
public class RangeCopy {

    /**
     * A functions that copies a range of elements in an array to a new location
     * @param A An array of integers
     * @param from Position in the array element should be copied from
     * @param rangeOf range of elements to be copied
     * @param to Position in the array element should be copied to
     */
    static void rangeCopy(int A [], int from, int rangeOf, int to){

        // When from is less than to
        if(from < to){
            int totalRange = from + rangeOf;
            if(totalRange <= A.length && (to + rangeOf) <= A.length){
                for(; from < totalRange; from +=1, to += 1){
                    A[to] = A[from];
                }
            }

            else System.out.println("Cannot copy a range of " + rangeOf + " elements from " + from + " to " + to);
        }

        // When from is greater than to
        else if(from > to){
            int totalRange = from +  rangeOf;
            if(totalRange <= A.length && rangeOf <= from){
                for(; from < totalRange; from +=1, to +=1){
                    A[to] = A[from];
                }
            }

            else System.out.println("Cannot copy a range of " + rangeOf + " elements from " + from + " to " + to);
        }
    }


    public static void main(String [] args){

        /**
         * Copying between locations where the ‘from’ > ‘to’
         */
        System.out.println("-----------------");
        System.out.println("Copying between locations where the ‘from’ > ‘to’");

        int A[] = new int[]{0, 1, 2, 3, 4};

        System.out.println("Starting Array");
        for(int i=0; i< A.length; i++){
            System.out.print(A[i] + " ");
        }

        System.out.println();

        System.out.println("Expected result = {0,1,4,3,4} ");
        rangeCopy(A,4,1,2);


        System.out.println("Given Result");
        for(int i=0; i< A.length; i++){
            System.out.print(A[i] + " ");
        }

        System.out.println();
        System.out.println();

        /**
         * Copying between locations where ‘from’ > 1
         */
        System.out.println("-----------------");
        System.out.println("Copying between locations where ‘from’ > 1");

        int B[] = new int[]{0, 1, 2, 3, 4};

        System.out.println("Starting Array");
        for(int i=0; i< B.length; i++){
            System.out.print(B[i] + " ");
        }

        System.out.println();

        System.out.println("Expected result = {0,1,2,3,2} ");
        rangeCopy(B,2,1,4);


        System.out.println("Given Result");
        for(int i=0; i< B.length; i++){
            System.out.print(B[i] + " ");
        }

        System.out.println();
        System.out.println();

        /**
         * Copying when endWith > 1
         */
        System.out.println("-----------------");
        System.out.println("Copying when endWith > 1");

        int C[] = new int[]{0, 1, 2, 3, 4};

        System.out.println("Starting Array");
        for(int i=0; i< C.length; i++){
            System.out.print(C[i] + " ");
        }

        System.out.println();

        System.out.println("Expected result = {0,1,0,1,4} ");
        rangeCopy(C,0,2,2);


        System.out.println("Given Result");
        for(int i=0; i< C.length; i++){
            System.out.print(C[i] + " ");
        }
    }
}
