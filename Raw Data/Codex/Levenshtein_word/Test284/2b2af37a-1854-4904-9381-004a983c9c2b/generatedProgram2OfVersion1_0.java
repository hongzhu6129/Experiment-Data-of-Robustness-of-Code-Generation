static int binaryproduct(int a, int b) {
    int result = 0;
    int power = 1; // Represents powers of 2

    while (b > 0) {
        if ((b & 1) == 1) { // Check if the last bit of b is 1
            result += a * power;
        }
        power <<= 1; // Equivalent to power *= 2;
        b >>= 1;      // Equivalent to b /= 2 (integer division);
    }
    return result;
}
