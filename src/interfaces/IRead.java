package interfaces;

public interface IRead {
    default String read() {
        return " is reading ";
    }
}
