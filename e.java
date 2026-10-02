class e {
    public void log(int[] numbers) {
        for (int first : numbers) {
            for (int second : numbers) {
            System.out.println(first + ", " + second); }
        }
    }
    public static void main(String[] args) {
        e demo = new e();
        int[] nums = {1,2,3,4};
        demo.log(nums);
    }
}
//^ time complexity for this one is o(N^2) since there is a for loop with time complexity (n) with another for loop
//with the same time complexity (n) -> overall time complexity becomes O(n^2)
//different case scenario with different data type ie String