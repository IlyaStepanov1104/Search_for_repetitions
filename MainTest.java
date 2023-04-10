import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        System.out.println("Searching with edit data:");

        System.out.println("\nTest 1.");
        SearchRepetitions searchRepetitionsOne = new SearchRepetitions(new int[]{3, 2, 3, 1, 2});
        System.out.println("\tInput array: " + searchRepetitionsOne.data);
        List<Integer> answerOne = searchRepetitionsOne.search("yes");
        System.out.println("\tResult: "+ answerOne);

        System.out.println("\nTest 2.");
        SearchRepetitions searchRepetitionsTwo = new SearchRepetitions(new int[]{1, 2, 1, 2});
        System.out.println("\tInput array: " + searchRepetitionsTwo.data);
        List<Integer> answerTwo = searchRepetitionsTwo.search("yes");
        System.out.println("\tResult: "+ answerTwo);

        System.out.println("\nTest 3.");
        SearchRepetitions searchRepetitionsThree = new SearchRepetitions(new int[]{1, 1, 1});
        System.out.println("\tInput array: " + searchRepetitionsThree.data);
        List<Integer> answerThree = searchRepetitionsThree.search("yes");
        System.out.println("\tResult: "+ answerThree);


        System.out.println("\n\nSearching without edit data:");

        System.out.println("\nTest 1.");
        SearchRepetitions searchRepetitionsFour = new SearchRepetitions(new int[]{3, 2, 3, 1, 2});
        System.out.println("\tInput array: " + searchRepetitionsFour.data);
        List<Integer> answerFour = searchRepetitionsFour.search("no");
        System.out.println("\tResult: "+ answerFour);

        System.out.println("\nTest 2.");
        SearchRepetitions searchRepetitionsFive = new SearchRepetitions(new int[]{1, 2, 1, 2});
        System.out.println("\tInput array: " + searchRepetitionsFive.data);
        List<Integer> answerFive = searchRepetitionsFive.search("no");
        System.out.println("\tResult: "+ answerFive);

        System.out.println("\nTest 3.");
        SearchRepetitions searchRepetitionsSix = new SearchRepetitions(new int[]{1, 1, 1});
        System.out.println("\tInput array: " + searchRepetitionsSix.data);
        List<Integer> answerSix = searchRepetitionsSix.search("no");
        System.out.println("\tResult: "+ answerSix);
    }
}
