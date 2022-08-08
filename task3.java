public class task3 {
    public static void main(String[] args) {
        String s = "  ggggggggg    j the sky is blue  ";
        System.out.println(s);
        char condition = 's';
        String word = "";
        String revString = "";
        for (int i = 0; i < s.length(); i++) {
            if (!(s.charAt(i) == ' ')) {
                condition = 'w';
                word += s.charAt(i);
            }
            if (s.charAt(i) == ' ' || i == s.length() - 1) {
                if (condition == 'w') {
                    condition = 's';
                    if (revString == "") {
                        revString = word;
                    } else {
                        revString = word + " " + revString;
                    }
                    word = "";
                }
            }
        }
        System.out.println(revString);
    }
}
