package task21_22;

public interface IDocument {
    default void Save(){
        System.out.println(getClass().getSimpleName() + " was saved");
    }
}
