package pwd.conditions;

/**
 * Created by diogomartins on 5/12/15.
 */
public class HasLowercaseLetterCondition implements PasswordStrengthCondition {
    @Override
    public int parseString(String password) {
        for (Character c: password.toCharArray())
            if(Character.isLowerCase(c))
                return true;
        return false;
    }
}
