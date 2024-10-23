class operations {

    int i;

    void searchnumber(int arr[], int b) {
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == b) {

                System.out.print("element found at " + i + "th index " + "and " + (i + 1) + "th postion");
            }
        }
    }

    void reverse(int arr[]) {
        for (int i = arr.length - 1; i >= 0; i--) {

            System.out.print(arr[i] + " ");
        }
    }

    void addvalue(int arr[], int size, int index, int value) {

        int newarr[] = new int[size + 1];
        for (int i = 0; i <= size; i++) {
            if (i < index) {
                newarr[i] = arr[i];
            } else if (i == index) {
                newarr[index] = value;
            } else
                newarr[i] = arr[i - 1];

        }
        System.out.println("size of array is " + newarr.length);
        for (int i = 0; i <= size; i++) {

            System.out.print(newarr[i] + " ");
        }

    }

    void delete(int arr[], int index) {
        for (i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
        for (int i = 0; i < arr.length - 1; i++) {

            System.out.print(arr[i] + " ");
        }

    }

    void deletevalue(int arr[], int value) {
        int index = 0;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == value)
                index = i;
        }
        System.out.println("index is " + index);
        for (i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;

        for (int i = 0; i < arr.length - 1; i++) {

            System.out.print(arr[i] + " ");
        }
    }

    void bsearch(int a[], int value) {
        int b = 0, mid = 0;
        int l = a.length - 1;

        while (b <= l) {
            mid = (b + l) / 2;

            if (a[mid] == value) {
                System.out.println("value found at" + mid);

            } else if (a[i] < value) {
                b = mid + 1;
            } else {
                l = mid - 1;
            }

        }
        System.out.println("value found at" + mid);
    }

    static void ascorder(int arr[]) {
        int i, j, temp;
        for (i = 0; i < arr.length - 1; i++) {
            for (j = 0; j < arr.length - i - 1; i++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }

    }
}

class Main {
    public static void main(String k[]) {
        int a[] = { 10, 20, 30, 40, 50, 60, 70 };
        int arr[] = { 10, 23, 2, 35, 21, 55 };
        int size = arr.length;

        int totalelements = size;

        System.out.println(size + "is the size of array");

        System.out.println(totalelements + " Total no. of elements");

        int i;

        for (i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
        int findnumber = 55;

        operations ob = new operations();
        // ob.searchnumber(arr, findnumber);
        // ob.reverse(arr);
        // ob.addvalue(arr, size, 4, 99);
        // ob.delete(arr, 3);
        // ob.deletevalue(arr, 23);
        // ob.bsearch(a, 50);
        ob.ascorder(arr);
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
