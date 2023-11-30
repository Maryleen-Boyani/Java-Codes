public class NorthKorea extends Korea {
    private String status;

    public NorthKorea(String status, String name, String language) {
        super(name, language);
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
