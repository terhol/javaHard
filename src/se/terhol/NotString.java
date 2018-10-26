package se.terhol;

class NotString {
    private static boolean beginByNot(String str) {
        return str.length() >= 3 && "not".equals(str.substring(0, 3));
    }

    static String notString(String str) {
        if (beginByNot(str)) {
            return str;
        } else {
            return "not " + str;
        }
    }
}
