package pwd.conditions;

import pwd.StringUtils;

/**
 * Created by diogomartins on 5/12/15.
 */
public abstract class PasswordStrengthCondition {
    public static final int NUM = 1;
    public static final int SMALL_LETTER = 2;
    public static final int CAPITAL_LETTER = 3;
    public static final int OTHER_CHAR = 4;

    public abstract int parseString(String password);

    /**
     * Check character's type, includes num, capital letter, small letter and other character.
     *
     * @param c
     * @return
     */
    protected int checkCharacterType(char c) {
        if (Character.isDigit(c)) return NUM;
        if (Character.isUpperCase(c)) return CAPITAL_LETTER;
        if (Character.isLowerCase(c)) return SMALL_LETTER;
        return OTHER_CHAR;
    }

}
