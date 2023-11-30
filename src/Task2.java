public class Task2 {
    public static void main(String[] args) {
        String str = "Hello world";
        char [] array = str.toCharArray();
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            char temp = array[left];
            array[left] = array[right];
            array[right]  = temp;
            right--;
            left++;
        }
        System.out.println(new String(array));
    }
}
