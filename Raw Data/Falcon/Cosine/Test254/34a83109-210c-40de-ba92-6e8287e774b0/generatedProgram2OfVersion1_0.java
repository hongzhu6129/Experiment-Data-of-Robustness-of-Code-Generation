public static void safeSwap(int[] variables) {
    if (variables == null || variables.length < 2) {
        return;
    }
    int temp = variables[0];
    variables[0] = variables[1];
    variables[1] = temp;
}
