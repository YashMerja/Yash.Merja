public class Lab8_1{
	public static void main(String[] args) {
		
		try{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);

			int ans=1;
			for(int i=1;i<=b;i++){
				ans*=a;
				System.out.println(ans);
			}
		}
		catch(IllegalArgumentException e){
			System.out.println("Number are not Enter");
		}
		
	}
}