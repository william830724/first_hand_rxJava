package ch3_1;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class Ch3_1Test {

    public static void main(String[] args){
        Observable.just("Hello","World")
                .subscribe(new Observer<String>() {
                    //only one subscribe
                    @Override
                    public void onSubscribe(Disposable d) {
                        //unsubscribe
                        System.out.println("onSubscribe");
                    }

                    //loop every array param
                    @Override
                    public void onNext(String s) {
                        System.out.println("onNext " + s);
                    }

                    //if function error
                    @Override
                    public void onError(Throwable e) {
                        System.out.println("onError" + e);
                    }

                    //if function complete
                    @Override
                    public void onComplete() {
                        System.out.println("onComplete " );
                    }
                });
    }
}
