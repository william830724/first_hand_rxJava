package ch2_1;

public interface Subject {
    //you interesting subject

    //you can regist this subject
    // put observer as a parame
    void registerObserver(Observer o);

    // remove this subject
    void removeObserver(Observer o);

    // when something change >> notify every observer(subscriber)
    //
    void notifyObserver(String str);
}
