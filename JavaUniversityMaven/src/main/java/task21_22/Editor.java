package task21_22;

public interface Editor {
    IDocument NewFile();
    default void OpenFile(IDocument document){
        System.out.println(document.getClass().getSimpleName() + " was opened");
    }
}
