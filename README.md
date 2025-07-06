# 2D_Array_in_Java
1. Concept

    A 2D array is a data structure that represents a matrix of rows and columns.

    Each element is identified by its row index and column index.

    Technically, a 2D array in Java is an array of arrays.

    Example visualization:

    int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
    };
    The above matrix has 3 rows and 3 columns.

2. Declaring a 2D Array

    1️⃣ Declare with size only
        int[][] arr = new int[3][4]; // 3 rows, 4 columns
    => All elements initialized to 0.
    2️⃣ Initialize with values
        int[][] arr = {
            {1, 2},
            {3, 4},
            {5, 6}
        };

3. Accessing Elements

    Use row and column indices:
    arr[1][0] = 99; // Assign 99 to the element at row 1, column 0
    int x = arr[2][1]; // Retrieve the value at row 2, column 1

    Note: Indices start from 0.

4. Iterating Over a 2D Array

    Typically using nested loops:
        for (int i = 0; i < arr.length; i++) {           // Iterate rows
            for (int j = 0; j < arr[i].length; j++) {     // Iterate columns
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

5. Real-world Applications
    2D arrays are commonly used to:

    Store numerical matrices (e.g., grades, tables)

    Process images (each pixel is an element)

    Represent boards in games

6. Important Notes
    ✅ You can create jagged arrays (arrays with different column lengths):

        int[][] jagged = new int[3][];
        jagged[0] = new int[2];
        jagged[1] = new int[4];
        jagged[2] = new int[1];
    => Row 0 has 2 columns, row 1 has 4 columns, etc.

    ✅ In Java, arrays have fixed sizes.

    ✅ Accessing indices out of bounds will throw ArrayIndexOutOfBoundsException.