package factory.persistence;

public class HandlerFactory {
    public static FormatHandler createHandler(FileType ft){
        switch (ft){
            case XML:
                return new XMLHandler();
            case JSON:
                return new JSONHandler();
            case CSV:
                return new CSVHandler();
            default:
                throw new IllegalArgumentException();
        }
    }
}
