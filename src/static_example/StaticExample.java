package static_example;

public class StaticExample {

    public static void main(String[] args) {

        @SuppressWarnings("unused")
        ParentClass parent = new ParentClass() ;
        @SuppressWarnings("unused")
        ChildClass child = new ChildClass() ;

        System.out.println(ParentClass.PARAM);
        System.out.println(ChildClass.PARAM);

        ParentClass.PARAM = 0 ;

        System.out.println(ParentClass.PARAM);
        System.out.println(ChildClass.PARAM);

        ChildClass.PARAM = 1 ;

        System.out.println(ParentClass.PARAM);
        System.out.println(ChildClass.PARAM);
    }
}
