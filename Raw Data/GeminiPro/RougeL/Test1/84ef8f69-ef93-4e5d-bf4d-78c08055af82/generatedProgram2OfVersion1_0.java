try {
    long product = Math.multiplyExact(num1, num2);
    System.out.println("The product is: " + product);
} catch (ArithmeticException e) {
    System.out.println("Overflow occurred!");
}
