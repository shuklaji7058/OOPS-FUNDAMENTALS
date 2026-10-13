package UtilityClass;


//Runs the program and creates/uses objects.
public class CircleDriver {
	public static void main(String[] args) {
		Circle c1 = new Circle(5);
		System.out.println(c1.getRadius());
		System.out.println(Circles.getDiameter(c1));
		System.out.println(Circles.getCircum(c1));
		System.out.println(Circles.getArea(c1));
	}
}
/*
                 Circle
                   │
                   │
             stores data
                   │
              radius = 5
                   │
                   ▼
                c1 object
                   │
                   │ passed to
                   ▼
                Circles
            (Utility Class)
                   │
        ┌──────────┼──────────┐
        ▼          ▼          ▼
   getDiameter   getArea   getCircum
        │          │          │
        ▼          ▼          ▼
       10        78.54      31.42
 
 */