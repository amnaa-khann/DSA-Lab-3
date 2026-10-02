class b {
    //O(1+n+1) -> simplifies to O(n)
    public void log(int[] numbers) {
        System.out.println();
        for (int number : numbers) { // line 5-6 considered as (n)
            System.out.println(number);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        a demo = new a();
        int[] array = {1,2,3,4};
        demo.log(array);
    }
}
//(1+O+1) -> (2+n) 2 is a constant therefore will be neglected and final result will be O(n)
// O(1+n+1) -> O(n)