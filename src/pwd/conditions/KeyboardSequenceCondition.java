package pwd.conditions;

import pwd.StringUtils;

/**
 * Created by diogomartins on 5/12/15.
 */
public class KeyboardSequenceCondition extends PasswordStrengthCondition {
    @Override
    public int countOcurrences(String password) {
        int total = 0;
        if ("abcdefghijklmnopqrstuvwxyz".indexOf(password) > 0 || "ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(password) > 0) {
            total--;
        }
        if ("qwertyuiop".indexOf(password) > 0 || "asdfghjkl".indexOf(password) > 0 || "zxcvbnm".indexOf(password) > 0) {
            total--;
        }
        if (StringUtils.isNumeric(password) && ("01234567890".indexOf(password) > 0 || "09876543210".indexOf(password) > 0)) {
            total--;
        }
        return total;
    }
}
