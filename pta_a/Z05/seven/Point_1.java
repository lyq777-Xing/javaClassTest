package Z05.seven;

/**
 * @author lyq
 * @time 2023/12/15 20:01
 */
import java.util.Scanner;

public class Point_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x=input.nextInt();
        int y=input.nextInt();
        int z=input.nextInt();
        Point3D p3d=new Point3D(x,y,z);
        System.out.println("Point3D("+p3d.getX()+","+p3d.getY()+","+p3d.getZ()+")");
    }
}

class Point {
    private int x;
    private int y;

    public Point(int x,int y)
    {
        this.x=x;
        this.y=y;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }
}

class Point3D extends Point {
    //此处添加代码
    private int z;

    public Point3D(int x, int y) {
        super(x, y);
    }

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
}

