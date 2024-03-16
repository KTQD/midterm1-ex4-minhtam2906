public class Main {
public static void main(String[] args) {
int[] numbers = {1, 3, 5, 6, 2, 7, 8, 0, 4, 3, 9, 2, 8, 1, 0, 5, 7, 4, 6, 9, 3, 2, 1, 8, 4, 0, 6, 7, 9, 5, 3, 2, 1, 0, 8, 4, 6, 7, 9, 5, 3, 2, 1, 0, 8, 4, 6, 7, 9, 5, 3, 2, 1, 0, 8, 4, 6, 7, 9, 5, 3, 2, 1, 0, 8, 4, 6, 7, 9, 5, 3, 2, 1, 0};

SumThread thread1 = new SumThread(numbers);
thread1.start();

MaxThread thread2 = new MaxThread(numbers);
thread2.start();

try {
thread1.join();
thread2.join();
} catch (InterruptedException e) {
System.out.println("Error");
}
}
}

class SumThread extends Thread {
private int[] numbers;
private int sum;

public SumThread(int[] numbers) {
this.numbers = numbers;
this.sum = 0;
}

@Override
public void run() {
for (int num : numbers) {
sum += num;
}
System.out.println(sum);
}
}

class MaxThread extends Thread {
private int[] numbers;
private int max;

public MaxThread(int[] numbers) {
this.numbers = numbers;
this.max = Integer.MIN_VALUE;
}

@Override
public void run() {
for (int num : numbers) {
if (num > max) {
max = num;
}
}
System.out.println(max);
}
}
