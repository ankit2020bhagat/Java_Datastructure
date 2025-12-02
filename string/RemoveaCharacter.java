
public class RemoveaCharacter {

    public static String remove(StringBuilder str, int pos) {
        str.deleteCharAt(1);
        return str.toString();
    }

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        str.append("Ankit");
        System.out.println(remove(str, 1));

    }
}
