public interface IGeneric <T> {
    int size();
    int getCapacity();
    void add(T data);
    T get(int index);
    T remove(int index);
    T set(int index, T data);
    String toString();
    int indexOf(T data);
    int lastIndexOf(T data);
    boolean isEmpty();
    T[] toArray();
    void clear();
    Generic<T> subList(int start, int finish);
    boolean contains(T data);
}
