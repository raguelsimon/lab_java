class Test {
    Interface A{
       int i = 10;
       void display();
    }

    class B implements A {
        int j=20;
        public void display(){
            System.out.println("Hello");
        }
    }
    
    System public static main(){
        B b = new B();
        b.display();
            
        System.out.println(b.i);
        System.out.println(b.j);
    }
}
