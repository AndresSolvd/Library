package interfaces;

public interface IAudio {
    default String listen() {
        return " is listening ";
    }
}