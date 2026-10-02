class c {
    public void log(int[] numbers) {
        for (int number : numbers) {
            System.out.print(" " +number);
        }
        for (int number : numbers) {
            System.out.print(" "+number);
        }
    }
    public static void main(String[] args) {
        c demo = new c();
        int[] arr = {1,2,3,4};
        demo.log(arr);
    }
}