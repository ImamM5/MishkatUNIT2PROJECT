public class LinearEquation {
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double division;

    public LinearEquation(int x1, int y1, int x2, int y2) { // constructor
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public String getDistance() { // gets the distance using the distance formula
        double distance = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
        return String.format("%.2f", distance);
    }

    public String getSlope() {
        int num = (int) y2 - (int) y1;
        int denom = (int) x2 - (int) x1;
        this.division = (double) num / denom;
        if ((num % denom) == 0) {
            return Integer.toString((int) division); // returns the value if num/denom is a whole number
        } else if ((num < 0) || (denom < 0)) {
            return "-" + Math.abs(num) + "/" + Math.abs(denom); // adds "-" to the beginning if either num or denom are negative
        } else {
            return num + "/" + denom; // else if they're neither negative or a whole number this just returns the value as a fraction
        }
}
        public String getYIntercept()
        {
            double slopePoint = division*(x1);
            double yIntercept = (y1 - slopePoint);
            return String.format("%.2f", yIntercept);
        }

        public String getEquation()
        {
            double yIntercept= Double.parseDouble(getYIntercept());
            if ((yIntercept > 0) && (y1 != y2))
            {
                return "y = "+ getSlope() + "x + "+ getYIntercept(); // if y intercept is positive it returns the equation with a "+"
            } else if ((yIntercept < 0) && (y1 != y2))
            {
                return "y = "+ getSlope() + "x - "+ Math.abs(yIntercept); // if y intercept is negative it returns the equation with a "-"
            } else {
                return "y = "+ getYIntercept();
            }

        }

        public String getInfo()
        {
            String text = "\n----------Line Info----------";
            text+= "\nThe two points are: (" + (int)x1 +", "+ (int)y1+ ") and ("+(int)x2 +", "+(int)y2+ ")";
            text += "\nThe equation of the line between these points is "+ getEquation();
            text += "\nThe slope of this line is: "+ getSlope();
            text += "\nThe y-intercept of this line is: "+ getYIntercept();
            text += "\nThe distance between the two points is: "+ getDistance();
            text += "\n-----------------------------";
            return text;
        }

        public String getCoordinates(double newX)
        {
            double num = y2 - y1;
            double denom = x2 - x1;
            double newY= (num/denom)* newX + Double.parseDouble(getYIntercept());
            return "("+ newX+ ", "+ newY + ")";
        }



}
