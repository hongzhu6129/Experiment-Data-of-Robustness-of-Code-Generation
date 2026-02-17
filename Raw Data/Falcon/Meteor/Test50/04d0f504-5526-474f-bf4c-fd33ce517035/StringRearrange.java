import java.util.Arrays;

public class StringRearrange {

    public static void main(String[] args) {
        String str = "aabbcc";
        int k = 2;
        String rearrangedStr = charRearrange(str, k);
        System.out.println(rearrangedStr); // Output: abcabc or acbacb etc.

        str = "aaabc";
        k = 3;
        rearrangedStr = charRearrange(str, k);
        System.out.println(rearrangedStr);  // Output: abaca

        str = "aaab";
        k = 2;
        rearrangedStr = charRearrange(str, k);
        System.out.println(rearrangedStr); // Output: "" (or indicate failure as needed)


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
            freqOfChar maxChar = extractMax(freq, 26);
            if(maxChar.freq == 0){ //not enough characters to satisfy condition
                return ""; //or indicate failure as needed
            }

            int nextIndex = i;
            while(nextIndex < n && result[nextIndex] != '\0'){
                nextIndex++;
            }

            if (nextIndex < n ) {

                result[nextIndex] = maxChar.ch;
                maxChar.freq--;

                int nextAvailableIndex = nextIndex+k;

                while(maxChar.freq>0 && nextAvailableIndex <n){
                     while(nextAvailableIndex < n && result[nextAvailableIndex] != '\0'){
                        nextAvailableIndex++;
                    }
                    if(nextAvailableIndex <n){
                       result[nextAvailableIndex] = maxChar.ch;
                       maxChar.freq--;
                       nextAvailableIndex +=k; 
                    }


                }
                bldOfHeap(freq,26); //reheapify after modifying frequencies




            }
            else{
                 return ""; // Or handle this failure case
            }
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

    private static void swap(freqOfChar f1, freqOfChar f2) {
        char tempCh = f1.ch;
        int tempFreq = f1.freq;
        f1.ch = f2.ch;
        f1.freq = f2.freq;
        f2.ch = tempCh;
        f2.freq = tempFreq;
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

        if(n<=0){
            return new freqOfChar('\0', 0);
        }
        freqOfChar max = new freqOfChar(freq[0].ch,freq[0].freq) ;


        swap(freq[0], freq[n - 1]);

        maxHeapify(freq, n - 1, 0);


        return max;
    }
}
