import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.Math.abs;

/**
 * Class for task:
 * In an array of N+2 integers containing elements in the range [1, N],
 * create a class that will find any duplicate numbers.
 * Nota bene: in space complexity, the size of the output data is not considered
 * @author StepanovIlya
 */
public class SearchRepetitions {
    List<Integer> data;

    /**
     * default constructor.
     * @param data Input array of numbers
     */
    public SearchRepetitions(int[] data){
        this.data = Arrays.stream(data).boxed().collect(Collectors.toList());
    }

    /**
     * Choosing a search method
     * @param how = "yes", if you can change the original data array; "no", if you can't
     * @return {@link List} of repetitions
     */
    public List<Integer> search(String how){
        if (how.equals("yes")){
            return searchWithEdit();
        } else {
            return searchWithoutEdit();
        }
    }

    /**
     * Method search repetitions and edit original data array.
     * Time Complexity - O(n);
     * Space Complexity - O(1).
     * @return {@link List} of repetitions
     */
    private List<Integer> searchWithEdit(){
        List<Integer> answer = new ArrayList<>();
        for (Integer number : data) {
            if (data.get(abs(number)) < 0) {
                answer.add(abs(number));
            } else {
                data.set(abs(number), -data.get(abs(number)));
            }
        }
        return answer;
    }

    /**
     * Method search repetitions and don't edit original data array.
     * Time Complexity - O(n);
     * Space Complexity - O(n).
     * @return {@link List} of repetitions
     */
    private List<Integer> searchWithoutEdit(){
        List<Integer> counting = new ArrayList<>(Collections.nCopies (data.size() - 1, 0));
        List<Integer> answer = new ArrayList<>();
        for (Integer number : data) {
            counting.set(number, counting.get(number)+1);
            if (counting.get(number) > 1){
                answer.add(number);
            }
        }
        return answer;
    }
}
