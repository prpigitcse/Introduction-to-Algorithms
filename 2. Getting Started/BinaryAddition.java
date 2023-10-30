public class BinaryAddition {
    public static void main(String[] args) {
        int[] A = { 1, 0, 1, 1, 1, 1, 0, 0, 0, 1 };
        int[] B = { 1, 0, 0, 0, 1, 1, 0, 1, 0, 1 };

        int[] C = new int[A.length + 1];
        int sum, carry = 0;

        for (int i = 0; i < A.length; i++) {
            sum = A[i] + B[i] + carry;
            C[i] = sum % 2;
            carry = sum / 2;
        }

        C[A.length] = carry;

        BinaryAddition obj = new BinaryAddition();
        obj.printElements(C);
    }

    public void printElements(int[] elements) {
        StringBuilder output = new StringBuilder("[");

        for (int i = 0; i < elements.length; i++) {
            output.append(elements[i]);

            if (i < elements.length - 1) {
                output.append(", ");
            }
        }

        output.append("]");

        System.out.println(output);
    }
}
