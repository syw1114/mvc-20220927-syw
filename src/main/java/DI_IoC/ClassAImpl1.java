package DI_IoC;

/*
의존성이 아주 강한것을 만듬
 */

public class ClassAImpl1 implements ClassA {

    private ClassB classB;

    //생성자
    public ClassAImpl1(ClassB classB) {
        super();
        this.classB = classB;
    }

    @Override
    public void logic1() {
        System.out.println("클래스 A1의 로직1 메소드");
        classB.logic1();
    }

    @Override
    public void logic2() {
        System.out.println("클래스 A1의 로직2 메소드");
        classB.logic2();
    }

    @Override
    public void logic3() {
        System.out.println("클래스 A1의 로직3 메소드");
        classB.logic3();
    }

}
