import org.junit.Assert;
import org.junit.Test;
public class SolutionTest {

    @Test
    public void numJewelsInStonesTest() {
        Solution solution = new Solution();
        String jewels = "aA";
        String stones = "aAAbbbb";
        int expected = 3;

        int result = solution.numJewelsInStones(jewels, stones);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void maxNumberOfBalloons() {
        Solution solution = new Solution();
        String text = "loonbalxballpoon";
        int expected = 2;

        int result = solution.maxNumberOfBalloons(text);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void numIdenticalPairs() {
        Solution solution = new Solution();
        int[] numbers = {1,2,3,1,1,3};
        int expected = 4;

        int result = solution.numIdenticalPairs(numbers);

        Assert.assertEquals(expected, result);
    }
}