package com.wrapperclasses;
class CmdArg
{
	public static void main(String args[])
	{
		int arr[]=new int[args.length];
		for(int i=0;i<args.length;i++)
		{
			arr[i]=Integer.parseInt(args[i]);
		}
		for(int j=0;j<arr.length;j++)
		{
			for (int k=j+1;k<arr.length;k++)
			{
				if(arr[j]>arr[k])
				{
					int temp;
					temp=arr[j];
					arr[j]=arr[k];
					arr[k]=temp;
				}
			}
		}
		for(int i=0; i<arr.length;i++)
		{
			System.out.print("\t"+arr[i]);
		}
	}
}