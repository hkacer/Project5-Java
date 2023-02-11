import org.example.MissingNumber;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class MissingNumberPerformanceTest {

    private int[] testArray;
    private int maxNum;

    @Test
    public void testSolution1_Performance() {
        testArray = new int[] {1, 2, 3, 4, 5, 6, 7, 9};
        maxNum = 9;
        long startTime = System.currentTimeMillis();
        int missingNum = MissingNumber.solution1(testArray);
        long endTime = System.currentTimeMillis();
        long timeTaken = endTime - startTime;
        System.out.println("Time taken by solution 1: " + timeTaken + "ms");
        assertTrue(missingNum == 8);
    }

    @Test
    public void testSolution2_Performance() {
        testArray = new int[] {1, 2, 3, 4, 5, 6, 7, 9};
        maxNum = 9;
        long startTime = System.currentTimeMillis();
        int missingNum = MissingNumber.solution2(testArray);
        long endTime = System.currentTimeMillis();
        long timeTaken = endTime - startTime;
        System.out.println("Time taken by solution 2: " + timeTaken + "ms");
        assertTrue(missingNum == 8);
    }

    @Test
    public void testSolution3_Performance() {
        testArray = new int[] {1, 2, 3, 4, 5, 6, 7, 9};
        maxNum = 9;
        long startTime = System.currentTimeMillis();
        int missingNum = MissingNumber.solution3(testArray);
        long endTime = System.currentTimeMillis();
        long timeTaken = endTime - startTime;
        System.out.println("Time taken by solution 3: " + timeTaken + "ms");
        assertTrue(missingNum == 8);
    }
}

