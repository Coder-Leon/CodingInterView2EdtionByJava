public class Code03_FindDuplicationNoEdit {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 5, 4, 3, 2, 6, 7};
        int result = findDuplicationNoEdit(numbers, numbers.length);
        switch (result) {
            case -1:
                System.out.println("ERROR");
                break;
            case -2:
                System.out.println("Exception");
                break;
            default:
                System.out.println(result);
        }
    }

    public static int findDuplicationNoEdit(int[] numbers, int length){
        if (numbers == null || length <= 0) {
            return -1;
        }
        for (int i = 0; i < length; i++) {
            if (numbers[i] < 1 || numbers[i] >= length) {
                return -1;
            }
        }

        int start = 1;
        int end = length - 1;
        while (end >= start) {
            int middle = ((end - start) >> 1) + start;
            int count = getCount(numbers, length, start, middle);
            if (end == start) {
                if (count > 1) {
                    return start;
                } else {
                    break;
                }
            }
            if (count > (middle - start + 1)) {
                end = middle;
            } else {
                start = middle + 1;
            }
        }



        return -2;
    }

    public static int getCount(int[] numbers, int length, int start, int end) {
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (numbers[i] >= start && numbers[i] <= end) {
                count++;
            }
        }

        return count;
    }
}
