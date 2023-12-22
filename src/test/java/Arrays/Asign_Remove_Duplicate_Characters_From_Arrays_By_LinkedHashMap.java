package Arrays;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class Asign_Remove_Duplicate_Characters_From_Arrays_By_LinkedHashMap 
{
	@Test
	public void removeDuplicate()
	{
		int[]a= {5,4,4,2,5,4,2,1};
		LinkedHashMap<Integer,Integer>map=new LinkedHashMap<Integer,Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			if (map.containsKey(a[i])) 
			{
				map.put(a[i],map.get(a[i])+1);
			}
			else
			{
				map.put(a[i],1);
			}
		}
		for(Entry<Integer,Integer>m:map.entrySet())
		{
			if(m.getValue()==1)
			{
				System.out.print(m.getKey()+" "+m.getValue());
			}
		}

	}
}
