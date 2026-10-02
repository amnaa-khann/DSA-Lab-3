/* 
big O -> describes how runtime of a program grows as the size of the program grows
Linear search -> line by line
contant time -> reach the desired index directly to fetch the data from that index
*/
class a {
    public void log(int[] numbers) {
        System.out.println(numbers[0]);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(" " + numbers[i]);
        }
    }
    public static void main(String[] args) {
        a demo = new a();
        int[] data = {10,20,30};
        demo.log(data);
        
    }
}