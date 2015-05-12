package pwd.conditions;

/**
 * Created by diogomartins on 5/12/15.
 */
public class HasDigitCondition extends PasswordStrengthCondition {
    @Override
    public int parseString(String password) {
        return this.countOccurrences(password, DIGIT);
    }
}