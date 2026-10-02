class g{
    public void log(int[] numbers) {
        for (int first : numbers) {
            for (int second : numbers) {
                for (int third : numbers) {
                    System.out.println(first + ", " + second + ", " + third);
                }
            }
        }
    }
    public static void main(String[] args) {
        g demo = new g();
        int[] arr = {1,2};
        demo.log(arr);
    }
}
//O(n^3) -> three for loops 