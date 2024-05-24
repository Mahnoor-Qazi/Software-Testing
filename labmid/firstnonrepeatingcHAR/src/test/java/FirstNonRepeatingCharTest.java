import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FirstNonRepeatingCharTest {

    @Test
    public void testFirstNonRepeatingChar_RepeatingCharacter() {
        String input = "swiss";
        char expected = 's';
        char actual = FirstNonRepeatingChar.firstNonRepeatingChar(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testFirstNonRepeatingChar_NonRepeatingCharacter() {
        String input = "swiss";
        char expected = 'w';
        char actual = FirstNonRepeatingChar.firstNonRepeatingChar(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testFirstNonRepeatingChar_EmptyString() {
        String input = "";
        char expected = '\0';
        char actual = FirstNonRepeatingChar.firstNonRepeatingChar(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testFirstNonRepeatingChar_FirstUniqueCharacter() {
        String input = "swiss";
        char expected = 'w';
        char actual = FirstNonRepeatingChar.firstNonRepeatingChar(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testFirstNonRepeatingChar_FirstUniqueCharacter_Fail() {
        String input = "swiss";
        char unexpected = 'i'; // This should fail
        char actual = FirstNonRepeatingChar.firstNonRepeatingChar(input);
        assertNotEquals(unexpected, actual);
    }

    @Test
    public void testFirstNonRepeatingChar_RepeatingCharacter_Fail() {
        String input = "swiss";
        char unexpected = 'i'; // This should fail
        char actual = FirstNonRepeatingChar.firstNonRepeatingChar(input);
        assertNotEquals(unexpected, actual);
    }

    @Test
    public void testFirstNonRepeatingChar_EmptyString_Fail() {
        String input = "";
        char unexpected = 's'; // This should fail
        char actual = FirstNonRepeatingChar.firstNonRepeatingChar(input);
        assertNotEquals(unexpected, actual);
    }
}

