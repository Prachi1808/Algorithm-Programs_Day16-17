import java.util.ArrayList;
import java.util.List;

public class Main {

	 // Utility function to swap two characters in a character array
    private static void swap(char[] chars, int a, int b)
    {
        char temp = chars[a];
        chars[a] = chars[b];
        chars[b] = temp;
    }
 
    // Recursive function to generate all permutations of a string
    private static void permutations(char[] chars, int currentIndex)
    {
        if (currentIndex == chars.length - 1) {
            System.out.println(String.valueOf(chars));
        }
 
        for (int a = currentIndex; a < chars.length; a++)
        {
            swap(chars, currentIndex, a);
            permutations(chars, currentIndex + 1);
            swap(chars, currentIndex, a);
        }
    }
    
    
 
    public static void findPermutations1(String str) {
 
        // base case
        if (str == null || str.length() == 0) {
            return;
        }
 
        permutations(str.toCharArray(), 0);
    }
 
    // generate all permutations of a string in Java
    public static void main1(String[] args)
    {
        String str = "ABC";
        findPermutations1(str);
    }

//Iterative function to generate all permutations of a string in Java
// using Collections
public static void findPermutations(String str)
{
    // base case
    if (str == null || str.length() == 0) {
        return;
    }

    // create an empty ArrayList to store (partial) permutations
    List<String> partial = new ArrayList<>();

    // initialize the list with the first character of the string
    partial.add(String.valueOf(str.charAt(0)));

    // do for every character of the specified string
    for (int a = 1; a < str.length(); a++)
    {
        // consider previously constructed partial permutation one by one

        // (iterate backward to avoid ConcurrentModificationException)
        for (int b = partial.size() - 1; b >= 0 ; b--)
        {
            // remove current partial permutation from the ArrayList
            String s = partial.remove(b);

            // Insert the next character of the specified string at all
            // possible positions of current partial permutation. Then
            // insert each of these newly constructed strings in the list

            for (int k = 0; k <= s.length(); k++)
            {
                // Advice: use StringBuilder for concatenation
                partial.add(s.substring(0, k) + str.charAt(a) + s.substring(k));
            }
        }
    }

    System.out.println(partial);
}

// Iterative program to generate all permutations of a string in Java
public static void main(String[] args)
{
    String str = "ABC";
    findPermutations1(str);
}
}





