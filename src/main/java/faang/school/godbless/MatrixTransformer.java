package faang.school.godbless;

@FunctionalInterface
public interface MatrixTransformer {
    Coordinates transform(int row, int column);
}