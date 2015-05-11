package pwd;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class CheckStrengthTest {
    final String[] NULL_PASSWORDS = {null, "", "      "};
    final String[] EASY_PASSWORDS = {"aaaaaaaa", "1111111", "123456", "abcdefg", "1", "b"};
    final String[] MEDIUM_PASSWORDS = {"12345#6aDc", "ABFDcdef$g123"};
    final String[] STRONG_PASSWORDS = {"M38SDg9cbVcdasg", "9aADG(b90d90s0*$8GDSv"};
    final String[] VERY_STRONG_PASSWORDS = {"Minha m@e G0sta De MiM!!!!"};
    final String[] DATE_PASSWORDS = {"19871207", "871207"};
    final String[] DICTIONARY_PASSWORDS = {"password", "abc123", "iloveyou"};


    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testNullPassword() throws Exception{
        for(String password: NULL_PASSWORDS) {
            thrown.expect(IllegalArgumentException.class);
            CheckStrength.getPasswordLevel(password);
        }
    }

    @Test
    public void testEasyPasswords(){
        for(String password: EASY_PASSWORDS){
            assertEquals(CheckStrength.LEVEL.EASY,CheckStrength.getPasswordLevel(password));
        }
    }

    @Test
    public void testDatePasswords(){
        for(String password: DATE_PASSWORDS) {
            assertEquals(0, CheckStrength.checkPasswordStrength(password));
        }
    }

    @Test
    public void testDictionaryPasswords(){
        for(String password: DICTIONARY_PASSWORDS) {
            assertEquals(CheckStrength.LEVEL.EASY, CheckStrength.getPasswordLevel(password));
        }
    }
}