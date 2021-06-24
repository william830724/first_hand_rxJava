import ch2_1.Observer;
import ch2_1.Subject;
import ch2_1.WeatherObserver;
import ch2_1.WeatherSubject;
import ch2_2.Iterator;
import ch2_2.StringArrayIterator;
import ch2_3.Weather;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {

    //ch2-3 example
    public static void main(String[] args){
        List<Weather> weathers = new ArrayList<>();

        //put the Weather in List
        weathers.add(new Weather("中山區",28,0.5));
        weathers.add(new Weather("信義區",30,0.1));
        weathers.add(new Weather("大安區",29,0.9));


        //use stream to get List Data without for loop
        weathers.stream() // get stream<Weather>
//                .skip()
                .filter(new Predicate<Weather>() { //want to filter for the array stream can offer the function
                    @Override
                    public boolean test(Weather weather) {
                        return weather.getLocation().equals("中山區");
                    }
                })
                .forEach(new Consumer<Weather>() { //use for each get Weather
                    @Override
                    public void accept(Weather weather) {
                        System.out.println(weather.toString());
                    }
                });
    }

    //ch2-2 example
//    public static void main(String[] args){
//        String[] arr = new String[]{"中山區 28度","信義區 30度"};
//
//        //string arr's Iterator
//        Iterator iterator = new StringArrayIterator(arr);
//
//        //use while as loop StringArrayIterator and println iterator's next
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//    }

    //ch2-1 example
//    public static void main(String[] args){
//        Subject weather = new WeatherSubject();
//
//        Observer user1 = new WeatherObserver("小王");
//        Observer user2 = new WeatherObserver("小理");
//
//        weather.registerObserver(user1);
//        weather.registerObserver(user2);
//
//        weather.notifyObserver("台北市中山區 目前溫度 28度 ");
//    }
}
