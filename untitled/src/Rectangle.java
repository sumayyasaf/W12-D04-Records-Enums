// record implictly creates the following:
// 1. constructor
// 2. toString()
// 3. equals()
// 4. getters()
// an object that is an instance of a record is immutable
public record Rectangle(double length, double width) {

    static double PIE = 3.14;

//    canonical constructor
//    public Rectangle(double length, double width){
//        if(length <=0 || width <=0){
//            throw new RuntimeException("Width or Length CANNOT be less than 0");
//        }
//        this.length = length;
//        this.width = width;
//    }


//    compact contructor
    public Rectangle{
        if(length <=0 || width <=0){
            throw new RuntimeException("Width or Length CANNOT be less than 0");
        }
    }

    public static void staticMethod(){
        System.out.println("Static method");
    }


}
