package interview;

public class RotateMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		rotateMatrix(a);
		int[][] b={{1,2},{3,4}};
		rotateMatrix(b);
		int[][] c={{1,2,3},{4,5,6},{7,8,9}};
		rotateMatrix(c);
	}
	public static void rotateMatrix(int[][] a){
		int mid=a.length/2;
		int[] temp=null;
		for(int i=0;i<mid;i++)
		{
			temp=a[i];
			a[i]=a[a.length-i-1];
			a[a.length-i-1]=temp;
		}
		transposeMatrix(a);
		print(a);
	}
	public static void transposeMatrix(int[][] a)
	{
		int i,j,temp=0;
		for(i=0;i<a.length;i++)
			for(j=0; j<i;j++)
			{
				if(j==i)
				{
					continue;
				}
				else
				{
					temp=a[i][j];
					a[i][j]=a[j][i];
					a[j][i]=temp;
				}
			}
	}
	public static void print(int[][] a)
	{
		for(int[] s:a)
		{
			for(int a1:s)
			{
				System.out.print(a1+" ");
			}
			System.out.println();
		}
	}
}
