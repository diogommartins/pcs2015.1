package pwd.conditions;

/**
 * Created by diogomartins on 5/12/15.
 */
public class HasOtherCharCondition extends PasswordStrengthCondition {
    @Override
    public int countOcurrences(String password) {
        return this.countOccurrences(password, OTHER_CHAR);
    }
}
