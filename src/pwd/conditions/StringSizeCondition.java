package pwd.conditions;

/**
 * Created by diogomartins on 5/12/15.
 */
public class StringSizeCondition implements PasswordStrengthCondition {
    @Override
    public int parseString(String password) {
        int total = 0;
        int length = password.length();

        if (length > 12){
            total++;
            if (length >= 16){
                total++;
            }
        }
        return total;
    }
}
