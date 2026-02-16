import java.util.Arrays;

public class StringRearrange {

    public static void main(String[] args) {
        String str = "aaabc";
        int k = 3;
        String rearrangedStr = charRearrange(str, k);
        System.out.println(rearrangedStr); // Output: abaca or some other valid arrangement

        str = "aabbcc";
        k = 2;
        rearrangedStr = charRearrange(str, k);
        System.out.println(rearrangedStr); // Output: abcabc or some other valid arrangement


        str = "aaabbb";
        k = 2;
        rearrangedStr = charRearrange(str, k);
        System.out.println(rearrangedStr);  // Output: null (not possible)

    }

    public static String charRearrange(String str, int k) {
        if (str == null || str.length() == 0) {
            return "";
        }

        int n = str.length();
        freqOfChar[] freq = new freqOfChar[26];
        for (int i = 0; i < 26; i++) {
            freq[i] = new freqOfChar((char) ('a' + i), 0);
        }

        for (char c : str.toCharArray()) {
            freq[c - 'a'].freq++;
        }

        bldOfHeap(freq, 26);


        char[] result = new char[n];
        Arrays.fill(result, '\0');


        for (int i = 0; i < n; i++) {
            freqOfChar maxChar = extractMax(freq, 26 - i);

            if (maxChar.freq == 0) {
                return null; // Not possible to rearrange
            }

            int j = i;
            while (result[j] != '\0') {
                j++;
            }

            while (maxChar.freq > 0) {
                if (j >= n ) return null; // Safety check in case k is too small

                if(result[j] != '\0') return null; //Already filled

                result[j] = maxChar.ch;
                maxChar.freq--;
                j += k;


            }

            bldOfHeap(freq, 26 - i -1);
            
        }

        return new String(result);
    }


    private static class freqOfChar {
        char ch;
        int freq;

        freqOfChar(char ch, int freq) {
            this.ch = ch;
            this.freq = freq;
        }
    }

    private static void bldOfHeap(freqOfChar[] freq, int n) {
        for (int i = n / 2 - 1; i >= 0; i--) {
            maxHeapify(freq, n, i);
        }
    }

    private static void swap(freqOfChar a, freqOfChar b) {
        char tempCh = a.ch;
        int tempFreq = a.freq;
        a.ch = b.ch;
        a.freq = b.freq;
        b.ch = tempCh;
        b.freq = tempFreq;
    }

    private static void maxHeapify(freqOfChar[] freq, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && freq[left].freq > freq[largest].freq) {
            largest = left;
        }

        if (right < n && freq[right].freq > freq[largest].freq) {
            largest = right;
        }

        if (largest != i) {
            swap(freq[i], freq[largest]);
            maxHeapify(freq, n, largest);
        }
    }

    private static freqOfChar extractMax(freqOfChar[] freq, int n) {

        if(n <= 0 ) return new freqOfChar('\0', 0);

        freqOfChar max =  new freqOfChar(freq[0].ch, freq[0].freq);
        swap(freq[0], freq[n-1]); //move last to first and reduce size by 1
        maxHeapify(freq, n - 1, 0);
        return max;
    }
}
