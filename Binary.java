class Binary
{
	Public static void main(string rags[]){
	int low, high, mid, key, n, i, POS=-1;
	scanner s=new Scanner(system.in);
	System.out.println("Enter n value");
		n=s.nextInt();
		int a[] = new a[n];
		system.out.println("Enter elements");
			for(i=0;i<n;i++)
				a[i]=s. next Int();
		System.out.println("Enter key value");
			key=s.nextInt();
			low=0;high=n-1;
				while(low<=high)
					{
						mid = (low + high)/2;
						if(a[mid]==key)
							{
								POS=mid;
								break;
							}
							else
							{
								if(a[mid]<key)
								low=mid+1;
								else
									high=mid-1;
							}
					}
						if(POS==-1)
							System.out.println("Key not found");
						else
							System.out.println ("Key value"+key+"at position"+mid);
					
				}
}

