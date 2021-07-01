package ch3_4;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;

public class Ch3_4Test {
    public static void main(String[] args){
        //主題 (需監聽的對象 資料)
        // 可使用array 陣列 iterator 等
//        Observable.fromArray()
        Observable.just(1,2,3,4,5,6,7,8,9)
                // 操作　operator >> 官網有說明 太多了
                .filter(integer -> integer > 5)
                .map(integer -> integer * 10)
                //監聽者
                .subscribe(new Observer<Integer>() {

                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Integer o) {
                        System.out.println("onNext " + o);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                }
                //可以繼續延續下去
                );
    }
}
