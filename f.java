class f {
    public void log(int[] numbers) {
        for (int num : numbers) {
            System.out.println(num);
        }
        for (int first : numbers) {
            for (int second : numbers) {
                System.out.println(first + ", " + second);
            }
        }
    }
    public static void main(String[] args) {
        f demo = new f();
        int[] array = {1,2};
        demo.log(array);
    }
}