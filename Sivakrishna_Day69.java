public class Sivakrishna_Day69 {
    public static void main(String[] args) {
        triangle obj = new triangle();
        obj.equivalent();
        obj.Isosceles();
        obj.Triangle();
    }
}
// A -> B -> C This is known as Multi level Inheritance
class Equivalent {
    void equivalent() {
        System.out.println("I am an equivalent triangle");
    }
}

class isosceles extends Equivalent {
    void Isosceles() {
        System.out.println("I am an isosceles triangle");
    }
}

class triangle extends isosceles {
    void Triangle() {
        System.out.println("I am an triangle");
    }
}