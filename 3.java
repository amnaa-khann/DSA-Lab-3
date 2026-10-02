class reverse {
    public void reverseArray(int[] numbers) {
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;
            left++;
            right--;
        }
    }
    public int[] reverseToNewArray(int[] numbers) {
        int[] result = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            result[i] = numbers[numbers.length - 1 - i];

        }
        return result;
    }
    public static void main(String[] args) {
        reverse demo = new reverse();
        int[] arr = {1, 2, 3, 4, 5};
        int[] result = demo.reverseToNewArray(arr);
        System.out.println(java.util.Arrays.toString(result));
    }
}