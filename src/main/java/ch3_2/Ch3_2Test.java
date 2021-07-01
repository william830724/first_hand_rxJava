package ch3_2;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;

public class Ch3_2Test {
    public static void main(String[] args){
        Observable.just("10","World")
                //change the value (just)
                //use the function to change the data
                // String to Integer >> dont get error in the map
                // will in the subscribe
                .map(new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) throws Exception {

                        return Integer.valueOf(s);
                    }
                })

                //the Observer type need change
                .subscribe(new Observer<Integer>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        System.out.println("onSubscribe");
                    }

                    //onNext type need change
                    @Override
                    public void onNext(Integer s) {
                        System.out.println("onNext " + s);
                    }

                    @Override
                    public void onError(Throwable e) {
                        System.out.println("onError" + e);
                    }

                    @Override
                    public void onComplete() {
                        System.out.println("onComplete " );
                    }
                });

//        Observable.just(10)
//                .map(new Function<Integer, String>() {
//                    @Override
//                    public String apply(Integer integer) throws Exception {
//                        return integer.toString();
//                    }
//                })
//                .subscribe(new Observer<String>() {
//                               @Override
//                               public void onSubscribe(Disposable d) {
//
//                               }
//
//                               @Override
//                               public void onNext(String s) {
//
//                               }
//
//                               @Override
//                               public void onError(Throwable e) {
//
//                               }
//
//                               @Override
//                               public void onComplete() {
//
//                               }
//                           }
//                );
    }
}
