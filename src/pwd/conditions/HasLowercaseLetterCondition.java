package pwd.conditions;

/**
 * Created by diogomartins on 5/12/15.
 */
public class HasLowercaseLetterCondition extends PasswordStrengthCondition {
    @Override
    public int countOcurrences(String password) {
        return this.countOccurrences(password, SMALL_LETTER);
    }
}
