package pwd.conditions;

/**
 * Created by diogomartins on 5/12/15.
 */
public class HasNonAlfaCondition implements PasswordStrengthCondition {
    @Override
    public int parseString(String password) {
        if (password.length() <= 4)
            return false;

        return false;
    }
}
