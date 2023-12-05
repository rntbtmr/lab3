package lab3;

public class Point {
    private int x,y,z;
    String name;

    public Point (int x, int y, int z, String name) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.name = name;
    }

    public void printPoint() {
        System.out.println(name + ":" + x + "," + y + "," + z);
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public void setZ(int z)
    {
        this.z = z;
    }

    public String getName()
    {
        return this.name;
    }

    public int getX()
    {
        return this.x;
    }

    public int getY()
    {
        return this.y;
    }

    public int getZ()
    {
        return this.z;
    }
}