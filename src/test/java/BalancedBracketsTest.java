import org.example.BalancedParenthesis;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BalancedBracketsTest {
    //testIsBalanced_BalancedParenthesis -
    // This test will check for a balanced set of parenthesis and should return true.
    // The input string would be "((()))" and the expected output is true.
    //
    //testIsBalanced_UnbalancedParenthesis -
    // test will check for an unbalanced set of parenthesis and should return false.
    // The input string would be "(()" and the expected output is false.
    //
    //testIsBalanced_EmptyString -
    // This test will check for an empty string and should return true.
    // The input string would be "" and the expected output is true.
    //
    //testIsBalanced_OnlyOpenParenthesis -
    // This test will check for a string containing only opening parenthesis and should return false.
    // The input string would be "(" and the expected output is false.
    //
    //testIsBalanced_OnlyClosingParenthesis -
    // This test will check for a string containing only closing parenthesis and should return false.
    // The input string would be ")" and the expected output is false.

    @Test
    public void testBalanced_BalancedParenthesis(){
        assertTrue(BalancedParenthesis.isBalanced("((()))"));

    }

    @Test
    public void testIsBalanced_UnbalancedParenthesis(){
        assertFalse(BalancedParenthesis.isBalanced("(()"));
    }

    @Test
    public void testIsBalanced_EmptyString(){
        assertTrue(BalancedParenthesis.isBalanced(""));
    }

    @Test
    public void testIsBalanced_OnlyOpenParenthesis(){
        assertFalse(BalancedParenthesis.isBalanced("("));
    }

    @Test
    public void testIsBalanced_OnlyClosingParenthesis(){
        assertFalse(BalancedParenthesis.isBalanced(")"));
    }


}
