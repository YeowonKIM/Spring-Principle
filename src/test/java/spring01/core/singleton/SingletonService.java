package spring01.core.singleton;

public class SingletonService {

    // 1) class 레벨에 올라가기 때문에 딱 하나만 존재하게 된다.
    private static final SingletonService instance = new SingletonService();

    // 2) 조회 : 처음 실행될 때 static 영역에 SingletonService 객체를 생성해서 인스턴스의 참조를 넣어 놓눈다. -> 하나만 생성 가능
    public static SingletonService getInstance() {
        return instance;
    }

    // 3) 임의 생성 막기 : 외부에서 임의로 객체르 생성하지 못하도록 private으로 막음.
    private SingletonService() {
    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }

}
