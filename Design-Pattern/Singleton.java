
// volatile을 쓰는 이유 :
// CPU는 인스턴스를 할당할 때, 대체로 캐시에 먼저 담는다.
// 이 때문에 여러개의 쓰레드가 동시에 instance를 null로 인식할 수 있다.
// volatile을 쓰게 되면 캐시를 사용하지 않아 동기화 처리가 정상적으로 된다.

public class Singleton {
    private static volatile Singleton instance;

    private Singleton() {
        // private 으로 싱글톤 생성자 사용 제한
    }

    // Thread-safe 하게 하기 위해 synchronized 추가
    public static Singleton getInstance(){
        if (instance == null) {
            // instance가 null일 때만 동기화를 작동 --- 그렇지 않고 메소드 자체에 넣게 되면 너무 느리게 된다.
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
