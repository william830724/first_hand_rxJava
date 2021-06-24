package ch2_4;

import ch2_3.Weather;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Ch2_4Test {

    //can change lamda function
    //source code >>  interface and one function
//    Runnable runnable = new Runnable() {
//        @Override
//        public void run() {
//            //lamda only care input  and body
//        }
//    };

//    () >> input
//    {} >> body
//    Runnable runnable1 = () -> {};

    public static void main(String[] args){
        List<Weather> weathers = new ArrayList<>();

        weathers.add(new Weather("中山區",28,0.5));
        weathers.add(new Weather("信義區",30,0.1));
        weathers.add(new Weather("大安區",29,0.9));


        weathers.stream()
                //if input only one para you can change to lamda
                //in return or body only one you can change to lamda ;
                .filter( (weather) -> weather.getLocation().equals("中山區"))
                .forEach((weather) -> System.out.println(weather.toString()));
    }
}
