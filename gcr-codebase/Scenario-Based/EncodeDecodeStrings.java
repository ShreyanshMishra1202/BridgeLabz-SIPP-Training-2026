import java.util.ArrayList;
import java.util.List;

public class EncodeDecodeStrings {

    static class Codec {
        String encode(List<String> strs) {
            StringBuilder encoded = new StringBuilder();
            for (String str : strs) {
                encoded.append(str.length()).append('#').append(str);
            }
            return encoded.toString();
        }

        List<String> decode(String s) {
            List<String> result = new ArrayList<>();
            int i = 0;

            while (i < s.length()) {
                int j = i;
                while (s.charAt(j) != '#') {
                    j++;
                }

                int length = Integer.parseInt(s.substring(i, j));
                j++;
                result.add(s.substring(j, j + length));
                i = j + length;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        Codec codec = new Codec();
        List<String> input = List.of("hello", "world", "#hash", "");
        String encoded = codec.encode(input);
        System.out.println(encoded);
        System.out.println(codec.decode(encoded));
    }
}
