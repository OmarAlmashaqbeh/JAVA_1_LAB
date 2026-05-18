package LabSheet_Solution.PAGE_11_12.Question_1;
public class Rectangle {
    int height;
    int width;
    public Rectangle() {
        height = 1;
        width = 1;
    }
    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }
    public int getArea() {
        return height * width;
    }
}
