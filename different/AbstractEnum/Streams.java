package AbstractEnum;

public class Streams {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(" Java 14 ");
        sb.codePoints()
                .filter(o -> o!=' ')
                .forEach(o -> sb.append((char)o));
        System.out.println(sb);
    }
}
