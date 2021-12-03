package task21_22;

public class MusicEditor implements Editor{
    @Override
    public IDocument NewFile() {
        System.out.println(getClass().getSimpleName() + " was created");
        return new MusicDocument();
    }
}
