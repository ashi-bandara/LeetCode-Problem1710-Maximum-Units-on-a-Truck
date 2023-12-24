import java.util.Arrays;

class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));
        int maxUnits = 0;
        int remainingSpace = truckSize;

        for (int i = 0; i < boxTypes.length && remainingSpace > 0; i++) {
            int currentNoOfBoxes = boxTypes[i][0];
            int unitsPerBox = boxTypes[i][1];

            if(boxTypes[i][0]<remainingSpace){
                maxUnits = maxUnits + currentNoOfBoxes*unitsPerBox;
                remainingSpace = remainingSpace - currentNoOfBoxes;
            }
            else if(boxTypes[i][0]>=remainingSpace){
                maxUnits = maxUnits + remainingSpace*unitsPerBox;
                remainingSpace = 0;
            }
        }
        return maxUnits;
    }
}