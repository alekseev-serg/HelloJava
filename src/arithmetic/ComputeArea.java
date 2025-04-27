package arithmetic;
public class ComputeArea {
    public static void main(String[] args) {
        double radius;
        double area;

        // получить радиус круга
        radius = 20;
        // Вычислить площадь круга
        area = 3.14 * radius * radius;
        // Отобразить площадь круга
        System.out.println("Площадь круга с радиусом " + radius + " равна " + area + ".");
    }
}