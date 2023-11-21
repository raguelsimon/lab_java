// Public parent class : Public child class -> Works
class A {
    public
    void display() {
        System.out.println("Hello");
    }
}

class B extends A { 
    public
    void display() {
        System.out.println("Hi");
    }

    public static void main(String[] args) {
        B obj1 = new B();
        obj1.display();
    }
}

// Protected parent class : Protected child class -> Works
class A {
    protected
    void display() {
        System.out.println("Hello");
    }
}

class B extends A { 
    protected
    void display() {
        System.out.println("Hi");
    }

    public static void main(String[] args) {
        B obj1 = new B();
        obj1.display();
    }
}


// Private parent class : Private child class -> Does not works
class A {
    private
    void display() {
        System.out.println("Hello");
    }
}

class B extends A { 
    private
    void display() {
        System.out.println("Hi");
    }

    public static void main(String[] args) {
        B obj1 = new B();
        obj1.display();
    }
}
