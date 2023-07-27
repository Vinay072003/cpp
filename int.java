interface Shape {

    void input();

    void area();

    void perimeter();

}

class Circle implements Shape {

    int r = 0;

    double pi = 3.14, ar = 0, pr = 0;

    @Override

    public void input() {

        r = 5;

    }

    @Override

    public void area() {

        ar = pi * r * r;

        System.out.println("Area of circle :" + ar);

    }

    @Override

    public void perimeter() {

        pr = 2 * pi * r;

        System.out.println("Perimeter of circle : " + pr);

    }

}

class Rectangle extends Circle {

    int l = 0, b = 0;

    double ar, pr;

    public void input() {

        super.input();

        l = 6;

        b = 4;

    }

    public void area() {

        super.area();

        ar = l * b;

        System.out.println("Area of rectangle :" + ar);

    }

    public void perimeter() {

        super.perimeter();

        pr = 2 * (l + b);

        System.out.println("Perimeter of rectangle :" + pr);

    }

}

class Ellipse extends Rectangle {

    int a = 0, b = 0;

    double ar, pr;

    public void input() {

        super.input();

        a = 5;// length of semi major axis

        b = 8;// length of semi minor axis

    }

    public void area() {

        super.area();

        ar = pi * a * b;

        System.out.println("Area of Ellipse: " + ar);

        System.out.println();

    }

    public void perimeter() {

        super.perimeter();

        pr = pi * Math.sqrt(2 * (a * a) + (b * b));

        System.out.println("Perimeter of Ellipse :" + pr);

    }

}

 class int {

    public static void main(String[] args) {

        Ellipse obj = new Ellipse();

        obj.input();

        obj.area();

        obj.perimeter();

    }

}

	



