package pac_01_arrays.PalindromeProblem;

public class PalindromeProblem {
    // it has 0(N) linear running time complexity
    public boolean solve(String str) {
        int forward = 0;
        int backward = str.length() - 1;

        while (forward < backward) {
            if(str.charAt(forward) != str.charAt(backward))
                return false;
            forward++;
            backward--;
        }
        return true;
    }

//    public boolean solve(String str) {
//        for (int i = 0; i < str.length() / 2; i++) {
//            if(str.charAt(i) != str.charAt((str.length() - 1) - i))
//                return false;
//        }
//        return true;
//    }
}
