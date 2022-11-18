package pac_01_arrays.AnagramProblem;

public class App {
    public static void main(String[] args) {
        AnagramProblem problem = new AnagramProblem();
        String word1 = "restful";
        String word2 = "fluster";

        boolean result = problem.solve(word1.toCharArray(), word2.toCharArray());

        if(result) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}
