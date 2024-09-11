public class findSubstringTask {


    public static String[] findSubstringInArray(String[] array, String substring) {

        int lengthOfArray = array.length;
        int lengthOfSubstring = substring.length();
        String[] result = new String[lengthOfArray];
        int resultCount = 0;

        if (lengthOfArray == 0) {
            System.out.println("Empty");
            return new String[0];
        }

        if (lengthOfSubstring == 0) {
            return array;
        }

        for (int i = 0; i < lengthOfArray; i++) {
            String item = array[i];
            int lengthOfItem = item.length();
            
            // Check only valid cases
            if (lengthOfItem < lengthOfSubstring) {
                continue;
            }

            String lowerItem = item.toLowerCase();
            String lowerSubstring = substring.toLowerCase();

            boolean found = false;
            for (int j = 0; j <= lengthOfItem - lengthOfSubstring; j++) {
                int k = 0;
                while (k < lengthOfSubstring && lowerItem.charAt(j + k) == lowerSubstring.charAt(k)) {
                    k++;
                }

                if (k == lengthOfSubstring) {
                    found = true;
                    break;
                }
            }
            
            if (found) {
                result[resultCount] = item;
                resultCount++;
            }
        }

        if (resultCount == 0) {
            System.out.println("Empty");
            return new String[0];        
        }

        // Copy the result array to the exact size
        String[] finalResult = new String[resultCount];
        System.arraycopy(result, 0, finalResult, 0, resultCount);

        return finalResult;
    }

}
