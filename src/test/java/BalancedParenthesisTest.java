import org.example.BalancedParenthesis;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)

public class BalancedParenthesisTest {

    private String input;
    private boolean expected;

    private BalancedParenthesisTest(String input, boolean expected){
        this.input=input;
        this.expected=expected;

    }

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {"(())", true},
                {"(()",false},
                {"(((((((((())))))))))",true},
                {"())(",false},
                {"((()))",true},
                {"",true},
                {"(((((((((()))))))))",false}

        });
    }

    @Test
    public void testIsBalanced(){
        assertEquals(expected, BalancedParenthesis.isBalanced(input));
    }

}
