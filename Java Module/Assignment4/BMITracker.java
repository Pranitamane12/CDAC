package Ass4_3example;

public class BMITracker {
	
		private float weight;
		private float height;
		static float bmi;
		public float calculateBMI() {
			bmi=weight/(weight*height);
			return bmi;
		}
		
		public BMITracker(float weight, float height) {
			this.weight = weight;
			this.height = height;
		}

		public float getWeight() {
			return weight;
		}

		public void setWeight(float weight) {
			this.weight = weight;
		}

		public float getHeight() {
			return height;
		}

		public void setHeight(float height) {
			this.height = height;
		}

		
		@Override
		public String toString() {
			return "BMI =" + calculateBMI() ;
		}
}
	
