public class LinearEquation {
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double division;

    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public String getDistance() {
        double distance = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
        return String.format("%.2f", distance);
    }

    public String getSlope() {
        int num = (int) y2 - (int) y1;
        int denom = (int) x2 - (int) x1;
        this.division = (double) num / denom;
        if ((Math.abs(division) % 2) != 0.0) {
            return Integer.toString((int) division);
        } else if ((num < 0) || (denom < 0)) {
            return "-" + Math.abs(num) + "/" + Math.abs(denom);
        } else {
            return num + "/" + denom;
        }
}
        public double getYIntercept()
        {
            double slopePoint = division*(x1);
            double yIntercept = (y1 - slopePoint);
            return yIntercept;
        }

        public String getEquation()
        {
            if (getYIntercept() > 0)
            {
                return "y = "+ getSlope() + "x + "+ getYIntercept();
            } else
            {
                return "y = "+ getSlope() + "x - "+ Math.abs(getYIntercept());
            }

        }



}
