class xyz {
    public int[] doubleAll(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] *= 2;
        }
        return numbers;
    }
    public static void main(String[] args) {
        xyz demo = new xyz();
        int[] array = {1, 2, 3};
        demo.doubleAll(array);
        System.out.println(java.util.Arrays.toString(array));
    }
}

/*
class xyz {
    public int[] doubleAll(int[] numbers) {
    int[] result = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            result[i] = numbers[i]*2;
        }
        return result;
    }
    public static void main(String[] args) {
        xyz demo = new xyz();
        int[] array = {1, 2, 3};
        int[] result = demo.doubleAll(array)
        System.out.println("Input: "+java.util.Arrays.toString(array));
        System.out.println("Output: "+java.util.Arrays.toString(result));
    }
}
 */