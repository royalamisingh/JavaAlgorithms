
public class Practice {

	public static void main(String[] args) {
		int val[] = { 1, 1, 2, 2, 3, 4, 4 ,5,5};
		int result = 0;
		for (int i = 0; i < val.length; i++) {
			result = result ^ val[i];
			System.out.println(result);
		}
		//System.out.println(result);
		System.out.println(new Practice().ispalindrome());
	}
	
	public boolean ispalindrome(){
		int val[]={1,3,3,3,1};
		int lenght=val.length;
		int result=0;
		for(int n=0,j=lenght-1;n<lenght;n++,j--)
		{
			if(j<n)
				break;
			result=val[n]^val[j];
			System.out.println("result:"+result);
			if(result!=0)
				return false;
		}
		return true;
	}
}
