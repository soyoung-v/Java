package ch16.sec02;

//보통, 인터페이스 이름은 형용사로 짓는 편. (~할 수 있는)
@FunctionalInterface
public interface Workable {
    /*public abstract이 생략되어 있고 자동으로 들어가 있음.*/ void work();
}