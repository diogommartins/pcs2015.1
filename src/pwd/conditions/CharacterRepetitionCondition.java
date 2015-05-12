package pwd.conditions;

import pwd.StringUtils;

/**
 * Created by diogomartins on 5/12/15.
 */
public class CharacterRepetitionCondition extends PasswordStrengthCondition {
    @Override
    public int countOcurrences(String password) {
        int length = password.length();
        int total = 0;

        if (length % 2 == 0) { // aaabbb
            String part1 = password.substring(0, length / 2);
            String part2 = password.substring(length / 2);
            if (part1.equals(part2))
                total++;
            if (StringUtils.isCharEqual(part1) && StringUtils.isCharEqual(part2))
                total++;
        }
        if (length % 3 == 0) { // ababab
            String part1 = password.substring(0, length / 3);
            String part2 = password.substring(length / 3, length / 3 * 2);
            String part3 = password.substring(length / 3 * 2);
            if (part1.equals(part2) && part2.equals(part3))
                total++;
        }
        return total;
    }
}
