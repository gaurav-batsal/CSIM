 class GoodOrBed{

     public static void main(String []args){
      String s="acaa";
		
		char[]ch=s.toCharArray();
		int vowel=0;
		int constatnt=0;
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
				for(int j=i;j<i+3;j++)
				{
					if(ch[j]=='a'||ch[j]=='e'||ch[j]=='i'||ch[j]=='o'||ch[j]=='u')
					{
						vowel=0;
					}
					else
					{
						vowel=1;
						break;
					}
					
				}
				System.out.println(vowel);
				
				if(vowel==0)
				{
					System.out.println("Bad String");
					break;
				}
						
			}
			if(ch[i]!='a'||ch[i]!='e'||ch[i]!='i'||ch[i]!='o'||ch[i]!='u'||ch[i]!=' ')
			{
				for(int k=i;k<i+3;k++)
				{
					if(ch[k]!='a'||ch[k]!='e'||ch[k]!='i'||ch[k]!='o'||ch[k]!='u'||ch[k]!=' ')
					{
						constatnt=0;
					}
					else
					{
						constatnt=1;
						break;
					}
					
				}
				if(constatnt==0)
				{
					System.out.println("Bad String");
					break;
				}
		}
		
	}
	if(vowel==1&&constatnt==1)
		{
			System.out.println("Good String");
			
		}
     }
}




