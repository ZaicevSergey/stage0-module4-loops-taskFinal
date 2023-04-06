package school.mjc.stage0.loops.finalTask;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        if (cathetusLength <= 0) {
            return;
        }

        for (int i = 1; i <= cathetusLength; i++) {
            String line = IntStream.range(0, cathetusLength - i)
                                  .mapToObj(j -> " ")
                                  .collect(Collectors.joining())
                          + IntStream.range(0, i)
                                  .mapToObj(j -> "*")
                                  .collect(Collectors.joining());
            System.out.println(line);

        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
