import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        LinearSearch obj = new LinearSearch();
        
        System.out.println("-1 in the result indicates number not found.");


        int[] array = obj.createIntArray();
        System.out.println("Array");
        obj.printElements(array);

        obj.linearSearch(array);
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

    public int[] createIntArray() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of elements in array: ");
        int numberOfElements = scanner.nextInt();

        int[] Elements = new int[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            System.out.print("Enter the element: ");
            Elements[i] = scanner.nextInt();
        }

        return Elements;
    }

    public void linearSearch(int[] array) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number you want to search: ");
        int num = scanner.nextInt();
        System.out.println(num);
        int index = -1;

        for (int i = 0; i < array.length; i++) {
            if (num == array[i]) {
                index = i;
                System.out.println("Number " + num + " is at index " + index + ".");
                break;
            }
        }

        scanner.close();
    }
}
