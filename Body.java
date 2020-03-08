public class Body{
    public double xxPos;
    public double yyPos;
    public double xxVel;
    public double yyVel;
    public double mass;
    public String imgFileName;
    public double distance;
    public double exertedForce;

    public Body(double xP, double yP, double xV, double yV, double m, String img){
        xxPos = xP;
        yyPos = yP;
        xxVel = xV;
        yyVel = yV;
        mass = m;
        imgFileName = img;
    }

    public Body (Body b){
        xxPos = b.xxPos;
        yyPos = b.yyPos;
        xxVel = b.xxVel;
        yyVel = b.yyVel;
        mass = b.mass;
        imgFileName = b.imgFileName;
    }
    
    public double calcDistance(Body b){
        distance = Math.sqrt(Math.pow((b.xxPos - this.xxPos),2) + Math.pow((b.yyPos - this.yyPos),2));
        return distance;
    }

    public double calcForceExertedBy(Body b){
        // this method should call calcDistance
        // F = G * m * m1 / calcDistance²
        double gravitationalConstant = 6.67 / Math.pow(10,11);
        exertedForce = (gravitationalConstant * this.mass * b.mass) / Math.pow(calcDistance(b),2);

        return exertedForce;

    }

}
