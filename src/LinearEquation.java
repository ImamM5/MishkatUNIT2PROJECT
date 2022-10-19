public class LinearEquation
{
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public LinearEquation (int x1, int y1, int x2, int y2)
    {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x1;
        this.y2 = x1;
    }

    public double getDistance()
    {
        double distance = Math.sqrt((Math.pow((x2-x1), 2)) + (Math.pow((y2-y1),2)));
        return Math.round(distance);
    }

    public String getSlope()
    {
        int num = (int)y2 - (int)y1;
        int denom = (int)x2 - (int)x1;
        int division = num/denom;
        if (division%2 == 0)
        {
            return Integer.toString(division);
        }
        else
        {
            return num + "/"+ denom;
        }

    }

}
