ckage org.wikibooks.java;

public class Length {
   private double magnitude;
   private String units;

   public Length(double magnitude, String units) {
      if ((units == null) || (units.trim().length() == 0)) {
          throw new IllegalArgumentException("non-null, non-empty units required.");
      }

      this.magnitude = magnitude;
      this.units = units;
   }

   public double getMagnitude() {
      return magnitude;
   }

   public String getUnits() {
      return units;
   }
}
