package InheritnceExample;

public class Cars {
		public int speed ;
		private String privateVariable;
		protected String protractedVariable;
		
		
		public Cars(int startsSpeed) {
			this.speed=startsSpeed;
			System.out.println("the min Speed is "+ speed);
		}

		public void increaseSpeed() {
			speed++;
			System.out.println("Increasing the speed of car"+ speed);
		}
		public void decreaseSpeed() {
			System.out.println("Decreasing speed"+ speed--);
		}
		
		public void honk() {
			System.out.println("Thu Thu Thu");
		}
		
		public void symbol() {
		System.out.println();
		}
		
		public void rating() {
			System.out.println("Car rating in in between 1 to 5 stars * ");
			
		}
}
