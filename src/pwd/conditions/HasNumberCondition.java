package pwd.conditions;

/**
 * Created by diogomartins on 5/12/15.
 */
public class HasNumberCondition implements PasswordStrengthCondition {
    @Override
    public int parseString(String password) {
        return countLetter(passwd, NUM);
    }
}