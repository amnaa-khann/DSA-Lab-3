class d {
    public void log(int[] numbers, String[] names) {
        for (int i : numbers) {
            System.out.print(" " + i);
        }
        for (String j : names) {
            System.out.print(" " + j);
        }
    }
    public static void main(String[] args) {
        d demo = new d();
        int[] numbers = {1, 2, 3, 4};
        String[] names = {"Amna", "Khan", "Maryam", "Pagal"};
        demo.log(numbers, names);
    }
}