public interface AdminObserverble {
    public void addObserver(StudentObserver studentObserver);
    public void removeObserver(StudentObserver studentObserver);

    public void notifyObserver();
}
