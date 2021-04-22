public class InheritenceExamples {
    public static void main(String[] args) {
       /* circle cr = new circle();
        circle cr1 = new circle(10);
        circle cr2 = new circle(10.56);
        System.out.println(cr.area());S
        System.out.println(cr1.area());
        System.out.println(cr2.area());
        cr2.setRadius(100);
        System.out.println(cr2.area());
        cylinder cy = new cylinder();
        cylinder cy2 = new cylinder(20,30);*/

        circle cy3 = new  cylinder();
        cy3.setRadius(10);
        System.out.println( cy3.area());

         cy3 = new circle();
        cy3.setRadius(10);
        System.out.println(cy3.area());


    }
}
 class circle{
    double radius;
    circle(){
        System.out.println("parent 1");
        radius=0.0;
    }
    circle(int radius){
        System.out.println("parent 2");
        this.radius = radius;
    }
    circle(double radius) {
            System.out.println("parent 3");
        this.radius= radius;

    }

     public void setRadius(double radius) {
         this.radius = radius;
     }

     public double getRadius() {
         return radius;
     }

     public double area(){
        return(Math.PI* this.radius*this.radius);
    }



}
 class cylinder extends circle{
    int height;
     cylinder(){
         System.out.println("in the child");
         height = 0;

   }
   cylinder(int radius,int height){
         super(radius);
         System.out.println("in the child2");
         this.height =height;
   }

     public void setHeight(int height) {
         this.height = height;
     }

     public int getHeight() {
         return height;
     }
     public double volume(){
         double volume = Math.PI*super.radius*super.radius*this.height;
         return volume;
     }

     @Override
     public double area() {
         System.out.println("in Cylinder class");
         return super.area();
     }
 }
