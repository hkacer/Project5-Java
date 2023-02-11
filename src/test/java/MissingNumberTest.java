import org.example.MissingNumber;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MissingNumberTest {


    @Test
    public void testMissingNumber_FirstMissing(){
        int[] nums ={1,2,4,5,6};
        int maxNum=5;
        int expected=1;
        int actual= MissingNumber.missingNumber(nums,maxNum);
        assertEquals(expected,actual);

    }

    @Test
    public void testMissingNumber_LastMissing(){
        int[] nums={1,2,3,4};
        int maxNum=5;
        int expected=5;
        int actual= MissingNumber.missingNumber(nums,maxNum);
        assertEquals(expected,actual);
    }

    @Test
    public void testMissingNumber_NoMissing(){
        int[] nums= {1,2,3,4,5};
        int maxNum=5;
        int expected=6;
        int actual= MissingNumber.missingNumber(nums,maxNum);
        assertEquals(expected,actual);
    }

    @Test
    public void testMissingNumber_MultipleMissing(){
        int[] nums={1,2,3,5};
        int maxNum=5;
        int expected=4;
        int actual= MissingNumber.missingNumber(nums,maxNum);
        assertEquals(expected,actual);
    }

}

