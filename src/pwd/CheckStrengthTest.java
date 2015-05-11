package pwd;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class CheckStrengthTest {
    final String[] NULL_PASSWORDS = {null, "", "      "};
    final String[] EASY_PASSWORDS = {"aaaaaaaa", "ababab", "1111111", "123456", "abcdefg", "1", "b"};
    final String[] MEDIUM_PASSWORDS = {"1dcDe#", "^DSe31"};
    final String[] STRONG_PASSWORDS = {"M38SDg9cbVcdasg", "92349SDbce@"};
    final String[] VERY_STRONG_PASSWORDS = {"AbcDef$5#@"};
    final String[] EXTREMELY_STRONG_PASSWORDS = {"Minha m@e G0sta De MiM!!!!", "uy 4897g897DS*(&DGAbn798dA g0879AGD)97dg b(AD&(G", "DAG*()uGDS)(*NbDSAGBN-u0-9ndab) jm-aD)_*ADN)_*GDA*N-g &(duds80y"};
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
    public void testMediumPasswords(){
        for(String password: MEDIUM_PASSWORDS){
            assertEquals(CheckStrength.LEVEL.MEDIUM, CheckStrength.getPasswordLevel(password));
        }
    }

    @Test
    public void testStrongPasswords(){
        for(String password: STRONG_PASSWORDS){
            assertEquals(CheckStrength.LEVEL.STRONG, CheckStrength.getPasswordLevel(password));
        }
    }

    @Test
    public void testVeryStrongPasswords(){
        for(String password: VERY_STRONG_PASSWORDS){
            assertEquals(CheckStrength.LEVEL.VERY_STRONG, CheckStrength.getPasswordLevel(password));
        }
    }

    @Test
    public void testExtremelyStrongPasswords(){
        for(String password: EXTREMELY_STRONG_PASSWORDS){
            assertEquals(CheckStrength.LEVEL.EXTREMELY_STRONG, CheckStrength.getPasswordLevel(password));
        }
    }

    @Test
    public void testDatePasswords(){
        for(String password: DATE_PASSWORDS) {
            assertEquals(CheckStrength.LEVEL.EASY, CheckStrength.getPasswordLevel(password));
        }
    }

    @Test
    public void testDictionaryPasswords(){
        for(String password: DICTIONARY_PASSWORDS) {
            assertEquals(CheckStrength.LEVEL.EASY, CheckStrength.getPasswordLevel(password));
        }
    }
}