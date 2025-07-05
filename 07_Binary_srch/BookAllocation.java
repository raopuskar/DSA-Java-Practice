import java.util.*;
//This same code can be used for painting fence problem, allocating minimum pages to students, etc.
//just understand the logic and change the isPossible function accordingly.

public class bookAllocation {
    // Function to check if allocation is possible with given maxPages
    public static boolean isPossible(int[] books, int students, int maxPages) {
        int countStudents = 1;
        int pagesSum = 0;

        for (int i = 0; i < books.length; i++) {
            if (books[i] > maxPages) {
                return false; // A single book has more pages than maxPages → not possible
            }

            if (pagesSum + books[i] > maxPages) {    //eg:       1-> 25+46+28 > 110
                countStudents++;                                 // Need to allocate to a new student 2 -> 49+24 <= 110
                pagesSum = books[i];                             //but there are 4 students and we can only allocate 2 students so not possible
                                                                 // high = mid - 1; // try for better (smaller max)
                if (countStudents > students) {
                    return false;
                }
            } else {
                pagesSum += books[i];
            }
        }

        return true;
    }

    // Function to find minimum number of pages
    public static int findPages(int[] books, int students) {
        if (books.length < students) return -1; // Not enough books                     eg:  {25,46,28,49,24}  m=4

        int low = Arrays.stream(books).max().getAsInt(); // max value in array            low = 49-> max of array
        int high = Arrays.stream(books).sum(); // total sum of pages                      high = 172 -> sum(Array)
        int result = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;               //mid = 110

            if (isPossible(books, students, mid)) {
                result = mid;
                high = mid - 1; // try for better (smaller max)
            } else {
                low = mid + 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        int[] books = new int[n];

        System.out.println("Enter the number of pages in each book:");
        for (int i = 0; i < n; i++) {
            books[i] = sc.nextInt();
        }

        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        int minPages = findPages(books, students);
        System.out.println("Minimum number of pages assigned to a student: " + minPages);

        sc.close();
    }
}
