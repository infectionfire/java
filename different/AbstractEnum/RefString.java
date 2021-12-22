package AbstractEnum;

import java.util.Arrays;

public class RefString {
    public static void changeString(String s) {
        s.concat(" Certified");
        s = s.concat(" Certified");
        s += " Certified";
    }
    public static void main(String[ ] args) {

        String[] strings = new String[]{"a", "b", "c"};
        int k = 0;
        for (String element : strings) {
            strings[k].concat(String.valueOf(k));
            ++k;
        }
        System.out.print(Arrays.toString(strings));
    }
}
