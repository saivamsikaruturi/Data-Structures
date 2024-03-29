package Arrays.Easy;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if(numRows==0)
            return result;
        List<Integer> row = new ArrayList<>();
        row.add(1);
        result.add(row);


        List<Integer>prev = new ArrayList<>();
        prev = row;

        for(int i =1;i<numRows;i++){
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(1);
            for(int j =1;j<i;j++){
                currentRow.add(prev.get(j)+prev.get(j-1));
            }

            currentRow.add(1);
            result.add(currentRow);
            prev = currentRow;

        }
        return result;
    }
}
