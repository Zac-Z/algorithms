package utils;

public class StringUtils {


    public static boolean isBlank(String name) {
        if (isEmpty(name) || isEmpty(name.trim())) {
            return true;
        }
        return false;
    }

    public static boolean isEmpty(String name) {
        if (null == name || name.isEmpty()) {
            return true;
        }
        return false;
    }
}
