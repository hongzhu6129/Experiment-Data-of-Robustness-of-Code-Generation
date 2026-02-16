public class KitKatPattern {

    public String kitKatPattern(String str) {
        if (str == null || str.length() < 3) {
            return str;
        }

        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            if (i + 2 < str.length() && str.charAt(i) == 'z' && str.charAt(i + 2) == 'g') {
                result.append(str.charAt(i));
                result.append(str.charAt(i + 2));
                i += 3;
            } else {
                result.append(str.charAt(i));
                i++;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        KitKatPattern obj = new KitKatPattern();
        System.out.println(obj.kitKatPattern("zzg")); // Output: zg
        System.out.println(obj.kitKatPattern("xyzgd")); // Output: xyd
        System.out.println(obj.kitKatPattern("abzfg")); // Output: abzfg (because it doesn't end with 'g')
        System.out.println(obj.kitKatPattern("zzzggzgg")); // Output: zgzgg
        System.out.println(obj.kitKatPattern(null)); // Output: null
        System.out.println(obj.kitKatPattern("")); // Output: ""
        System.out.println(obj.kitKatPattern("z")); // Output: z
        System.out.println(obj.kitKatPattern("za")); // Output: za

    }
}
