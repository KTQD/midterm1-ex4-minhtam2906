public class MultiThreadExample {
    private static int[] array = {1, 3, 5, 6, 2, 7, 8, 0, 4, 3, 9, 2, 8, 1, 0, 5, 7, 4, 6, 9, 3, 2, 1, 8, 4, 0, 6, 7, 9, 5, 3, 2, 1, 0, 8, 4, 6, 7, 9, 5, 3, 2, 1, 0, 8, 4, 6, 7, 9, 5, 3, 2, 1, 0, 8, 4, 6, 7, 9, 5, 3, 2, 1, 0, 8, 4, 6, 7, 9, 5, 3, 2, 1, 0}; // Mảng số nguyên đã cho

    public static void main(String[] args) {
        // Khởi tạo và bắt đầu các luồng
        Thread sumThread = new Thread(() -> {
            int sum = 0;
            for (int num : array) {
                sum += num;
            }
            System.out.println("Tổng các phần tử trong mảng: " + sum);
        });

        Thread maxThread = new Thread(() -> {
            int max = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
            System.out.println("Phần tử lớn nhất trong mảng: " + max);
        });

        // Bắt đầu các luồng
        sumThread.start();
        maxThread.start();
    }
}
