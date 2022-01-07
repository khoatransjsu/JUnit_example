

public class TestFactorial {

		private int num;
		
		public TestFactorial (int num) {
			this.num = num;
		}
		
		public int res () {
			
			int res = 1;
			for (int i = 1; i <= this.num; i++) {
				
				res = res * i;			
			}
			
			return res;
		}
		

}
