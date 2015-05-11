package pwd;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class CheckStrengthTest {
    final String[] NULL_PASSWORDS = {null, "", "      "};
    final String[] EASY_PASSWORDS = {"123456", "abcdefg", "1", "b"};
    final String[] MEDIUM_PASSWORDS = {"123456abc", "abcdefg123"};
    final String[] STRONG_PASSWORDS = {"M38SDg9cbVcdasg", "9aADG(b90d90s0*$8GDSv"};


    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testNullPassword() throws Exception{
        for(String password: NULL_PASSWORDS) {
            thrown.expect(Exception.class);
            thrown.expectMessage("password is empty");
            CheckStrength.getPasswordLevel(password);
        }
    }

}