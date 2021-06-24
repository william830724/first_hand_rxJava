package ch2_1;

public interface Observer {

    //when data change >> update (notify me)
    //when data change >> you'll do something
    void update(String str);
}
