public class LinearEquation {
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private int num;
    private int denom;
    private double division;

    public LinearEquation(int x1, int y1, int x2, int y2) { // constructor
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getDistance() { // gets the distance using the distance formula
        double distance = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
        return toRound(distance);
    }

    public double getSlope() {
        this.num = (int) y2 - (int) y1;
        this.denom = (int) x2 - (int) x1;
        this.division = (double) num / denom;
        return toRound(division);
    }

        public double getYIntercept()
        {
            double slopePoint = division*(x1);
            double yIntercept = (y1 - slopePoint);
            return toRound(yIntercept);
        }

        public String getSlopeForEquation()
        {
            this.num = (int) y2 - (int) y1;
            this.denom = (int) x2 - (int) x1;
            if ((num % denom) == 0) {
                return Integer.toString((int)getSlope()); // returns the value if num/denom is a whole number
            }
            else if ((num < 0) && (denom < 0) || ((num > 0) && (denom > 0)))
            {
                return Math.abs(num) + "/" + Math.abs(denom);
            }
            else
            {
                return "-" + Math.abs(num) + "/" + Math.abs(denom); // adds "-" to the beginning if either num or denom are negative
            }
        }

        public String getEquation()
        {
            if ((getYIntercept() > 0) && (y1 != y2) && (getSlope() != 1 || getSlope() != -1))
            {
                return "y = "+ getSlopeForEquation() + "x + "+ Math.abs(getYIntercept()); // if y intercept is positive it returns the equation with a "+"
            } else if ((getYIntercept() < 0) && (y1 != y2) && (getSlope() != 1 || getSlope() != -1))
            {
                return "y = "+ getSlopeForEquation() + "x - "+ Math.abs(getYIntercept()); // if y intercept is negative it returns the equation with a "-"
            } else  if ((getYIntercept() > 0) && (y1 != y2) && (getSlope() == 1))
            {
                return "y = x + "+ getYIntercept();
            } else if ((getYIntercept() > 0) && (y1 != y2) && (getSlope() == 1))
            {
                return "y = x - "+ Math.abs(getYIntercept());
            } else if ((getYIntercept() > 0) && (y1 != y2) && (getSlope() == -1))
            {
                return "y = -x + "+ getYIntercept();
            } else if ((getYIntercept() < 0) && (y1 != y2) && (getSlope() == -1))
            {
                return "y = -x - "+ Math.abs(getYIntercept());
            } else
            {
                return "y = "+ getSlopeForEquation();
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
            double newY= (num/denom)* newX + getYIntercept();
            return "("+ newX+ ", "+ newY + ")";
        }

        public double toRound(double x) //helper method to round the decimals
    {
        double scale = Math.pow(10, 2);
        return Math.round(x * scale)/ scale;
    }



}
