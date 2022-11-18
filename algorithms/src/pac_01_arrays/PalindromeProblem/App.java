package pac_01_arrays.PalindromeProblem;

public class App {
    public static void main(String[] args) {
        String word1 = "radar";
        String word2 = "madam";
        String word3 = "hello";
        String word4 = "raar";

        PalindromeProblem problem = new PalindromeProblem();
        System.out.println(problem.solve(word1));
        System.out.println(problem.solve(word2));
        System.out.println(problem.solve(word3));
        System.out.println(problem.solve(word4));
    }
}
