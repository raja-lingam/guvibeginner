class Dup
{
pubic static voi main(String args[]){
System.out.println("Enter the number of elements in the array:");
	int e=s.nextInt();
	int[] d=new int[e];
	System.out.println("Enter the elements in the array:");
	for(int i=0;i<d.length;i++)
	{
		d[i]=s.nextInt();
	}
Arrays.sort(d);

for(int i = 1; i < a.length; i++) {
    if(d[i] == d[i - 1]) {
        System.out.println("Duplicate: " +d[i]);
    }
}
}
}
