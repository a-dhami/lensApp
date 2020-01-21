package ca.assignment1.model;


public class DOFCalculator {

    private double calcHyperfocal(int focalLength, double aperture, double COC)
    {
        return Math.pow(focalLength, 2) / (aperture * COC);
    }


    private double[] calcDOF(int focalLength, double aperture, double distance, double COC) {
        double hyperFocal = calcHyperfocal(focalLength, aperture, COC);
        double nearFocal = ((hyperFocal * distance) / (hyperFocal + (distance - focalLength));

        double farFocal;
        if(distance > hyperFocal) {
            farFocal = Double.POSITIVE_INFINITY;
        }
        else {
            farFocal = ((hyperFocal * distance) / (hyperFocal - (distance - focalLength)));
        }

        double depthOfField = (farFocal - nearFocal);

        return new double[] {nearFocal, farFocal, depthOfField, hyperFocal};

    }
}
