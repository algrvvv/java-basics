package practice.ds.easy.second;

public record Task(int id, String title) {
    public Task(int id, String title) {
        this.id = id;
        this.title = title;
    }
}
