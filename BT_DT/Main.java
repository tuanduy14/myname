class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getPerimeter() {
        return 2 * (width + height);
    }

    public int getArea() {
        return width * height;
    }
}

public class Main {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Thieu tham so");
            return;
        }

        try {
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);

            if (x <= 0 || y <= 0) {
                System.out.println("x, y phai la so nguyen duong");
                return;
            }

            Rectangle rect = new Rectangle(x, y);

            System.out.println("Chieu rong: " + x);
            System.out.println("Chieu cao: " + y);
            System.out.println("Chu vi: " + rect.getPerimeter());
            System.out.println("Dien tich: " + rect.getArea());

        } catch (NumberFormatException e) {
            System.out.println("Khong Hop Le");
        }
    }
}
