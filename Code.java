class MathOpertations{

		public  static void main(String [] args){

			int a = 10;
			int b = 30;

			MathOperations mo = new MathOperations();
			int addRes = mo.sum(a,b);
			System.out.println(addRes);

			int diffRes = mo.diff(a,b);
			System.out.println(diffRes);

			int divRes = mo.div(b,a);
			System.out.println(divRes);

		}

			public int sum(int a, int b){

				return a+b;

		}

			public int diff(int a, int b){

				return a-b;

		}

			public int div(int a, int b);

				return(b/a);
}
