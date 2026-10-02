class abc {
    public static int sum(int[] numbers) {
        
        for (int i = 1; i < numbers.length; i++) {
            numbers[0] += numbers[i];
        }
        return numbers[0];
    }
    public static void main(String[] args) {
        int[] data = {4,8,15,16};
        System.out.println(sum(data));
    }
}