import java.util.Scanner;

class InsertionSort {
    public static void main(String[] args) {
        InsertionSort obj = new InsertionSort();
        
        int[] unsortedElements = obj.createIntArray();
        System.out.println("Unsorted Array");
        obj.printElements(unsortedElements);

        int[] sortedElementsAsc = obj.sortElementsAsc(unsortedElements);
        System.out.println("Sorted Array(Asc)");
        obj.printElements(sortedElementsAsc);

        int[] sortedElementsDesc = obj.sortElementsDesc(unsortedElements);
        System.out.println("Sorted Array(Desc)");
        obj.printElements(sortedElementsDesc);
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

        scanner.close();

        return Elements;
    }

    public int[] sortElementsAsc(int[] elements) {
        int key, j;

        for (int i = 1; i < elements.length; i++) {
            key = elements[i];
            j = i - 1;
            
            while (j >= 0 && elements[j] > key) {
                elements[j + 1] = elements[j];
                j = j - 1;
            }

            elements[j + 1] = key;
        }

        return elements;
    }

        public int[] sortElementsDesc(int[] elements) {
        int key, j;

        for (int i = 1; i < elements.length; i++) {
            key = elements[i];
            j = i - 1;
            
            while (j >= 0 && elements[j] < key) {
                elements[j + 1] = elements[j];
                j = j - 1;
            }

            elements[j + 1] = key;
        }

        return elements;
    }
}